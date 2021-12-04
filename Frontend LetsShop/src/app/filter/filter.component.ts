import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Product } from '../product';
import { ProductService } from '../product.service';
import { UserService } from '../user.service';

@Component({
  selector: 'app-filter',
  templateUrl: './filter.component.html',
  styleUrls: ['./filter.component.css']
})
export class FilterComponent implements OnInit {

  brand:string="";
  product:Product;
  product2:any;
  
  maxprice:any;
  minprice:any;
  

  constructor(private activeroute:ActivatedRoute, private pservice:ProductService,private userservice:UserService) {
    this.product=new Product();
   }
   srch:string="";
   productArray:any;
   cart:any;
   wish:any;
  ngOnInit(): void {
    this.pservice.getAllProds().subscribe(
      (data)=>{
        this.product2=data;
        console.log(data)

        
      }
    )
    this.activeroute.paramMap.subscribe(
      params=> {
          this.srch=params.get("srchkeyword") as string;
          console.log("SEARCH IS:"+this.srch);
      }     
)
   

      this.pservice.searchProduct(this.srch).subscribe
      (
        (data)=>{
          console.log(data);
            this.productArray=data;
            console.log(this.product)
        },
        
      )

  }

  Apply_Filter()
  {
    console.log("BRAND IS "+this.brand);
      this.pservice.filterProduct(this.srch,this.brand).subscribe
      (
        (data)=>{
          console.log(data);
            this.productArray=data;
        },
        (error: any)=>
        {
          console.log(error);
        }
      )


  }


  lowtohigh()
  {
    console.log("Low to high filter on "+this.brand);
      this.pservice.lowtohighfilter(this.srch,this.brand).subscribe
      (
        (data)=>{
          console.log(data);
            this.productArray=data;
        },
        (error: any)=>
        {
          console.log(error);
        }
      )

  }

  hightolow()
  {
    console.log("High to low filter on "+this.brand);
      this.pservice.hightolowfilter(this.srch,this.brand).subscribe
      (
        (data)=>{
          console.log(data);
            this.productArray=data;
        },
        (error: any)=>
        {
          console.log(error);
        }
      )

  }


  minmaxfilter()
  {
    console.log("Min value"+this.minprice);
    console.log("Max Value "+this.maxprice);
      this.pservice.MinMaxFilter(this.srch,this.brand,this.minprice ,this.maxprice).subscribe
      (
        (data)=>{
          console.log(data);
            this.productArray=data;
        },
        (error: any)=>
        {
          console.log(error);
        }
      )
  }

  AddWish(productid:number)
 {
    this.wish=localStorage.getItem("wishlistid")
    console.log(localStorage.getItem("wishlistid"));
    this.userservice.addToWishList(this.wish,productid).subscribe
    (
      (data: any)=>{
            console.log(data);
            this.productArray=data;
            if(data==1)
            {
              console.log("added")
              alert("Product Added To Wishlist");
            }
      },
      (error: any)=>
      {
          console.log(error);
      }
    )
 }

 AddCart(productid:number)
 {
  this.cart=localStorage.getItem("cartid")
  console.log(localStorage.getItem("cartid"));
  this.userservice.addToCartList(this.cart,productid).subscribe
  (
    (data: any)=>{
          console.log(data);
          this.productArray=data;
          if(data==1)
          {
            console.log("added"+productid);
            alert("Product Added To Cart");
          }
    },
    (error: any)=>
    {
        console.log(error);
    }
  )
 }

}

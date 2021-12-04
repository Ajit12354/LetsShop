import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { UserService } from '../user.service';

@Component({
  selector: 'app-showall',
  templateUrl: './showall.component.html',
  styleUrls: ['./showall.component.css']
})
export class ShowallComponent implements OnInit {

  constructor(private prodservice:ProductService,private userservice:UserService) { }
  productArray:any;
  wish:any;
  cart:any
  ngOnInit(): void {
    this.prodservice.getAllProds().subscribe
    (
      (data: any)=>{
            console.log(data);
            this.productArray=data;
            console.log(this.productArray);
      },
      (error: any)=>
      {
          console.log(error);
      }
    )
}
  // productid:any
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



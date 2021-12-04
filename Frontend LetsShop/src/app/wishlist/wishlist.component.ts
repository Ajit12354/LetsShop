import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-wishlist',
  templateUrl: './wishlist.component.html',
  styleUrls: ['./wishlist.component.css']
})
export class WishlistComponent implements OnInit {
  cart:any;
 // wishlistid:number=1
  wishMyDTO:any;
  status:boolean=false;
  popUp:boolean=false;
  message:string=""
  error:boolean=false;
  wish:any;
  constructor(private userservice: UserService ) { }

  ngOnInit(): void {

    this.wish=localStorage.getItem("wishlistid")
    console.log(localStorage.getItem("wishlistid"));  

    this.userservice.getMyWishlist(this.wish).subscribe(data=>{
      this.wishMyDTO=data;
      console.log(data);
    }
    )
  
  }
  WISHDETAIL(){
    this.userservice.getMyWishlist(this.wish).subscribe(data=>{
      this.wishMyDTO=data;
      console.log(data)
      if(this.wishMyDTO.length!=0)
      this.status=true
      console.log(this.status)
    })
  }
  addToCartF(productid:number){
    this.cart=localStorage.getItem("cartid")
    console.log(localStorage.getItem("wishlistid"));
    this.userservice.addToCartList(this.cart,productid).subscribe
    (
      (data: any)=>{
            console.log(data);
           // this.productArray=data;
            if(data==1)
            {
              console.log("added"+productid);
              alert("Product Added To Cart");
             // deleteItem(productid);
            }
      },
      (error: any)=>
      {
          console.log(error);
      }
    )
   }
      
    deleteF(wishlist: { wishlistdto: { wishlistid: number; }; }){
      this.userservice.deletewishlistById(wishlist.wishlistdto.wishlistid).subscribe(data => {
        if (data==1)
          {
            this.WISHDETAIL()
          }
          else if(data==0)
          {
            this.message="Already";
          }
          else{
            this.message="Retry";
            this.error=true;
          }
      })
    //  setTimeout(()=>{this.popUp=false,this.error=false}, 1000);
    }
  


    deleteItem(productid:number)
    {
      console.log("Hi")
      this.userservice.deleteWishItem(this.wish,productid).subscribe
      (
        (data: any)=>{
              console.log(data);
              //this.productArray=data;
              if(data==1)
              {
                console.log("ProductDeleted"+productid);
                alert("Product Deleted From Wishlist");
              }
        },
        (error: any)=>
        {
            console.log(error);
        }
      )
    }
}
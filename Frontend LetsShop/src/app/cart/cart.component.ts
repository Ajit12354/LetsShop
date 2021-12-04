
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  cart:any;

  constructor(private router:Router,private userservice:UserService) { }

  ngOnInit(): void {

    this.cart=localStorage.getItem("cartid")
    console.log(localStorage.getItem("cartid"));  

    this.userservice.getMyCart(this.cart).subscribe(data=>{
      this.cartMyDTO=data;
      console.log(data);
    }
    )
  }


status:boolean=false;
userid:number|undefined;
cartMyDTO:any
totalPrice: number = 0;
buyProductButton: boolean = false;
popUp:boolean|undefined;
message:string="";
error:boolean=false;
Object:any;


buyProductF(){

  if(this.totalPrice==0)
  {
    return;
  }
  else{
   
  console.log("in else of buy product")
  }
}

delete(cart:number){
  this.userservice.deleteCartById(cart).subscribe(data=>{
    console.log(data)
    if(data){
      this.CARTDETAIL()
    }
    else{
      this.popUp=true;
      this.message="Retry"
      this.error=true;
    }
  })
  setTimeout(()=>{this.popUp=false,this.error=false}, 1000);
}



onAddUpdateClick(cartid:number)
{
  this.userservice.updateMyCart(cartid,1)
  .subscribe((data)=>
  {
    this.CARTDETAIL()
  });
}
onMinusUpdateClick(cartid:number)
{
  this.userservice.updateMyCart(cartid,-1)
  .subscribe((data)=>
  {
    this.CARTDETAIL()
  });
}


CARTDETAIL(){
  this.userservice.getMyCart(this.cart).subscribe(data=>{
    this.cartMyDTO=data;
    console.log(data)
    this.totalPrice= 0;
    if(this.cartMyDTO.length!=0)
    this.status=true
    console.log(this.status)
    this.cartMyDTO.map((data: { productdto: { productquantity: number; productprice: number; }; cartdto: { quantity: number; }; })=>{
          if(data.productdto.productquantity!=0)
          this.totalPrice+=(data.cartdto.quantity*data.productdto.productprice)
      })
  })
}

deleteItem(productid:number){
  console.log("Hi")
  this.userservice.deleteCartItem(this.cart,productid).subscribe
  (
    (data: any)=>{
          console.log(data);
          //this.productArray=data;
          if(data==1)
          {
            console.log("ProductDeleted"+productid);
            alert("Product Deleted From Cart");
          }
    },
    (error: any)=>
    {
        console.log(error);
    }
  )

}

removePopUp(){
 // this.router.navigate(['/home']);
}
}
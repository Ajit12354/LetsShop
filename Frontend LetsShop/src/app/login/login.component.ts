import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, Validators } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
selected:string=" ";
type:string="";
  loginArray=["User","Admin","Retailer"];
  userid:number|undefined;
  password:string="";
  cartid:number|undefined;
  wishlistid:number|undefined;
  checkoutForm = this.formBuilder.group({
    email: ['',[Validators.required,Validators.email]],
    password:['',[Validators.required]]
  });
  status1:boolean|undefined
  email1:string=""
  constructor(private router: Router,private formBuilder: FormBuilder,private userservice:UserService) { }

  ngOnInit(): void {
  }

  onSubmit(): void {
    

    console.log(this.selected);
    if(this.selected=="User")
    {  
      this.email1=this.checkoutForm.value.email;
      this.password=this.checkoutForm.value.password;
      console.log(" email and Password"+this.email1+" "+this.password);
      this.userservice.validateUser(this.email1,this.password).subscribe
      (
        (data)=>{
          console.log(data);
            this.status1=data as boolean;
            if(this.status1 == true)
            {
              this.router.navigate(['home']);
            }
            else{
              
              alert("Invalid User..! Try Again.");

            }
        },
        (error)=>
        {
          console.log(error);
        }
      )
    }


    // Process checkout data here
  //this.items = this.cartService.clearCart();
    console.warn('values', this.checkoutForm.value);
    console.log(this.checkoutForm.value.email);
    this.userservice.getCartIdByEmail(this.checkoutForm.value.email).subscribe
      (
        (data)=>{
          console.log(data);
            this.cartid=data as number;
            localStorage.setItem("cartid",""+this.cartid)
        },
        (error)=>
        {
          console.log(error);
        }
      )

      this.userservice.getWishIdByEmail(this.checkoutForm.value.email).subscribe
      (
        (data)=>{
          console.log(data);
            this.wishlistid=data as number;
            localStorage.setItem("wishlistid",""+this.wishlistid)
        },
        (error)=>
        {
          console.log(error);
        }
      )
    //this.checkoutForm.reset();
     console.log(this.selected);
    if(this.selected=="User" && this.status1==true)
    {  
     this.router.navigate(['home']);
     console.log(this.selected);
     

    }
    if(this.selected=="Admin")
    {  
     this.router.navigate(['tempproduct',this.selected]);
     console.log(this.selected);
    }
    if(this.selected=="Retailer")
    {  
     this.router.navigate(['tempproduct',this.selected]);
     console.log(this.selected);
    }
  }

}


import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

checkoutForm = this.formBuilder.group({
    name: '',
    email:'',
    password:'',
    password2:''
  });
  constructor(private router: Router,private formBuilder: FormBuilder) { }

  ngOnInit(): void {
  }

  onSubmit(): void {
    // Process checkout data here
  //this.items = this.cartService.clearCart();
    console.warn('values', this.checkoutForm.value);
  }

}






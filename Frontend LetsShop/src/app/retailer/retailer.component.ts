import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { RetailerService } from '../retailer.service';
import { Retailer } from '../retailer';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Tempproduct } from '../tempproduct';
@Component({
  selector: 'app-retailer',
  templateUrl: './retailer.component.html',
  styleUrls: ['./retailer.component.css']
})
export class RetailerComponent implements OnInit {

  constructor(private rservice:RetailerService) 
  {
      this.product=new Tempproduct();
  }
  
  product:Tempproduct;

  ngOnInit(): void {
  }

  addProduct(prodForm:any)
  {
    console.log(prodForm.value);
    this.product=prodForm.value;
    this.rservice.addProductByRetailer(this.product).subscribe
    (
      (data)=>{
        console.log(data);
        if(data)
        alert("Product added!");
      },
     /* (error)=>{
        console.log(error);
      }
      */
    )
    } 
      
  }
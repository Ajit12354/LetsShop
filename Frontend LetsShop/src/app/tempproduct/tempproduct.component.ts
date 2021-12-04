import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AdminService } from '../admin.service';
import { RetailerService } from '../retailer.service';
import { Tempproduct } from '../tempproduct';

@Component({
  selector: 'app-tempproduct',
  templateUrl: './tempproduct.component.html',
  styleUrls: ['./tempproduct.component.css']
})
export class TempproductComponent implements OnInit {

  adminloggedin:boolean=false
  retailerloggedin:boolean=false
  
  constructor(private ret:RetailerService,private adm:AdminService,private activeroute:ActivatedRoute) { }

  tempprodArray:any
  logged:any
  t:Tempproduct=new Tempproduct()
  
  
displayproducts()
{
  this.ret.showproductstatus().subscribe(
    (data)=>{
      console.log(data);
      this.tempprodArray=data;
      console.log(this.tempprodArray);
      
    },
    (error)=>
    {
      console.log(error);
    }
    
  )
}

rejectbyadmin(t:Tempproduct)
{
 this.adm.rejectproduct(t).subscribe
 (
  (data)=>{
    console.log(data)
    if(data)
       alert("Product Rejected");
  },
  (error)=>
    console.log(error)
 );
 
}

acceptbyadmin(t:Tempproduct)
{
  this.adm.acceptproduct(t).subscribe
  (
    (data)=>{
      console.log(data)
      if(data)
         alert("Product Accepted")
    },
    (error)=>
      console.log(error)
  );
}

  ngOnInit(): void 
  {
    this.activeroute.paramMap.subscribe(
      params=> {
          this.logged=params.get("id") as string;
          console.log("Logged In :"+this.logged);
      } 
    )   
    if(this.logged=="Admin")
    {
      this.adminloggedin=true;
      this.retailerloggedin=false;
      
    }
    else
    {
      this.retailerloggedin=true;
      this.adminloggedin=false;
    }
    
  }

}

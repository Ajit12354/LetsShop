import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { Retailer } from '../retailer';


@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  constructor(private retservice:AdminService) { }
ret:Retailer=new Retailer()


addretailer(addretailerform:any)
{
  this.ret=addretailerform.value
  this.retservice.addretailer(this.ret).subscribe
  (
    (data)=>{
      console.log(data)
      if(data)
         alert("Retailer Added");
    },
    (error)=>
      console.log(error)
  )

}

  ngOnInit(): void {
  }

}

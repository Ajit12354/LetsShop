import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { RetailerService } from '../retailer.service';
import { Tempproduct } from '../tempproduct';

@Component({
  selector: 'app-updateproduct',
  templateUrl: './updateproduct.component.html',
  styleUrls: ['./updateproduct.component.css']
})
export class UpdateproductComponent implements OnInit {

  tp:Tempproduct
  constructor(private rser:RetailerService,private ar:ActivatedRoute) { 
   this.tp=new Tempproduct()
  }

  id:any
  updateProduct(prodForm:any)
  {
    this.tp=prodForm.value
    console.log(this.tp)
    this.rser.updateproduct(this.tp).subscribe
    (
      (data)=>{
        console.log(data)
        if(data)
          alert("Product Updated")
      },
      (error)=>
      {
        console.log(error)
      }
    )
  }

  ngOnInit(): void {
    this.ar.paramMap.subscribe(
      params=>{
        this.id=params.get("tempproductid") as string
        console.log(this.id)

      }
    )
    this.rser.searchtempproduct(this.id).subscribe
    (
      (data)=>{
        this.tp=data as Tempproduct
        console.log(this.tp)
      }
    )
  }

}

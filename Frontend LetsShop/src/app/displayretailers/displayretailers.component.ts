import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';


@Component({
  selector: 'app-displayretailers',
  templateUrl: './displayretailers.component.html',
  styleUrls: ['./displayretailers.component.css']
})
export class DisplayretailersComponent implements OnInit {

  constructor(private ret:AdminService) { }
  retArray:any

  ngOnInit(): void {

    this.ret.getretailer().subscribe(
      (data)=>{
        console.log(data);
        this.retArray=data;
        console.log(this.retArray);
      },
      (error)=>
      {
        console.log(error);
      }
      
    )
  }

}

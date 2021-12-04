import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Retailer } from './retailer';
import { Tempproduct } from './tempproduct';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  baseUrl="http://localhost:8087/MyKart/rest";

  tempprodArray=new Array<Tempproduct>()
  retailerArray=new Array<Retailer>()

  constructor(private http:HttpClient) { }

  addretailer(ret:Retailer)
  {
    return this.http.post(this.baseUrl+"/addretailers",ret);
  }
  getretailer()
  {
    return this.http.get(this.baseUrl+"/showretailers")
  }
  rejectproduct(obj:Tempproduct)
  {
    return this.http.put(this.baseUrl+"/rejectproduct",obj);
  }
  acceptproduct(obj:Tempproduct)
  {
    return this.http.post(this.baseUrl+"/acceptproduct",obj);
  }
}

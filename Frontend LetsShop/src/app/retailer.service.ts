import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from './product';
import { Retailer } from './retailer';
import { Tempproduct } from './tempproduct';

@Injectable({
  providedIn: 'root'
})
export class RetailerService {

  
  baseUrl="http://localhost:8087/MyKart/rest";

  tempprodArray=new Array<Tempproduct>()
  retailerArray=new Array<Retailer>()
  constructor(private http:HttpClient) { }

  showproductstatus()
  {
     return this.http.get(this.baseUrl+"/productstatus");
  }
  addProductByRetailer(product:Tempproduct)
  {
     return this.http.post(this.baseUrl+"/productsbyretailer",product);
  }
  searchtempproduct(id:number)
  {
    return this.http.get(this.baseUrl+"/searchtempproducts/"+id)
  }
  updateproduct(product:Tempproduct)
  {
    return this.http.put(this.baseUrl+"/updateproductsbyretailer",product)
  }

}

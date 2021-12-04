import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  baseUrl="http://localhost:8087/MyKart/rest";

  constructor(private http:HttpClient) 
  { }
 
  getAllProds()
  {
     return this.http.get(this.baseUrl+"/Product");
  }


  searchProduct(searchkeyword:string)
  {
     return this.http.get(this.baseUrl+"/Product/search/"+searchkeyword);
  }

  filterProduct(search:string , brand:string)
  {
    return this.http.get(this.baseUrl+"/Product/search/"+search+"/filter/"+brand)
  }

  lowtohighfilter(search:string, brand:string)
  {
    return this.http.get(this.baseUrl+"/Product/search/"+search+"/filter/"+brand+"/sort1")
  }

  hightolowfilter(search:string , brand:string)
  {
    return this.http.get(this.baseUrl+"/Product/search/"+search+"/filter/"+brand+"/sort2")
  }

  MinMaxFilter(search:string, brand:string, min:number, max:number)
  {
    return this.http.get(this.baseUrl+"/Product/search/"+search+"/filter/"+brand+"/"+min+"/"+max)
  }

  lowtohighfilter_(searchkeyword:string)
  {
    return this.http.get(this.baseUrl+"/Product/search/"+searchkeyword+"/sort1");
  }

  hightolowfilter_(searchkeyword:string)
  {
    return this.http.get(this.baseUrl+"/Product/search/"+searchkeyword+"/sort2");
  }
}

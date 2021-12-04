import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  baseUrl="http://localhost:8087/MyKart/rest";
  constructor(private http:HttpClient) { }


  getUserbyAddress(userid:number)
  {
    return this.http.get(this.baseUrl+"/getAddress/"+userid); 
  }
  getUserbyid(userid:number)
  {
    return this.http.get(this.baseUrl+"/getuserbyid/"+userid);
  }
  addToCartList(cartid: number, productid: number)
  {
    //let cart=new Cart();
    return this.http.get(this.baseUrl+"/cartdetails/"+cartid+"/"+productid)
  }

  deleteCartById(cId:number){
    return this.http.delete(this.baseUrl+"/cartdetailsD/"+cId);
  }
  
  
  getMyCart(cartid: number)  /*Observable<CartMyDTO[]>*/
  { 
    console.log(cartid)
    return this.http.get(this.baseUrl+'/getCart/'+ cartid);
  }
  
  
  updateMyCart(cartid: number,addOrMinus:number)
  {
   
      return this.http.get(this.baseUrl+"/cartdetailsUpdate/"+cartid+"/"+addOrMinus);
  } 

   
  


  addToWishList(wishlistid: number, productid: number)
  {
   
     return this.http.get(this.baseUrl+"/wishlistdetails/"+wishlistid+"/"+productid);
  }
   
   getMyWishlist(wishlistid : number)
  {
   
    return this.http.get(this.baseUrl+"/getWishlist/"+wishlistid);
  }

  validateUser(email:string, password:string)
  {
    return this.http.get(this.baseUrl+"/authenticateuser/"+email+"/"+password);
  }

 
  

  deletewishlistById(wishlistid:number){
    return this.http.get(this.baseUrl+"/wishlistdetailsD/"+wishlistid);
  }

  deleteCartItem(cartid:number,productid:number)
  {
    return this.http.get(this.baseUrl+"/DeleteCartById/"+cartid+"/"+productid);
  }
  
  deleteWishItem(wishlistid:number,productid:number)
  {
    return this.http.get(this.baseUrl+"/DeleteWishById/"+wishlistid+"/"+productid);
  }
  
  getCartIdByEmail(email:string)
  {
    return this.http.get(this.baseUrl+"/getCartidByEmail/"+email);
  }

  getWishIdByEmail(email:string)
  {
    return this.http.get(this.baseUrl+"/getWishidByEmail/"+email);
  }
	
	
}

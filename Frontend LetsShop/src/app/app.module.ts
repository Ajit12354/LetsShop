import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { UserloginComponent } from './userlogin/userlogin.component';
import { OrderdetailsComponent } from './orderdetails/orderdetails.component';
import { TempproductComponent } from './tempproduct/tempproduct.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';



import { SearchproductComponent } from './searchproduct/searchproduct.component';
import { HttpClientModule} from '@angular/common/http';

import { ShowallComponent } from './showall/showall.component';
import { FilterComponent } from './filter/filter.component';

import { HomeComponent } from './home/home.component';
import { SignupComponent } from './signup/signup.component';
import { CartComponent } from './cart/cart.component';
import { WishlistComponent } from './wishlist/wishlist.component';



import { CompareComponent } from './compare/compare.component';
import { RetailerComponent } from './retailer/retailer.component';
import { AdminComponent } from './admin/admin.component';
import { AdminprofileComponent } from './adminprofile/adminprofile.component';
import { NgxImageZoomModule } from 'ngx-image-zoom';
import { LoginComponent } from './login/login.component';
import { ResetpasswordComponent } from './resetpassword/resetpassword.component';
//import { FlexLayoutModule } from '@angular/flex-layout';
//import { MatFormFieldModule } from '@angular/material/form-field';
//import { MatInputModule } from '@angular/material/input';
//import { MatButtonModule } from '@angular/material/button';
//import {MatCardModule} from '@angular/material/card';




import { DisplayretailersComponent } from './displayretailers/displayretailers.component';
import { UpdateproductComponent } from './updateproduct/updateproduct.component';
import { ForgetpasswordComponent } from './forgetpassword/forgetpassword.component';




@NgModule({
  declarations: [
    AppComponent,

    SearchproductComponent,
    ShowallComponent,
    FilterComponent,
    HomeComponent,
    CompareComponent,
    RetailerComponent,
    AdminComponent,
    AdminprofileComponent,
    SignupComponent,
    LoginComponent,
    ResetpasswordComponent,

    UserloginComponent,
    OrderdetailsComponent,
    TempproductComponent,


    CompareComponent,
    RetailerComponent,
    AdminComponent,
    AdminprofileComponent,
    DisplayretailersComponent,
    WishlistComponent,
    CartComponent,

    SearchproductComponent,
    ShowallComponent,
    FilterComponent,

    CompareComponent,
    RetailerComponent,
    AdminComponent,
    AdminprofileComponent,
    UpdateproductComponent,
    ForgetpasswordComponent


  ],

  imports: [
    BrowserModule,
    AppRoutingModule,

    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
    FontAwesomeModule,

    HttpClientModule,
   
    FormsModule,
    NgxImageZoomModule

   

    //FlexLayoutModule,
    //MatFormFieldModule,
    //MatInputModule,
    //MatButtonModule,
    //MatCardModule

  ],
  
  bootstrap: [AppComponent]
})
export class AppModule { }
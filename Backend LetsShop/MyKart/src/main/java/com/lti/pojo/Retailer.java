package com.lti.pojo;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="tretailer")
public class Retailer 
{
	@Id
	private int retailerid; 
	private String retailername; 
	private String retaileremail; 
	private String retailerphnumber;
	private String retailerpass;
	
	
	
	
	public String getRetailerpass() {
		return retailerpass;
	}

	public void setRetailerpass(String retailerpass) {
		this.retailerpass = retailerpass;
	}

	public int getRetailerid() 
	{
		return retailerid;
	}
	
	public void setRetailerid(int retailerid) 
	{
		this.retailerid = retailerid;
	}
	public String getRetailername() 
	{
		return retailername;
	}
	public void setRetailername(String retailername) 
	{
		this.retailername = retailername;
	}
	public String getRetaileremail() 
	{
		return retaileremail;
	}
	public void setRetaileremail(String retaileremail) 
	{
		this.retaileremail = retaileremail;
	}
	public String getRetailerphnumber() 
	{
		return retailerphnumber;
	}
	public void setRetailerphnumber(String retailerphnumber) 
	{
		this.retailerphnumber = retailerphnumber;
	}
	
	public Retailer() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Retailer(int retailerid, String retailername, String retaileremail, String retailerphnumber,String retailerpass) 
	{
		super();
		this.retailerid = retailerid;
		this.retailername = retailername;
		this.retaileremail = retaileremail;
		this.retailerphnumber = retailerphnumber;
		this.retailerpass=retailerpass;
	}

	@Override
	public String toString() {
		return "Retailer [retailerid=" + retailerid + ", retailername=" + retailername + ", retaileremail="
				+ retaileremail + ", retailerphnumber=" + retailerphnumber + ", retailpass=" + retailerpass + "]";
	}

	
	

}

package com.lti.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class ProductDTO {

	private int productid;

	private int retailerid;

	private String productname;

	private int productprice;
	
	private String productdesc;

	private int productquantity;
	
	private String productcategory;
	
	private String productsubcategory;
	
	private String productbrand;

	private String productimage;

	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(int productid, int retailerid, String productname, int productprice, String productdesc,
			int productquantity, String productcategory, String productsubcategory, String productbrand,
			String productimage) {
		super();
		this.productid = productid;
		this.retailerid = retailerid;
		this.productname = productname;
		this.productprice = productprice;
		this.productdesc = productdesc;
		this.productquantity = productquantity;
		this.productcategory = productcategory;
		this.productsubcategory = productsubcategory;
		this.productbrand = productbrand;
		this.productimage = productimage;
	}

	@Override
	public String toString() {
		return "ProductDTO [productid=" + productid + ", retailerid=" + retailerid + ", productname=" + productname
				+ ", productprice=" + productprice + ", productdesc=" + productdesc + ", productquantity="
				+ productquantity + ", productcategory=" + productcategory + ", productsubcategory="
				+ productsubcategory + ", productbrand=" + productbrand + ", productimage=" + productimage + "]";
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getRetailerid() {
		return retailerid;
	}

	public void setRetailerid(int retailerid) {
		this.retailerid = retailerid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public String getProductdesc() {
		return productdesc;
	}

	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}

	public int getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	public String getProductsubcategory() {
		return productsubcategory;
	}

	public void setProductsubcategory(String productsubcategory) {
		this.productsubcategory = productsubcategory;
	}

	public String getProductbrand() {
		return productbrand;
	}

	public void setProductbrand(String productbrand) {
		this.productbrand = productbrand;
	}

	public String getProductimage() {
		return productimage;
	}

	public void setProductimage(String productimage) {
		this.productimage = productimage;
	}
	
   
	
}

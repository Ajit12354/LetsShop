package com.lti.pojo;
import javax.persistence.*;
@Entity
@Table(name="producttemp")
public class ProductTemp 
{

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int tempproductid;
	 private String tempproductname;
	 private int tempproductprice;
	 private String tempproductdesc ;
	 private int tempproductquantity;
	 private String tempproductcategory;
	 private String tempproductsubcategory;
	 private String tempproductbrand;
	 private String tempproductimage;
	 private String tempproductstatus;
	private int tempretailerid;
	

	 
	 
	
	 
	 

	public int getTempproductid() 
	{

		return tempproductid;
	}
	public void setTempproductid(int tempproductid) {
		this.tempproductid = tempproductid;
	}
	public String getTempproductname() {
		return tempproductname;
	}
	public void setTempproductname(String tempproductname) {
		this.tempproductname = tempproductname;
	}
	public int getTempproductprice() {
		return tempproductprice;
	}
	public void setTempproductprice(int tempproductprice) {
		this.tempproductprice = tempproductprice;
	}
	public String getTempproductdesc() {
		return tempproductdesc;
	}
	public void setTempproductdesc(String tempproductdesc) {
		this.tempproductdesc = tempproductdesc;
	}
	public int getTempproductquantity() {
		return tempproductquantity;
	}
	public void setTempproductquantity(int tempproductquantity) {
		this.tempproductquantity = tempproductquantity;
	}
	public String getTempproductcategory() {
		return tempproductcategory;
	}
	public void setTempproductcategory(String tempproductcategory) {
		this.tempproductcategory = tempproductcategory;
	}
	public String getTempproductsubcategory() {
		return tempproductsubcategory;
	}
	public void setTempproductsubcategory(String tempproductsubcategory) {
		this.tempproductsubcategory = tempproductsubcategory;
	}
	public String getTempproductbrand() {
		return tempproductbrand;
	}
	public void setTempproductbrand(String tempproductbrand) {
		this.tempproductbrand = tempproductbrand;
	}
	public String getTempproductimage() {
		return tempproductimage;
	}
	public void setTempproductimage(String tempproductimage) {
		this.tempproductimage = tempproductimage;
	}
	public String getTempproductstatus() {
		return tempproductstatus;
	}
	public void setTempproductstatus(String tempproductstatus) {
		this.tempproductstatus = tempproductstatus;
	}
	public int getTempretailerid() {
		return tempretailerid;
	}
	public void setTempretailerid(int tempretailerid) {
		this.tempretailerid = tempretailerid;
	}
	public ProductTemp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductTemp(int tempproductid, String tempproductname, int tempproductprice, String tempproductdesc,
			int tempproductquantity, String tempproductcategory, String tempproductsubcategory, String tempproductbrand,
			String tempproductimage, String tempproductstatus, int tempretailerid) {
		super();
		this.tempproductid = tempproductid;
		this.tempproductname = tempproductname;
		this.tempproductprice = tempproductprice;
		this.tempproductdesc = tempproductdesc;
		this.tempproductquantity = tempproductquantity;
		this.tempproductcategory = tempproductcategory;
		this.tempproductsubcategory = tempproductsubcategory;
		this.tempproductbrand = tempproductbrand;
		this.tempproductimage = tempproductimage;
		this.tempproductstatus = tempproductstatus;
		this.tempretailerid = tempretailerid;
	}
	@Override
	public String toString() {
		return "ProductTemp [tempproductid=" + tempproductid + ", tempproductname=" + tempproductname
				+ ", tempproductprice=" + tempproductprice + ", tempproductdesc=" + tempproductdesc
				+ ", tempproductquantity=" + tempproductquantity + ", tempproductcategory=" + tempproductcategory
				+ ", tempproductsubcategory=" + tempproductsubcategory + ", tempproductbrand=" + tempproductbrand
				+ ", tempproductimage=" + tempproductimage + ", tempproductstatus=" + tempproductstatus
				+ ", tempretailerid=" + tempretailerid + "]";
	}
	
	 
	 
	 

	

	
	 
	 
     
}

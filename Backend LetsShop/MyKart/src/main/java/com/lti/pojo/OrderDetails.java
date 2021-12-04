package com.lti.pojo;

import javax.persistence.*;

@Entity
@Table(name="torderdet")
public class OrderDetails {
	
	@Id


	@Column(name="orderid")

	private long orderid;
	@Column(name="productid")
	private int productid ;
	@Column(name="pquantity")
	private int pquantity;

	
	public long getOrderid() {
		return orderid;
	}

	

	



	public void setOderid(long oderid) {
		this.orderid = oderid;

	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getPquantity() {
		return pquantity;
	}
	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetails(long orderid, int productid, int pquantity) {
		super();

		this.orderid = orderid;

		this.orderid = orderid;

		this.productid = productid;
		this.pquantity = pquantity;
	}
	@Override
	public String toString() {

		return "OrderDetails [orderid=" + orderid + ", productid=" + productid + ", pquantity=" + pquantity + "]";

		

	}
	
	
	
	

 
   
	

}

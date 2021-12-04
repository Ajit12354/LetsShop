package com.lti.dto;



public class CartDTO {

    private int cartid;
	private int quantity;
	private int productid;
	
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartDTO(int cartid, int quantity) {
		super();
		this.cartid = cartid;
		this.quantity = quantity;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "CartDTO [cartid=" + cartid + ", quantity=" + quantity + ", productid=" + productid + "]";
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	
	
	
	
	
}

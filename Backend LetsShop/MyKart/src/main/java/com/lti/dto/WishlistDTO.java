package com.lti.dto;

public class WishlistDTO {

	private int wishlistid;
	private int productid;
	@Override
	public String toString() {
		return "WishlistMyDTO [wishlistid=" + wishlistid + ", productid=" + productid + "]";
	}
	public WishlistDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WishlistDTO(int wishlistid, int productid) {
		super();
		this.wishlistid = wishlistid;
		this.productid = productid;
	}
	public int getWishlistid() {
		return wishlistid;
	}
	public void setWishlistid(int wishlistid) {
		this.wishlistid = wishlistid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	
}

package com.lti.dto;



public class WishlistMyDTO {

	
	private WishlistDTO wishlistdto;
	private ProductDTO productdto;
	@Override
	public String toString() {
		return "WishlistMyDTO [wishlistdto=" + wishlistdto + ", productdto=" + productdto + "]";
	}
	public WishlistMyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WishlistMyDTO(WishlistDTO wishlistdto, ProductDTO productdto) {
		super();
		this.wishlistdto = wishlistdto;
		this.productdto = productdto;
	}
	public WishlistDTO getWishlistdto() {
		return wishlistdto;
	}
	public void setWishlistdto(WishlistDTO wishlistdto) {
		this.wishlistdto = wishlistdto;
	}
	public ProductDTO getProductdto() {
		return productdto;
	}
	public void setProductdto(ProductDTO productdto) {
		this.productdto = productdto;
	}
	
	
	
}

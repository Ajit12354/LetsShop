package com.lti.repository;

import java.util.List;

import com.lti.pojo.Wishlist;

public interface WishlistRepo {

	
	public int addToWishList(int wishlistid, int productid);
	public boolean deleteWishList(int wishlistid);
	public List<Wishlist> viewWishList(int wishlistid);
	public int deletewishitem(int wishlistid, int productid);
}

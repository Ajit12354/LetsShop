package com.lti.service;

import java.util.List;

import com.lti.dto.WishlistMyDTO;
import com.lti.pojo.Wishlist;

public interface WishlistService {

	public int addToWishList(int wishlistid, int productid);
	public boolean deleteWishList(int wishlistid);
	public List<Wishlist> viewWishList(int wishlistid);
	
	public List<WishlistMyDTO> findviewWishList(int uId);
	public int deleteWishItemById(int wishlistid, int productid);
}

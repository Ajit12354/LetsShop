package com.lti.service;

import java.util.List;

import com.lti.dto.CartMyDTO;
import com.lti.pojo.Cart;

public interface CartService {

	public int addToCart(int cartid, int productid);
	public boolean deleteCartBycId(int cartid); 
	public List<Cart> viewCart(int cartid);
	public boolean updateCart(int cartid, int addOrMinus);
	
	public List<CartMyDTO> findviewCart(int cartid);
	
	public int deleteItemById(int cartid, int productid);
	
}

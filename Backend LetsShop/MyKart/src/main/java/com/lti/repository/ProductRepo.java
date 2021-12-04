package com.lti.repository;

import java.util.List;

import com.lti.pojo.Cart;
import com.lti.pojo.Compare;
import com.lti.pojo.Product;
import com.lti.pojo.Wishlist;

public interface ProductRepo 
{
//	public Product  getProductById(int pId);
	
//	public List<Product> sortProduct(String by, int order);
//	public List<Product> filterProduct(String brand, int s, int e);

//public List<Product> getProduct();	
/*	
public void addProductToCart(Cart cart);
public void addProductToWishList(Wishlist wishlist);
public void addCompare(Compare c);*/

	public Product findAllProductByPID(int productid);
}

package com.lti.repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.pojo.Cart;
import com.lti.pojo.Compare;
import com.lti.pojo.Product;
import com.lti.pojo.User;
import com.lti.pojo.Wishlist;

@Repository
public class ProductRepoImpl implements ProductRepo{

	@Autowired
	EntityManager eMan;

	@Override
	public Product findAllProductByPID(int productid) {
		// TODO Auto-generated method stub
		Product product =eMan.find(Product.class,productid);
		return product;
	}

/*	@Override
	public List<Product> getProduct() {
		List<Product> list1 = eMan.createQuery("from Product").getResultList();
		return list1;
		
	}*/
   /*
	@Override
	public void addProductToCart(Cart cart) {
		
		Product p = new Product();
		Set<Cart> s = new HashSet<>();
		s.add(cart);
		p.setCarts(s);
		
	}

	@Override
	public void addProductToWishList(Wishlist wishlist) {
		
		Product p = new Product();
		Set<Wishlist> s = new HashSet<>();
		s.add(wishlist);
		p.setWishlists(s);
				
	}

	@Override
	public void addCompare(Compare c) {
		
		Product p = new Product();
		Set<Compare> s = new HashSet<>();
		s.add(c);
		p.setCompares(s);
		
	}*/

	
}

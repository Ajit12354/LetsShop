package com.lti.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.pojo.Cart;
import com.lti.pojo.Product;
import com.lti.pojo.User;

@Repository
public class CartRepoImpl implements CartRepo{
    
	@Autowired
	private EntityManager eMan;
	
	/*
	@Override
	public int addToCart(int cartid, int productid) {
		// TODO Auto-generated method stub
		try {
		Cart c=eMan.find(Cart.class, cartid);

		Product p=eMan.find(Product.class, productid);
		System.out.print(c.getProduct());
		
		if(c.getProduct()==null)
		{
			List<Product> pl=new ArrayList<Product>();
			pl.add(p);
			c.setProduct(pl);
			eMan.merge(c);
		}
		else 
		{
			c.getProduct().add(p);
			eMan.merge(c);
			System.out.print(c.getProduct());
		}
		

		return 1;
	}
		catch(Exception e)
		{
			return -1;
		}
		//return 0;

	}

	@Override
	public boolean deleteCartBycId(int cartid) {
		// TODO Auto-generated method stub
		try {
			Cart cart = eMan.find(Cart.class, cartid);
			eMan.remove(cart);

		} catch (Exception e) {
			System.out.println("no product deleted or no product there to delete");
		}
		return true;
	}

	@Override
	public List<Cart> viewCart(int cartid) {
		// TODO Auto-generated method stub
		
		List<Cart> cart = null;
		Query qy=eMan.createQuery("Select e from Cart e where e.cartid=:cartid");
		try {
			qy.setParameter("cartid", cartid);
			cart = qy.getResultList();
		}

		catch (Exception e) {
			System.out.println(" no products in cart");
		}
		return cart;
	}*/

	@Override
	public boolean updateCart(int cartid, int addOrMinus) {
		// TODO Auto-generated method stub
		Cart cart=eMan.find(Cart.class,cartid);
		if(addOrMinus == 1)
		{
			Product product=eMan.find(Product.class, cart.getProduct().get(0).getProductid());
		int productquantity=product.getProductquantity();
		System.out.println(productquantity);
		if(cart.getQuantity()+1<=productquantity)
		{
			cart.setQuantity(cart.getQuantity() + 1);
			eMan.merge(cart);
			return true;
		}
		else {System.out.println("Out of stock");
		return false;
		}
		}
		 else
		 {
			if (cart.getQuantity() - 1 >= 1) {
				
				cart.setQuantity(cart.getQuantity() - 1);
				eMan.merge(cart);
				return true;
			} else {
				System.out.println("quantity cannot be negative");
				return false;
		       }
	     }
	}
	
	
	@Override
	public int addToCart(int cartid, int productid) {
		// TODO Auto-generated method stub
		try {
		//User u=eMan.find(User.class,userid);
		//int cartid=u.getCart().getCartid();
			//Cart cart = new Cart();
			//cart.setQuantity(1); 
			//cart.
		Cart c=eMan.find(Cart.class, cartid);
         //c.setQuantity(1);
		Product p=eMan.find(Product.class, productid);
		System.out.print(c.getProduct());
		
		if(c.getProduct()==null)
		{
			List<Product> pl=new ArrayList<Product>();
			pl.add(p);
			c.setProduct(pl);
			eMan.merge(c);
		}
		else 
		{
			c.getProduct().add(p);
			eMan.merge(c);
			System.out.print(c.getProduct());
		}
		
		

		return 1;
	}
		catch(Exception e)
		{
			return -1;
		}
		//return 0;

	}
	
	@Override
	public boolean deleteCartBycId(int cartid) {
		// TODO Auto-generated method stub
		try {
			Cart cart = eMan.find(Cart.class, cartid);
			eMan.remove(cart);

		} catch (Exception e) {
			System.out.println("no product deleted or no product there to delete");
		}
		return true;
	}
	
	
	@Override
	public List<Cart> viewCart(int cartid) {
		// TODO Auto-generated method stub
		//User u=eMan.find(User.class,userid);
		//int cartid=u.getCart().getCartid();
		List<Cart> cart = null;
		Query qy=eMan.createQuery("Select e from Cart e where e.cartid=:cartid");
		try {
			qy.setParameter("cartid", cartid);
			cart = qy.getResultList();
		}

		catch (Exception e) {
			System.out.println(" no products in cart");
		}
		return cart;
	}


	
	@Override
	public int deleteItemById(int cartid, int productid) {
		// TODO Auto-generated method stub
		Cart c=eMan.find(Cart.class, cartid);
	    System.out.println(c);
	    Product p=eMan.find(Product.class, productid);
	    try {
	    	int x=c.getProduct().indexOf(p);
	    	System.out.println(x);
	    	List<Product> l=c.getProduct();
	    	if(c.getProduct().indexOf(p)!=-1)
	    	{
	    	    l.remove(x);
	    	}
	    	c.setProduct(l);
	    	
	    	eMan.merge(c);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("No item to delete");
	    }
	    return 1;
	
	}
	
	
	
}
	


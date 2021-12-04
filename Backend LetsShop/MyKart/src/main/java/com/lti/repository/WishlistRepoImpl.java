package com.lti.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import com.lti.pojo.Cart;
import com.lti.pojo.Product;
import com.lti.pojo.Wishlist;

@Repository
public class WishlistRepoImpl implements WishlistRepo{

	@Autowired
	EntityManager eMan;
	
	@Override
	public int addToWishList(int wishlistid, int productid) {
		// TODO Auto-generated method stub
		try {
			Wishlist w=eMan.find(Wishlist.class, wishlistid);

			Product p=eMan.find(Product.class, productid);
			System.out.print(w.getProduct12());
			
			if(w.getProduct12()==null)
			{
				List<Product> pl=new ArrayList<Product>();
				pl.add(p);
				w.setProduct12(pl);
				eMan.merge(w);
			}
			else 
			{
				w.getProduct12().add(p);
				eMan.merge(w);
				System.out.print(w.getProduct12());
			}
			
			

			return 1;
		}
			catch(Exception e)
			{
				return -1;
			}
	}
	
	@Override
	public int deletewishitem(int wishlistid, int productid) {
		// TODO Auto-generated method stub
		Wishlist w=eMan.find(Wishlist.class, wishlistid);
	    System.out.println(w);
	    Product p=eMan.find(Product.class, productid);
	    try {
	    	int x=w.getProduct12().indexOf(p);
	    	System.out.println(x);
	    	List<Product> l=w.getProduct12();
	    	if(w.getProduct12().indexOf(p)!=-1)
	    	{
	    	    l.remove(x);
	    	}
	    	w.setProduct12(l);
	    	
	    	eMan.merge(w);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("No item to delete");
	    }
	    return 1;
	}

	@Override
	public boolean deleteWishList(int wishlistid) {
		// TODO Auto-generated method stub
		try {
			Wishlist wishlist = eMan.find(Wishlist.class, wishlistid);
			eMan.remove(wishlist);

		} catch (Exception e) {
			System.out.println("no product deleted or no product there to delete");
		}
		return true;
	}

	@Override
	public List<Wishlist> viewWishList(int wishlistid) {
		// TODO Auto-generated method stub
		List<Wishlist> w = null;
		Query qy=eMan.createQuery("Select e from Wishlist e where e.wishlistid=:wishlistid");
		try {
			qy.setParameter("wishlistid", wishlistid);
			w = qy.getResultList();
		}

		catch (Exception e) {
			System.out.println(" no products in wishlist");
		}
		return w;
	}
	
	

}

package com.lti.repository;
import java.util.*;
import com.lti.pojo.*;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.JoinColumn;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.pojo.Order;
import com.lti.pojo.User;

@Repository
public class UserRepoImpl implements UserRepo {

	@Autowired
	EntityManager eMan;
	
	@Override
	public int addUser(User user) {
		eMan.persist(user);
		try {
			eMan.persist(user);
					}
		catch(Exception e)
		{
			System.out.println("Unable to add");
			return -1;
		}
		return 1;
		
	}

     
	@Override
	public boolean addAddress(int userid, String address) {
		
		try {

			User user = eMan.find(User.class, userid);
			user.setAddress(address);
			eMan.persist(user);

		} catch (Exception e) {
			System.out.println("unable to update address");
			return false;
		}
		return true;
		
	}

	


	@Override
	public void addProductToCart(Cart cart) 
	{
		
		eMan.persist(cart);
		System.out.println("Added product to cart");
		
	}
	
	@Override
	public void addProductToWishList(Wishlist wishlist)
	{
		eMan.persist(wishlist);
		System.out.println("Added product to wishlist");
	}
	
	@Override
	public void addPayIdToPayment(Payments payment)
	{
		eMan.persist(payment);
		System.out.println("Added payment");
	}
	
	@Override
	public void addCompare(Compare c) 
	{
		eMan.persist(c);
		System.out.println("Added to compare");
	}


	@Override
	public List<User> searchUser(int userid) 
	{
		List<User> usr=null;
		Query qry=eMan.createQuery("Select e from User e where e.userid=:userid");
		qry.setParameter("userid",userid);
		usr=qry.getResultList();
		/*try {
			qry.setParameter("userid",userid);
			usr=qry.getResultList();
		}
		catch(Exception e)
		{
			System.out.println("No users exist");
		}*/
		return usr;
	}


	@Override
	public int searchWishlistOfUser(int userid) 
	{
		User u=eMan.find(User.class, userid);
		int wishlistid=u.getWishlist().getWishlistid();
		
		return wishlistid;
	}


	@Override
	public int searchCartOfUser(int userid) {
		User u=eMan.find(User.class, userid);
		int cartid=u.getCart().getCartid();
		return cartid;
		
	}


	@Override
	public int getCartIdByEmail(String email) {
		// TODO Auto-generated method stub
		Query qy=eMan.createQuery("Select e.cart from User e where e.emailid=:email");
		qy.setParameter("email",email);
		Cart ans =(Cart) qy.getSingleResult();
		return ans.getCartid();
	}


	@Override
	public int getWishlistIdByEmail(String email) {
		// TODO Auto-generated method stub
		Query qy=eMan.createQuery("Select e.cart from User e where e.emailid=:email");
		qy.setParameter("email",email);
		Cart ans =(Cart) qy.getSingleResult();
		return ans.getCartid();
	}


	@Override
	
		
		
		public boolean validuser(String emailid, String password) 
		{
			Query qry=eMan.createQuery("Select e.userid from User e where e.emailid=?1 AND e.password=?2");
			qry.setParameter(1, emailid);
			qry.setParameter(2, password);
			try {
					
				int usr= (int) qry.getSingleResult();
				

			} catch (Exception e) {
				System.out.println("Invalid User");
				return false;
			}
			
			return true;
		}
	
}









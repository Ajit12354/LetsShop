package com.lti.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.pojo.Cart;
import com.lti.pojo.Compare;
import com.lti.pojo.Payments;
import com.lti.pojo.User;
import com.lti.pojo.Wishlist;
import com.lti.repository.UserRepo;

@Service
@Transactional
public class UserServiceImpl implements UserService
{
	 @Autowired
	  UserRepo urepo;

	
	@Override
	public int addUser(User user) {
		return urepo.addUser(user);
	}

	@Override
	public boolean addAddress(int userid, String address) {
		return urepo.addAddress(userid, address);
	}

	

	@Override
	public void addProductToCart(Cart cart) {
		urepo.addProductToCart(cart);
		
	}

	@Override
	public void addProductToWishList(Wishlist wishlist) {
		urepo.addProductToWishList(wishlist);
		
	}

	@Override
	public void addPayIdToPayment(Payments payment) {
		urepo.addPayIdToPayment(payment);
		
	}

	@Override
	public void addCompare(Compare c) {
		urepo.addCompare(c);
		
	}

	@Override
	public List<User> searchUser(int userid) {
		
		return urepo.searchUser(userid);
	}

	@Override
	public int searchWishlistOfUser(int userid) {
		
		return urepo.searchWishlistOfUser(userid);
	}

	@Override
	public int searchCartOfUser(int userid) {
		
		return urepo.searchCartOfUser(userid);
	}

	@Override
	public int getCartIdByEmail(String email) {
		// TODO Auto-generated method stub
		return urepo.getCartIdByEmail(email);
	}

	@Override
	public int getWishlistIdByEmail(String email) {
		// TODO Auto-generated method stub
		return urepo.getWishlistIdByEmail(email);
	}

	@Override
	public boolean validuser(String username, String Password) {
		// TODO Auto-generated method stub
		return urepo.validuser(username, Password);
	} 

}

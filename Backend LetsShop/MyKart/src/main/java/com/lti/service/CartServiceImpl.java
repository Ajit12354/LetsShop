package com.lti.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dto.CartDTO;
import com.lti.dto.CartMyDTO;
import com.lti.dto.ProductDTO;
import com.lti.pojo.Cart;
import com.lti.pojo.Product;
import com.lti.repository.CartRepo;
import com.lti.repository.UserRepo;
@Service
@Transactional
public class CartServiceImpl implements CartService{
   
	@Autowired
	private CartRepo cartrepo;
	
	//@Autowired
	//private UserRepo userrepo;
	
	//@Autowired
	//private Product prepo;
	
	@Override
	public int addToCart(int cartid, int productid) {
		// TODO Auto-generated method stub
		return cartrepo.addToCart(cartid, productid);
	}
	
	@Override
	public int deleteItemById(int cartid, int productid) {
		// TODO Auto-generated method stub
		return cartrepo.deleteItemById(cartid, productid);
	}

	@Override
	public boolean deleteCartBycId(int cartid) {
		// TODO Auto-generated method stub
		return cartrepo.deleteCartBycId(cartid);
	}

	@Override
	public List<Cart> viewCart(int cartid) {
		// TODO Auto-generated method stub
		return cartrepo.viewCart(cartid);
		
	}

	@Override
	public boolean updateCart(int cartid, int addOrMinus) {
		// TODO Auto-generated method stub
		return cartrepo.updateCart(cartid, addOrMinus);
	}

	@Override
	public List<CartMyDTO> findviewCart(int cartid) {
		List<Cart> carts = cartrepo.viewCart(cartid);
		List<CartMyDTO> dto= new ArrayList<>();
		for(Cart c:carts)
		{
			
			List<Product> emp=c.getProduct();
			for(Product p:emp)
			{   CartDTO cartD=new CartDTO();
			    cartD.setQuantity(c.getQuantity());
			     cartD.setCartid(c.getCartid());
			     cartD.setProductid(p.getProductid());
			     
				ProductDTO prod_dto1 = new ProductDTO();
				prod_dto1.setProductid(p.getProductid());
				prod_dto1.setRetailerid(p.getRetailerid());
				prod_dto1.setProductid(p.getProductid());
				prod_dto1.setProductname(p.getProductname());
				prod_dto1.setProductcategory(p.getProductcategory());
				prod_dto1.setProductbrand(p.getProductbrand());
				prod_dto1.setProductdesc(p.getProductdesc());
				prod_dto1.setProductprice(p.getProductprice());
				prod_dto1.setProductcategory(p.getProductcategory());
				prod_dto1.setProductimage(p.getProductimage());
				prod_dto1.setProductquantity(p.getProductquantity());
				
				CartMyDTO dtos=new CartMyDTO();
				
				dtos.setCartdto(cartD);
				dtos.setProductdto(prod_dto1);
				dto.add(dtos);
			}
		}
		return dto;
	}

	



}

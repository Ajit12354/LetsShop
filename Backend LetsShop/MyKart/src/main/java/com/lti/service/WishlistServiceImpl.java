package com.lti.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dto.CartDTO;
import com.lti.dto.CartMyDTO;
import com.lti.dto.ProductDTO;
import com.lti.dto.WishlistDTO;
import com.lti.dto.WishlistMyDTO;
import com.lti.pojo.Cart;
import com.lti.pojo.Product;
import com.lti.pojo.Wishlist;
import com.lti.repository.WishlistRepo;

@Service
@Transactional
public class WishlistServiceImpl implements WishlistService{
	
	@Autowired
	private WishlistRepo wrepo;

	@Override
	public int addToWishList(int wishlistid, int productid) {
		// TODO Auto-generated method stub
		return wrepo.addToWishList(wishlistid, productid);
	}

	@Override
	public boolean deleteWishList(int wishlistid) {
		// TODO Auto-generated method stub
		return wrepo.deleteWishList(wishlistid);
	}
	
	@Override
	public int deleteWishItemById(int wishlistid, int productid) {
		// TODO Auto-generated method stub
		return wrepo.deletewishitem(wishlistid,productid);
	}

	@Override
	public List<Wishlist> viewWishList(int wishlistid) {
		// TODO Auto-generated method stub
		return wrepo.viewWishList(wishlistid);
	}

	@Override
	public List<WishlistMyDTO> findviewWishList(int wishlistid) {
		List<Wishlist> w =wrepo.viewWishList(wishlistid);
		List<WishlistMyDTO> dto= new ArrayList<>();
		for(Wishlist w1:w)
		{
			
			List<Product> emp=w1.getProduct12();
			for(Product p:emp)
			{   WishlistDTO wD=new WishlistDTO();
			     wD.setWishlistid(w1.getWishlistid());
			     wD.setProductid(p.getProductid());
			     
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
				
				WishlistMyDTO dtos=new WishlistMyDTO();
				
				dtos.setProductdto(prod_dto1);
				dtos.setWishlistdto(wD);
				dto.add(dtos);
			}
		}
		return dto;
	}
	
	
	

}

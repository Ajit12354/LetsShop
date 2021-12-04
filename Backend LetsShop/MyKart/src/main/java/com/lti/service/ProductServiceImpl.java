package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.jparepos.MyJpaRepo;
import com.lti.pojo.Product;
import com.lti.repository.ProductRepo;

import com.lti.repository.ProductRepo;


@Service
@Transactional
public class ProductServiceImpl  implements ProductService
{
	@Autowired
	MyJpaRepo jparepo;

	
	@Autowired
	ProductRepo prepo;

	@Override
	public List<Product> getProduct(String type) {
		return jparepo.findByproductcategory(type);
	}

	
	

	@Override
	public List<Product> showallProduct() {
	
		return jparepo.showall();
	}

	@Override
	public List<Product> cate_subcate(String type1, String type2) {
		return jparepo.showcateandsubcate(type1, type2);
	}

	@Override
	public List<Product> filter(String type1, String type2) {
		
		return jparepo.applyfilter(type1, type2);
	}

	@Override
	public List<Product> lowtohighfilter(String type1, String type2) {
		
		return jparepo.lowtohigh(type1, type2);
	}

	@Override
	public List<Product> hightolowfilter(String type1, String type2) {
		
		return jparepo.hightolow(type1, type2);
	}

	@Override
	public List<Product> priceFilter(String type1, String type2, int min, int max) {
		
		return jparepo.priceFilter(type1, type2, min, max);
	}

	@Override
	public List<Product> lowtohighfilter_(String type) {
		return jparepo.lowtohigh_(type);
	}

	@Override
	public List<Product> hightolowfilter_(String type) {
		return jparepo.hightolow_(type);
	}


	/*@Override
	public List<Product> getbyPrice(int type) {
		return jparepo.findByproductprice(type);	
	}*/


	public Product getAllProductByPID(int productid) {
		// TODO Auto-generated method stub
		return prepo.findAllProductByPID(productid);
	}
	

	public List<Product> search(String type) {
		return jparepo.searchproduct(type);
	}


}


package com.lti.service;

import java.util.List;

import com.lti.pojo.Product;






public interface ProductService {
	
	public List<Product> getProduct(String type);
	
	public Product getAllProductByPID(int pId);

	public List<Product> search(String type);

	
	public List<Product> showallProduct();

	public List<Product> cate_subcate(String type1, String type2);
	
	public List<Product> filter(String type1, String type2);
	
	public List<Product> lowtohighfilter(String type1, String type2);
	
	public List<Product> hightolowfilter(String type1, String type2);
	
	public List<Product> priceFilter(String type1, String type2, int min, int max);
	
	public List<Product> lowtohighfilter_(String type);
	
	public List<Product> hightolowfilter_(String type);

}

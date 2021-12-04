package com.lti.service;

import java.util.List;

import com.lti.pojo.Product;
import com.lti.pojo.ProductTemp;
import com.lti.pojo.Retailer;

public interface AdminService 
{
	public boolean addRetailer(Retailer r);
	public boolean acceptProduct(ProductTemp product);
	public boolean deleteProduct(ProductTemp product);
	
	public List<Retailer> getRetailer();
	public List<Product> getAllProducts();
}

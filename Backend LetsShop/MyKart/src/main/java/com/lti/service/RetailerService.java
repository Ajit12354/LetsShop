package com.lti.service;

import java.util.List;


import com.lti.pojo.ProductTemp;

public interface RetailerService 
{
	public boolean addProduct(ProductTemp product);
	public boolean updateProduct(ProductTemp product);
	public List<ProductTemp> getProductStatus();
	public ProductTemp searchtempproduct(int id);
}

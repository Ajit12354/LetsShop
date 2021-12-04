package com.lti.repository;

import java.util.List;


import com.lti.pojo.*;

public interface RetailerRepo 
{
	public boolean addProduct(ProductTemp product);
	public boolean updateProduct(ProductTemp product);
	public List<ProductTemp> getProductStatus();
	public ProductTemp searchtempproduct(int id);
}
	

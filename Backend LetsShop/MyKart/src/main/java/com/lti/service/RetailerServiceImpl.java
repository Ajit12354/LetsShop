package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.pojo.ProductTemp;
import com.lti.repository.RetailerRepo;

@Service
@Transactional
public class RetailerServiceImpl implements RetailerService
{
	@Autowired
	RetailerRepo rr;

	@Override
	public boolean addProduct(ProductTemp product) 
	{
		return rr.addProduct(product);
		
	}

	@Override
	public boolean updateProduct(ProductTemp product) 
	{
		return rr.updateProduct(product);
	}

	@Override
	public List<ProductTemp> getProductStatus() 
	{
		return rr.getProductStatus();
	}

	@Override
	public ProductTemp searchtempproduct(int id) {
		
		return rr.searchtempproduct(id);
	}

}

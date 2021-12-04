package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.jparepos.MyJpaRepo;
import com.lti.pojo.Product;
import com.lti.pojo.ProductTemp;
import com.lti.pojo.Retailer;
import com.lti.repository.AdminRepo;
@Service
@Transactional
public class AdminServiceImpl implements AdminService
{

	@Autowired
	AdminRepo ar;
	@Autowired
	MyJpaRepo jrepo;
	@Override
	public boolean addRetailer(Retailer r) {
		
		return ar.addRetailer(r);
	}

	@Override
	public boolean acceptProduct(ProductTemp product) {
		
		return ar.acceptProduct(product);
	}

	

	@Override
	public List<Retailer> getRetailer() {
		
		return ar.getRetailer();
	}

	@Override
	public boolean deleteProduct(ProductTemp product) {
		return ar.deleteProduct(product);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return jrepo.showall();
	}

}

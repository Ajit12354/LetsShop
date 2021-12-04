package com.lti.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.pojo.Product;
import com.lti.pojo.ProductTemp;
import com.lti.pojo.Retailer;
@Repository
public class AdminRepoImpl implements AdminRepo
{
	@Autowired
	EntityManager eMan;
	
	Product p=new Product();
	ProductTemp pt=new ProductTemp();
	

	@Override
	public boolean addRetailer(Retailer r) 
	{
		eMan.merge(r);
		return true;
	}

	@Override
	public boolean acceptProduct(ProductTemp product) 
	{
		p.setProductid(product.getTempproductid());
		p.setRetailerid(product.getTempretailerid());
		p.setProductname(product.getTempproductname());
		p.setProductprice(product.getTempproductprice());
		p.setProductdesc(product.getTempproductdesc());
		p.setProductquantity(product.getTempproductquantity());
		p.setProductcategory(product.getTempproductcategory());
		p.setProductsubcategory(product.getTempproductsubcategory());
		p.setProductbrand(product.getTempproductbrand());
	    p.setProductquantity(product.getTempproductquantity());
		p.setProductimage(product.getTempproductimage());
				
		eMan.merge(p);
		
		product.setTempproductstatus("Accepted");
		eMan.merge(product);
		return true;
	}

	

	@Override
	public List<Retailer> getRetailer() {
		List<Retailer> l=eMan.createQuery("from Retailer").getResultList();
		return l;
		
	}

	@Override
	public boolean deleteProduct(ProductTemp product) {
		product.setTempproductstatus("Rejected");
		eMan.merge(product);
		return true;
	}

	
}

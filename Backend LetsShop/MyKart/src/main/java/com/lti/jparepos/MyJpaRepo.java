package com.lti.jparepos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lti.pojo.Product;

public interface MyJpaRepo extends JpaRepository<Product, String> 
{
	
	//@Query("Select p from Product p where p.productcategory LIKE %:type%")
	//Printing Product by category
	public List<Product> findByproductcategory(String type);
	
	@Query("Select p from Product p where p.productname LIKE %:type% OR p.productcategory LIKE %:type% OR p.productsubcategory LIKE %:type%")
	public List<Product> searchproduct(String type);
	
//	@Query("Select p from Product p where p.productcategory='Electronics' OR p.productcategory='Mobile'")
	@Query("from Product")
	public List<Product> showall();
	
	@Query("Select p from Product p where p.productcategory=?1 AND p.productsubcategory=?2")
	public List<Product> showcateandsubcate(String productcategory, String productsubcategory);
	
	@Query("Select p from Product p where (p.productname LIKE %?1% OR p.productcategory LIKE %?1% OR p.productsubcategory LIKE %?1%) AND p.productbrand=?2")
	public List<Product> applyfilter(String name, String brand);
	
	@Query("Select p from Product p where (p.productname LIKE %?1% OR p.productcategory LIKE %?1% OR p.productsubcategory LIKE %?1%) AND p.productbrand=?2 ORDER BY p.productprice ASC")
	public List<Product> lowtohigh(String name, String brand);


	@Query("Select p from Product p where (p.productname LIKE %?1% OR p.productcategory LIKE %?1% OR p.productsubcategory LIKE %?1%) AND p.productbrand=?2 ORDER BY p.productprice DESC")
	public List<Product> hightolow(String name, String brand);
	
	@Query("Select p from Product p where (p.productname LIKE %?1% OR p.productcategory LIKE %?1% OR p.productsubcategory LIKE %?1%) AND p.productbrand=?2 AND p.productprice BETWEEN ?3 AND ?4")
	public List<Product> priceFilter(String name,String brand,int min,int max);
	
	@Query("Select p from Product p where p.productname LIKE %?1% OR p.productcategory LIKE %?1% OR p.productsubcategory LIKE %?1% ORDER BY p.productprice ASC")
	public List<Product> lowtohigh_(String name);
	
	@Query("Select p from Product p where p.productname LIKE %?1% OR p.productcategory LIKE %?1% OR p.productsubcategory LIKE %?1% ORDER BY p.productprice DESC")
	public List<Product> hightolow_(String name);
	

}

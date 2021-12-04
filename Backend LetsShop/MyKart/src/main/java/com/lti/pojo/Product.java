package com.lti.pojo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="tproduct")
public class Product 
{
	@Id
	@Column(name="productid")
	private int productid;
	
	@Column(name = "retailerid")
	private int retailerid;
	
	@Column(name="productname")
	private String productname;
	
	@Column(name="productprice")
	private int productprice;
	
	@Column(name="productdesc")
	private String productdesc;
	
	@Column(name="productquantity")
	private int productquantity;
	
	@Column(name="productcategory")
	private String productcategory;
	
	@Column(name="productsubcategory")
	private String productsubcategory;
	
	@Column(name="productbrand")
	private String productbrand;
	
	@Column(name="productimage")
	private String productimage;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
     
	
	@ManyToMany(mappedBy = "product")
	List<Cart> cart;
	
	@ManyToMany(mappedBy = "product12")
	List<Wishlist> wishlist;
	
	public Product(int productid, int retailerid, String productname, int productprice, String productdesc,
			int productquantity, String productcategory, String productsubcategory, String productbrand,
			String productimage) {
		super();
		this.productid = productid;
		this.retailerid = retailerid;
		this.productname = productname;
		this.productprice = productprice;
		this.productdesc = productdesc;
		this.productquantity = productquantity;
		this.productcategory = productcategory;
		this.productsubcategory = productsubcategory;
		this.productbrand = productbrand;
		this.productimage = productimage;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getRetailerid() {
		return retailerid;
	}

	public void setRetailerid(int retailerid) {
		this.retailerid = retailerid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public String getProductdesc() {
		return productdesc;
	}

	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}

	public int getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	public String getProductsubcategory() {
		return productsubcategory;
	}

	public void setProductsubcategory(String productsubcategory) {
		this.productsubcategory = productsubcategory;
	}

	public String getProductbrand() {
		return productbrand;
	}

	public void setProductbrand(String productbrand) {
		this.productbrand = productbrand;
	}

	public String getProductimage() {
		return productimage;
	}

	public void setProductimage(String productimage) {
		this.productimage = productimage;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", retailerid=" + retailerid + ", productname=" + productname
				+ ", productprice=" + productprice + ", productdesc=" + productdesc + ", productquantity="
				+ productquantity + ", productcategory=" + productcategory + ", productsubcategory="
				+ productsubcategory + ", productbrand=" + productbrand + ", productimage=" + productimage + "]";
	}
	
	
	
	
	/*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="wishlistid")
	private Set<Wishlist> wishlists;

	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="compareid")
	private Set<Compare> compares;*/

	/*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="cartid")
	private Set<Cart> carts;*/

	/*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="oderid")
	private Set<OrderDetails> orderDetails;*/
	

	
	
	
	
	 
	
	

	
}

package com.lti.pojo;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Entity
@Table(name = "twishlist")
public class Wishlist {
	@Id
	@Column(name = "wishlistid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int wishlistid;


	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "wishlistx_wishItems" , joinColumns = {
			  @JoinColumn(name = "WISHLIST_ID",referencedColumnName = "wishlistid",nullable = true)
	  },
	  inverseJoinColumns = {
			  @JoinColumn(name = "PRODUCT_ID",referencedColumnName = "productid",nullable = true)
	  }
	  )
	List<Product> product12;


	public int getWishlistid() {
		return wishlistid;
	}


	public void setWishlistid(int wishlistid) {
		this.wishlistid = wishlistid;
	}


	public List<Product> getProduct12() {
		return product12;
	}


	public void setProduct12(List<Product> product12) {
		this.product12 = product12;
	}


	@Override
	public String toString() {
		return "Wishlist [wishlistid=" + wishlistid + ", product12=" + product12 + "]";
	}


	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Wishlist(int wishlistid, List<Product> product12) {
		super();
		this.wishlistid = wishlistid;
		this.product12 = product12;
	}


	

	

}

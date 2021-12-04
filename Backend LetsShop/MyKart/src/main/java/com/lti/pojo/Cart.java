package com.lti.pojo;
import java.util.*;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name="tcart")
public class Cart {
	
	@Id
	@Column(name="cartid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartid;
	
	/*@OneToOne(cascade = CascadeType.ALL)
	User userid;*/

	@Column(name="quantity")
	private int quantity;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "cartx_cartItems" , joinColumns = {
			  @JoinColumn(name = "CART_ID",referencedColumnName = "cartid",nullable = true)
	  },
	  inverseJoinColumns = {
			  @JoinColumn(name = "PROD_ID",referencedColumnName = "productid",nullable = true)
	  }
	  )
	List<Product> product;

	public int getCartid() {
		return cartid;
	}

	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", quantity=" + quantity + ", product=" + product + "]";
	}

	public Cart(int cartid, int quantity, List<Product> product) {
		super();
		this.cartid = cartid;
		this.quantity = quantity;
		this.product = product;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}


	
  
	
    

	
	
	

}

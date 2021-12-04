package com.lti.pojo;


import java.util.*;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="tuser")
public class User 
{
    @Id
    private int userid;
    private String name;
    private String emailid;
    private String address;
    private String mobileno;
    private String password;
    
   @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="wishlistid")
	private Wishlist wishlist;
    

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="compareid")
	private Compare compare;
    
    
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cartid")
	private Cart cart;
	
    
	public Cart getCart() {
		return cart;
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="payid")
	private Payments payment;
    


	public Compare getCompare() {
		return compare;
	}
	public void setCompare(Compare compare) {
		this.compare = compare;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Wishlist getWishlist() {
		return wishlist;
	}
	public void setWishlist(Wishlist wishlist) {
		this.wishlist = wishlist;
	}
    
	public Payments getPayment() {
		return payment;
	}
	public void setPayment(Payments payment) {
		this.payment = payment;  
	}

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int userid, String name, String emailid, String address, String mobileno, String password) {
		super();
		this.userid = userid;
		this.name = name;
		this.emailid = emailid;
		this.address = address;
		this.mobileno = mobileno;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", emailid=" + emailid + ", address=" + address
				+ ", mobileno=" + mobileno + ", password=" + password + "]";
	}
    
    
}

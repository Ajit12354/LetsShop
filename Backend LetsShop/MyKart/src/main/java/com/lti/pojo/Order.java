package com.lti.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "torder")
public class Order {

	@Id
	private long oid;
	private double oprice;
	private int oquantity;
	private String opurchasedetail;
	private String oaddress;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "payid")
	private Payments p;

	public long getOid() {
		return oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public double getOprice() {
		return oprice;
	}

	public void setOprice(double oprice) {
		this.oprice = oprice;
	}

	public int getOquantity() {
		return oquantity;
	}

	public void setOquantity(int oquantity) {
		this.oquantity = oquantity;
	}

	public String getOpurchasedetail() {
		return opurchasedetail;
	}

	public void setOpurchasedetai(String opurchasedetail) {
		this.opurchasedetail = opurchasedetail;
	}

	public String getOaddress() {
		return oaddress;
	}

	public void setOaddress(String oaddress) {
		this.oaddress = oaddress;
	}

	public Payments getP() {
		return p;
	}

	public void setP(Payments p) {
		this.p = p;
	}

	public Order(long oid, double oprice, int oquantity, String opurchasedetail, String oaddress, Payments p) {
		super();
		this.oid = oid;
		this.oprice = oprice;
		this.oquantity = oquantity;
		this.opurchasedetail = opurchasedetail;
		this.oaddress = oaddress;
		this.p = p;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oprice=" + oprice + ", oquantity=" + oquantity + ", opurchasedetail="
				+ opurchasedetail + ", oaddress=" + oaddress + ", p=" + p + "]";
	}
	
	
	
		
}



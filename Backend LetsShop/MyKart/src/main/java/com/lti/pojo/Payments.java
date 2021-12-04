package com.lti.pojo;
import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
@Table(name="tpayment")
public class Payments 
{
	@Id
	@Column(name = "payid")
	private long payid;
	@Column(name = "paytype")
	private String paytype;

	

	public long getPayid() {
		return payid;
	}

	public void setPayid(long payid) {
		this.payid = payid;
	}

	public String getPaytype() {
		return paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	

	

	public Payments(long payid, String paytype) {
		super();
		this.payid = payid;
		this.paytype = paytype;
	}

	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Payments [payid=" + payid + ", paytype=" + paytype + "]";
	}
	
	

}

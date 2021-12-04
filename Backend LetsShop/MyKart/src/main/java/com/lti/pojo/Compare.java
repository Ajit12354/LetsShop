package com.lti.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tcompare")
public class Compare 
{
  @Id
  private int compareid;
  private int productid;

  
  public int getCompareid() {
	return compareid;
}
public void setCompareid(int compareid) {
	this.compareid = compareid;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}

public Compare() {
	super();
	// TODO Auto-generated constructor stub
}
public Compare(int compareid, int productid) {
	super();
	this.compareid = compareid;
	this.productid = productid;

}
@Override
public String toString() {
	return "Compare [compareid=" + compareid + ", productid=" + productid + "]";

	
}

  
  
}

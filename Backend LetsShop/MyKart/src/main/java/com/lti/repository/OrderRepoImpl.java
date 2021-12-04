package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.pojo.Order;
import com.lti.pojo.OrderDetails;

@Repository
public class OrderRepoImpl implements OrderRepo {
	
	@Autowired
	EntityManager eMan;

	@Override
	public List<OrderDetails> getOrderDetailById(long oid) {
		return null;
	}

	@Override
	public List<Order> getOrders(int uid) {
		List<Order> l=eMan.createQuery("from Order").getResultList();
		return l;
	}

}

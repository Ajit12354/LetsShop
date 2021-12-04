package com.lti.repository;

import java.util.List;

import com.lti.pojo.Order;
import com.lti.pojo.OrderDetails;

public interface OrderRepo {
	public List<OrderDetails> getOrderDetailById(long oid);
	public List<Order> getOrders(int uid);
}

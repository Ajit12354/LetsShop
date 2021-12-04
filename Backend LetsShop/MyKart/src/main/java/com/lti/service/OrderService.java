package com.lti.service;

import java.util.List;

import com.lti.pojo.Order;
import com.lti.pojo.OrderDetails;

public interface OrderService {
	public List<Order> getOrders(int uid);
}

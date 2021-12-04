package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.pojo.Order;
import com.lti.pojo.OrderDetails;
import com.lti.repository.OrderRepo;

@Service
@Transactional
public class OrderServiceImpl implements OrderService
{

	@Autowired
	OrderRepo or;

	@Override
	public List<Order> getOrders(int uid) {
		return or.getOrders(uid);
	}

}

package com.sprintaws.service;

import java.util.List;
import java.util.Optional;

import com.sprintaws.entity.OrderDetails;
//import com.sprintaws.entity.Restaurant;
//import com.sprintaws.entity.Customer;

public interface IOrderService 
{
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public void removeOrder(int orderid);
	public OrderDetails viewOrder(int orderid);
	//public List<OrderDetails> viewAllOrders(Restaurant res);
	//public List<OrderDetails> viewAllOrders(Customer customer);
}


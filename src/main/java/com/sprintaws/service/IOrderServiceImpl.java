package com.sprintaws.service;


import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sprintaws.entity.OrderDetails;
import com.sprintaws.repository.IOrderRepository;


@Service
public class IOrderServiceImpl implements IOrderService
{
	@Autowired
	private IOrderRepository repository;

	
	@Override
	public OrderDetails addOrder(OrderDetails order) {
		
		return repository.save(order);
	}

	
//	@Override
//	public OrderDetails updateOrder(OrderDetails order) {
//		OrderDetails ord =repository.findById(order.getOrderId()).orElseThrow(
//				() -> new EntityNotFoundException("no order found by the id"));
//		ord.setOrderStatus(order.getOrderStatus());
//		return repository.save(ord); 
//	}
//	
//	
//	
//	@Override
//	public void removeOrder(OrderDetails order) {
//		OrderDetails ord = repository.findById(order.getOrderId()).orElseThrow(
//				() -> new EntityNotFoundException("No order found"));
//		repository.deleteById(order.getOrderId());
//		
//	}
//
////	@Override
////	public OrderDetails findOrderById(int order) {
////		OrderDetails ord=repository.findById(order);
////		return ord;
////	}
//	
//	@Override
//	public Optional<OrderDetails> findOrderById(int order) {
//		Optional<OrderDetails> ord=repository.findById(order);
//		return ord;
//	}

//	@Override
//	public List<OrderDetails> viewAllOrders(Restaurant res) {
//		return repository.findAll();
//	}
//
//	@Override
//	public List<OrderDetails> viewAllOrders(Customer customer) {
//		return repository.findAll();
//	}
	
}

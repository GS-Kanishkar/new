package com.sprintaws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.sprintaws.entity.OrderDetails;
//import com.sprintaws.entity.Restaurant;
import com.sprintaws.service.IOrderServiceImpl;



@RestController
@RequestMapping("/order")
public class OrderDetailsController {
	@Autowired
	IOrderServiceImpl orderService;
	
	
//	@GetMapping
//	public List<OrderDetails>  viewAllOrders(Customer cust){
//		return orderService.viewAllOrders(cust);
//	}
//	
//	@GetMapping
//	public List<OrderDetails>  viewAllOrders(Restaurant res){
//		return orderService.viewAllOrders(res);
//	}
	

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public OrderDetails addOrder(@RequestBody OrderDetails order) {
		return orderService.addOrder(order);
	}
	
	
	@PutMapping
	public  OrderDetails updateOrder(@RequestBody OrderDetails order) {
		return orderService.updateOrder(order);
	}
	
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void removeOrder(OrderDetails order) {
		orderService.removeOrder(order);
	}
	
	
	
}
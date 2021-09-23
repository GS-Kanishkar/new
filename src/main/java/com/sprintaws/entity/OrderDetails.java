package com.sprintaws.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import com.sprintaws.entity.FoodCart;

@Entity
@Table(name="orders")
public class OrderDetails 
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int orderId;
	private LocalDateTime orderDate;
	//FoodCart cart;
	private String orderStatus;
	
	public int getOrderId() 
	{
		return orderId;
	}
	public void setOrderId(int orderId) 
	{
		this.orderId = orderId;
	}
	public LocalDateTime getOrderDate() 
	{
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate)
	{
		this.orderDate = orderDate;
	}
//	public FoodCart getCart()
//	{
//		return cart;
//	}
//	public void setCart(FoodCart cart) 
//	{
//		this.cart = cart;
//	}
	public String getOrderStatus() 
	{
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus)
	{
		this.orderStatus = orderStatus;
	}
}





package com.sprintaws.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sprintaws.entity.OrderDetails;



public interface IOrderRepository extends JpaRepository<OrderDetails,Integer>{
	
}

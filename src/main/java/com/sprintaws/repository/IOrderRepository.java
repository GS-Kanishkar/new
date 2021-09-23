package com.sprintaws.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprintaws.entity.OrderDetails;


@Repository
public interface IOrderRepository extends JpaRepository<OrderDetails,Integer>{
	
}

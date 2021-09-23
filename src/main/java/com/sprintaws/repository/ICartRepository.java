package com.sprintaws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprintaws.entity.FoodCart;

@Repository
public interface ICartRepository extends JpaRepository<FoodCart,Integer> {

}


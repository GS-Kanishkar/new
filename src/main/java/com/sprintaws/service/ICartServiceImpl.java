package com.sprintaws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprintaws.entity.FoodCart;
import com.sprintaws.entity.Item;
import com.sprintaws.repository.ICartRepository;

@Service
public class ICartServiceImpl implements ICartService {
	
	@Autowired
	private ICartRepository repository;

	@Override
	public FoodCart addItemToCart(FoodCart cart, Item item) {
		return repository.save(item);
	}

	@Override
	public FoodCart IncreaseQuantity(FoodCart cart, Item item, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodCart reduceQuantity(FoodCart cart, Item item, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodCart removeItem(FoodCart cart, Item item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodCart clearCart(FoodCart cart) {
		// TODO Auto-generated method stub
		return null;
	}

}

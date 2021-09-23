package com.sprintaws.service;

import com.sprintaws.entity.FoodCart;
import com.sprintaws.entity.Item;

public interface ICartService {

	public FoodCart addItemToCart(FoodCart cart,Item item);
	public FoodCart IncreaseQuantity(FoodCart cart,Item item,int quantity);
	public FoodCart reduceQuantity(FoodCart cart,Item item,int quantity);
	public FoodCart removeItem(FoodCart cart,Item item);
	public FoodCart clearCart(FoodCart cart);
}

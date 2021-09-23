package com.sprintaws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="itemid")
	private int itemid;
	
	@Column(name = "itemname")
	private String ItemName;
	
	@Column(name = "category")
	private Category category;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "cost")
	private double cost;

	
	
}
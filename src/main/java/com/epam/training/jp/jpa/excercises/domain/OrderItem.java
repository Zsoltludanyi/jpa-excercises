package com.epam.training.jp.jpa.excercises.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OrderItem {


	//TODO: implement
	@Id
	@GeneratedValue
	private int id;
	private int quantity;
	@OneToOne(cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	private Food food;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public OrderItem() {
		
	}
	public OrderItem(Food f, int quantity) {
		this.food = f;
		this.quantity = quantity;
	}

	// methods to compile project
	public Food getFood() {
		return food;
	}

	public int getQuantity() {
		return quantity;
	}
}

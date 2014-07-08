package com.epam.training.jp.jpa.excercises.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class FoodOrder {
	//TODO: implement
	@Id
	@GeneratedValue
	private int id;
	private String costumer;
	@OneToOne(cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	private Address deliveryAddress;
	@OneToMany(cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	private List<OrderItem> orderItems;
	
	
	@Enumerated
	private OrderState state;

	public int getId() {
		return id;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public OrderState getState() {
		return state;
	}

	public void setState(OrderState state) {
		this.state = state;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCostumer() {
		return costumer;
	}

	public void setCostumer(String costumer) {
		this.costumer = costumer;
	}

	public FoodOrder() {
		
	}
	public FoodOrder(List<OrderItem> createOrderItems, Address address, String customer, OrderState pending) {
		this.orderItems=createOrderItems;
		this.deliveryAddress = address;
		this.costumer = customer;
		this.state = pending;
	}

	// methods to compile project
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	

}

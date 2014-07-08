package com.epam.training.jp.jpa.excercises.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Menu {
	//TODO: implement

	@Id
	@GeneratedValue
	private int id;
	
	private  Date fromDate;
	private  Date toDate;
	@OneToMany(cascade={CascadeType.PERSIST,CascadeType.REMOVE},fetch=FetchType.EAGER) 
	private List<Food> foods;
	
	public Date getFromDate() {
		return fromDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	// methods to compile project
	public List<Food> getFoods() {
		return foods;
	}
}

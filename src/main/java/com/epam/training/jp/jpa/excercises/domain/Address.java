package com.epam.training.jp.jpa.excercises.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	//TODO: implement
	private String country;
	private String city;
	private String street;
	private String zipCode;
	@Id
	@GeneratedValue
	private int id;
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// methods to compile project
	public void setCountry(String country) {
		this.country = country;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setZipCode(String readLine) {
		this.zipCode = readLine;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	public String getZipCode() {
		return zipCode;
	}


}

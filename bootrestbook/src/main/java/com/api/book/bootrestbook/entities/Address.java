package com.api.book.bootrestbook.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Jpa_Address")
public class Address {
	@Id
	private int addressID;
	private String street;
	private String city;
	private String country;
	
	@ManyToOne
	@JoinColumn(name="student_ID")
	private Student student;
	
	public Address(int addressID, String street, String city, String country) {
		super();
		this.addressID = addressID;
		this.street = street;
		this.city = city;
		this.country = country;
	}
	public int getAddressID() {
		return addressID;
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address() {
		super();
	}

}

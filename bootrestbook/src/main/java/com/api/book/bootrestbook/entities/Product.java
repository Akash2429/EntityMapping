package com.api.book.bootrestbook.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;



@Entity
@Table(name="jpa_product")
public class Product {
	
	
	public Product() {
		super();
	}
	public String getpID() {
		return pID;
	}
	public void setpID(String pID) {
		this.pID = pID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	
	@Id
	private String pID;
	public Product(String pID, String productName) {
		super();
		this.pID = pID;
		this.productName = productName;
	}
	private String productName;

	@ManyToMany
	private List<Category>categories=new ArrayList<>();
}

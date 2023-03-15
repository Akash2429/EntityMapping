package com.api.book.bootrestbook.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="jpa_category")
public class Category {

	@Id
	private String cID;
	public Category(String cID, String title) {
		super();
		this.cID = cID;
		this.title = title;
	}
	
	
	@ManyToMany(mappedBy="categories",cascade=CascadeType.ALL)
	private List<Product>products=new ArrayList<>();
	public Category() {
		super();
	}
	public String getcID() {
		return cID;
	}
	public void setcID(String cID) {
		this.cID = cID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	private String title;
}

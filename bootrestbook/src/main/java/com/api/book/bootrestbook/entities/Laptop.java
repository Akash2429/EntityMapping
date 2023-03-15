package com.api.book.bootrestbook.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="jpa_laptop")
public class Laptop {
	
	@Id
	private int LaptopID;
	private String ModelName;
	private String LaptopBrand;
	
    @OneToOne
    @JoinColumn(name="studentId")
	private Student student;

	public Laptop(int laptopID, String modelName, String laptopBrand, Student student) {
		super();
		LaptopID = laptopID;
		ModelName = modelName;
		LaptopBrand = laptopBrand;
		this.student = student;
	}

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public int getLaptopID() {
		return LaptopID;
	}

	public void setLaptopID(int laptopID) {
		LaptopID = laptopID;
	}

	public String getModelName() {
		return ModelName;
	}

	public void setModelName(String modelName) {
		ModelName = modelName;
	}

	public String getLaptopBrand() {
		return LaptopBrand;
	}

	public void setLaptopBrand(String laptopBrand) {
		LaptopBrand = laptopBrand;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}

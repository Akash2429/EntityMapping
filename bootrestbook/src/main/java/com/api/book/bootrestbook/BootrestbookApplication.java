package com.api.book.bootrestbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.book.bootrestbook.dao.StudentRepository;
import com.api.book.bootrestbook.entities.Laptop;
import com.api.book.bootrestbook.entities.Student;

@SpringBootApplication
public class BootrestbookApplication implements CommandLineRunner{

	@Autowired
	private StudentRepository studentRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BootrestbookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setStundentName("Akash");
		student.setAbout("I am Intern in Mobirey");
		student.setStudentId(1);
	
		
		Laptop laptop=new Laptop();
		laptop.setModelName("1234");
		laptop.setLaptopBrand("HP");
		laptop.setLaptopID(1);
		laptop.setStudent(student);
		student.setLaptop(laptop);
		
		
		
		
		studentRepository.save(student);
	}  
}

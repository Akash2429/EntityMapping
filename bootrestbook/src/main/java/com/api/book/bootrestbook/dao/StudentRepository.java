package com.api.book.bootrestbook.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.book.bootrestbook.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	
}

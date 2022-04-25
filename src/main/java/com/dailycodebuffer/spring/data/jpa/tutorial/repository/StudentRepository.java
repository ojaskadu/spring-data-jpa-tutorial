package com.dailycodebuffer.spring.data.jpa.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Student;

@Repository    //this particular interface is a repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	

}

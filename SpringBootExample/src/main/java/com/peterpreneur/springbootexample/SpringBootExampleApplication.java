package com.peterpreneur.springbootexample;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Student;

@SpringBootApplication
//@RestController
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}
	
	//@GetMapping
	//public List<Student> getStudents() {
	//	return List.of(
	//			new Student(
	//					1L, 
	//					"Miriam", 
	//					"miriam@gmail.com", 
	//					LocalDate.of(2000, Month.JANUARY, 5), 
	//					21
	//			)
	//	);
	//}
}

package com.peterpreneur.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

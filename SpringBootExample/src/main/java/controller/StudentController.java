package controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import entity.Student;

public class StudentController {
	@GetMapping
	public List<Student> hello() {
		return List.of(new Student(1L, "Miriam", "miriam@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 21));
	}
}

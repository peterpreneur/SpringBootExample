package com.peterpreneur.springbootexample.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.peterpreneur.springbootexample.domain.Student;

public class StudentService {
	public List<Student> getStudents() {
		return List.of(new Student(1L, "Miriam", "miriam@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 21));
	}
}

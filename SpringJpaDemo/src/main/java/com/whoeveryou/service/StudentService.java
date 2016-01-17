package com.whoeveryou.service;

import java.util.List;

import com.whoeveryou.model.Student;

public interface StudentService {
	
	Student save(Student student);
	List<Student> findALLStudents();
}

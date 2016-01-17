package com.whoeveryou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.whoeveryou.model.Student;
import com.whoeveryou.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Transactional
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> findALLStudents() {
		return studentRepository.findAll();
	}

}

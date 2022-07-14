package com.school.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.application.model.Student;
import com.school.application.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo repo;
	
	
	public Student saveStudent( Student student) {
		return repo.save(student);
	}
	
	public Optional<Student> getStudent(int id) {
		return repo.findById(id);
	}
	
	public String deleteStudent(int id) {
		 repo.deleteById(id);
		return "SUCCESS";
	}
	
	public List<Student> getAllStudents(){
		return repo.findAll();
	}
	
}

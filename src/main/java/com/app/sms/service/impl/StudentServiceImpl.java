package com.app.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.sms.entity.Student;
import com.app.sms.repository.StudentRespository;
import com.app.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRespository studentRespository;
	
	public StudentServiceImpl(StudentRespository studentRespository) {
		super();
		this.studentRespository = studentRespository;
	}


	@Override
	public List<Student> getAllStudents() {
		return studentRespository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRespository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		
		return studentRespository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		
		return studentRespository.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		studentRespository.deleteById(id);
		
	}

}

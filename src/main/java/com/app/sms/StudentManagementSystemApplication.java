package com.app.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.sms.entity.Student;
import com.app.sms.repository.StudentRespository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRespository studentRespository;
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * // Student student1 = new Student("Mohamed","Kaazif",
		 * "mohammedkaazif@gmail.com"); // studentRespository.save(student1); // //
		 * Student student2 = new Student("John","Peter", "John@gmail.com"); //
		 * studentRespository.save(student2); // // Student student3 = new
		 * Student("Elroy","Peter", "Elroy@gmail.com"); //
		 * studentRespository.save(student3); //
		 */	}

}

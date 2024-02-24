package com.app.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.sms.entity.Student;


public interface StudentRespository extends JpaRepository<Student, Long>{

}

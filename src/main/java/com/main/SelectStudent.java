package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entities.StudentEntity;
import com.repository.StudentRepository;

public class SelectStudent {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		StudentRepository sr = (StudentRepository) ctx.getBean("studentRepository");
		
		StudentEntity se=sr.getByFirstName("Arjun");
		System.out.println(se.toString());
		
		List<StudentEntity> students=sr.getByAddress("Kaski");
		for(StudentEntity s:students) {
			System.out.println(s.toString());
		}
        List<StudentEntity>allStudent=sr.getAllStudent();
        
        for (StudentEntity se1:allStudent) {
        	System.out.println(se1.toString());
        }
	}

}

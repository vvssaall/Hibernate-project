package com.main;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entities.StudentEntity;
import com.repository.StudentRepository;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		StudentRepository sr = (StudentRepository) ctx.getBean("studentRepository");
		
		StudentEntity se=new StudentEntity();
		se.setId(4);
		se.setFirstName("Sandeep");
		se.setLastName("Pokheral");
		se.setAddress("ohio");
		se.setDateOfBirth(new Date(755334291));
		sr.save(se);	
	}

}

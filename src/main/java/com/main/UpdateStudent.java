package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entities.StudentEntity;
import com.repository.StudentRepository;

public class UpdateStudent {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("context.xml");
		StudentRepository sr=(StudentRepository) ctx.getBean("studentRepository");
		
		StudentEntity se=sr.getById(5);
		System.out.println(se.toString());
		se.setFirstName("Arjun");
		se.setLastName("KC");
		sr.update(se);
		
		

	}

}

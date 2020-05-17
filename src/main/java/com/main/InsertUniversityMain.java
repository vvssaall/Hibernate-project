package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entities.StudentEntity;
import com.entities.UniversityEntity;
import com.repository.StudentRepository;
import com.repository.UniversityRepository;

public class InsertUniversityMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

		StudentRepository sr = (StudentRepository) ctx.getBean("studentRepository");

		UniversityRepository ur = (UniversityRepository) ctx.getBean("universityRepository");

		int studentId = 3;
		StudentEntity s = sr.getById(studentId);
		if (s == null) {
			System.out.println("student doesnot exit");

		} else {
			UniversityEntity u = new UniversityEntity();
			u.setName("Nepal Engineering College");
			u.setAddress("Kathmandu");
			u.setEmailAddress("nec@edu");
			u.setPhoneNumber("346283462983");

			ur.save(u);

		}

	}

}

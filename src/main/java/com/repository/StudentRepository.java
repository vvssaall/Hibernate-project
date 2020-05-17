package com.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entities.StudentEntity;

public class StudentRepository {
	private SessionFactory sessionFacatory;

	public void save(StudentEntity studentEntity) {
		Session session = sessionFacatory.openSession();
		session.beginTransaction();

		session.save(studentEntity);
		session.getTransaction().commit();
		session.close();
	}

	public void update(StudentEntity studentEntity) {
		Session session = sessionFacatory.openSession();
		session.beginTransaction();

		session.merge(studentEntity);
		session.getTransaction().commit();
		session.close();

	}

	public StudentEntity getById(int id) {
		Session session = sessionFacatory.openSession();
		session.beginTransaction();

		StudentEntity s = (StudentEntity) session.get(StudentEntity.class, id);
		session.getTransaction().commit();
		session.close();
		return s;
	}

	public StudentEntity getByFirstName(String FirstName) {
		Session session = sessionFacatory.openSession();
		session.beginTransaction();

		Query q = session.createQuery("select s from StudentEntity s where s.FirstName=:firstName");
		q.setParameter("firstName", FirstName);
		List<StudentEntity> students = q.list();
		return students.get(0);

	}

	public List<StudentEntity> getByAddress(String Address) {
		Session session = sessionFacatory.openSession();
		session.beginTransaction();

		Query q = session.createQuery("select s from StudentEntity s where s.Address=:address");
		q.setParameter("address", Address);

		List<StudentEntity> students = q.list();
		session.getTransaction().commit();
		session.close();
		return students;

	}
	
	public List<StudentEntity> getAllStudent(){
		Session session=sessionFacatory.openSession();
		session.beginTransaction();
		
		Query q1=session.createQuery("select s from StudentEntity s");
		
		List<StudentEntity>students=q1.list();
		session.getTransaction().commit();
		session.close();
		return students;
		
	}
	
	

	public SessionFactory getSessionFacatory() {
		return sessionFacatory;
	}

	public void setSessionFacatory(SessionFactory sessionFacatory) {
		this.sessionFacatory = sessionFacatory;
	}

}

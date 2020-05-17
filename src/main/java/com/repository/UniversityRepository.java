package com.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entities.UniversityEntity;

public class UniversityRepository {
	private SessionFactory sessionFacatory;

	public void save(UniversityEntity universityEntity) {
		Session session = sessionFacatory.openSession();
		session.beginTransaction();

		session.save(universityEntity);
		session.getTransaction().commit();
		session.close();

	}

	public SessionFactory getSessionFacatory() {
		return sessionFacatory;
	}

	public void setSessionFacatory(SessionFactory sessionFacatory) {
		this.sessionFacatory = sessionFacatory;
	}

}

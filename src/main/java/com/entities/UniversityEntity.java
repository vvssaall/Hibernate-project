package com.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="University")
public class UniversityEntity {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;

@Column(name="name")
private String Name;

@Column(name="address")
private String Address;

@Column(name="phone_number")
private String PhoneNumber;

@Column(name="email_address")
private String EmailAddress;

@OneToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
@JoinColumn(name="university_id")
StudentEntity studentEntity;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public String getPhoneNumber() {
	return PhoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	PhoneNumber = phoneNumber;
}

public String getEmailAddress() {
	return EmailAddress;
}

public void setEmailAddress(String emailAddress) {
	EmailAddress = emailAddress;
}

public StudentEntity getStudentEntity() {
	return studentEntity;
}

public void setStudentEntity(StudentEntity studentEntity) {
	this.studentEntity = studentEntity;
}

@Override
public String toString() {
	return "UniversityEntity [id=" + id + ", Name=" + Name + ", Address=" + Address + ", PhoneNumber=" + PhoneNumber
			+ ", EmailAddress=" + EmailAddress + ", studentEntity=" + studentEntity + "]";
}




	
}

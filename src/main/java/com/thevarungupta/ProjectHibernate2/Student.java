package com.thevarungupta.ProjectHibernate2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private String email;
	
//	@OneToOne
//	private Course course;
	
	@OneToMany
	private List<Course> courses;
	
	
	public Student() {}

	

	public Student(int id, String name, String email, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.course = course;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
	
	
}

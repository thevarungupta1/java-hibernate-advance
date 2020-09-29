package com.thevarungupta.ProjectHibernate2;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Embeddable
@Entity
public class Course {

	@Id
	private int id;
	private String cname;
	private int price;
	@OneToOne
	private Student student;
	
	public Course() {}

	

	



	public int getId() {
		return id;
	}







	public void setId(int id) {
		this.id = id;
	}







	public Course(int id, String cname, int price, Student student) {
		super();
		this.id = id;
		this.cname = cname;
		this.price = price;
		this.student = student;
	}







	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
	
}

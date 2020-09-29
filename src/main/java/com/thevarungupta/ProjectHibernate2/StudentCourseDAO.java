package com.thevarungupta.ProjectHibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentCourseDAO {
	
	public static void main(String[] args) {
		System.out.println( "Started...." );
        
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        
        // Student
        Student std = new Student();
        std.setId(1);
        std.setName("mark");
        std.setEmail("m@gamil.com");
        
        
        Course course = new Course();
        course.setCname("java");
        course.setPrice(1000);
        course.setStudent(std);
        std.setCourse(course);
        
//        Session session =  factory.getCurrentSession();
//        session.save(cust);
        
        Session session = factory.openSession();
        Transaction txt = session.beginTransaction();
        session.save(std);
        session.close();
        
       Student student =  session.load(Student.class, 1);
       student.getCourse().getCname();
        
        
        System.out.println("Customer saved");
		
	}

}

package com.thevarungupta.ProjectHibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Started...." );
        
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        
        // Customer
        Customer cust = new Customer();
        cust.setCustomerId(1);
        cust.setName("mark");
        cust.setEmail("m@gmail.com");
        
//        Session session =  factory.getCurrentSession();
//        session.save(cust);
        
        Session session = factory.openSession();
        Transaction txt = session.beginTransaction();
        session.save(cust);
        session.close();
        
        
        System.out.println("Customer saved");
        
        
        
    }
}

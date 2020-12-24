package com.telusko.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Alien telusko = new Alien(); 
    	
    	telusko.setAid(101);
    	telusko.setAname("navin");
    	telusko.setColor("Blue");
    	
    	Configuration con = new Configuration();	
    	
    	SessionFactory sf = con.buildSessionFactory();
    		
    	Session session = sf.openSession();
    	session.save (telusko); 
 
        System.out.println( "Hello World!" );
    }
}

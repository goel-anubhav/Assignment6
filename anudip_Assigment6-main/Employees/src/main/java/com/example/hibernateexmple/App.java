package com.example.hibernateexmple;


import java.util.List;

import org.hibernate.Query;
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
    	Configuration con=new Configuration().configure().addAnnotatedClass(agent.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tr=session.beginTransaction();
    	
    agent a1=new agent();
    agent b1=new agent();
    agent c1=new agent();
   
        a1.setId(4);   
    	a1.setName("ram");
    	a1.setCity("lucknow");
    	a1.setcomm_amt(14);
    	session.save(a1);
    	
    	b1.setId(5);   
      	b1.setName("Rohan");
      	b1.setCity("Delhi");
      	b1.setcomm_amt(64);
      	session.save(b1);
      	
        c1.setId(6);   
    	c1.setName("Ravi");
    	c1.setCity("Mumbai");
    	c1.setcomm_amt(44);
    	session.save(c1);
    	
    	tr.commit();
    	
 		System.out.println("id: "+a1.getId()+" name: "+a1.getName()+" city "+a1.getCity()+"  commision amount: "+a1.getcomm_amt());
   		System.out.println("id: "+b1.getId()+" name: "+b1.getName()+" city "+b1.getCity()+"  commision amount: "+b1.getcomm_amt());
    		System.out.println("id: "+c1.getId()+" name: "+c1.getName()+" city "+c1.getCity()+"  commision amount: "+c1.getcomm_amt());
    	session.close();
        System.out.println( " Record inserted " );
    
    }
}
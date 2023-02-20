package com.telusko.myhibo;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    
    	
	
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class);
    	SessionFactory sf = config.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
//    	
//    	Random r = new Random();
//    	for (int i=1;i<=20;i++)
//    	{
//    		Laptop l = new Laptop();
//    		l.setLid(i);
//    		l.setBrand("Dell" + i);
//    		l.setPrice(r.nextInt(500));
//    		session.save(l);
//    		}
    	
//    	Laptop l = new Laptop();
//    	l.setLid(21);
//    	l.setBrand("sony");				// transient state
//    	l.setPrice(700);
//    	
//    	session.save(l);				//it goes in persistance state but if you have an commit else data not gets stored 
//    	l.setPrice(650);				//its store 650 in database insted of 700 because the object is still in persistence state so it fire update query
//    	
//    	tx.commit();
//    	session.detach(l);				//onject get detached and database store till 650
//    	l.setPrice(750);
    	
    	
    	
   //for mapping 	
//    	Laptop l1 = session.get(Laptop.class, 12);
//    	Alien a1 = session.get(Alien.class, 101);
//    	l1.setAlien(a1);
//    	session.saveOrUpdate(l1);

//   	
//    	session.get(Alien.class, 109).getLaps().forEach(mk->System.out.println(mk));
    	
    	
//    	Alien a1 = session.get(Alien.class, 101);
    	//System.out.println(a1.getAname());
    	
    	
//    	Collection<Laptop> laps = a1.getLaps();
//    	for(Laptop l : laps)
//    	{
//    		System.out.println(l);
//    	}

//    	Laptop lap = session.get(Laptop.class, 6);		//it fire query every time database gets hit  if data not present it returns null
    	Laptop lap = session.load(Laptop.class,6);		//it give proxy object insted of real  onject if data not present it returns exception null pointer
    	
    	
        tx.commit();
    }
}

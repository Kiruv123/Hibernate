package com.tevisko.Demohib;

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
//    	
//    	AlienName an = new AlienName();
//    	an.setFname("kiran");
//    	an.setLname("bodse");
//    	an.setMname("dinesh");
//    	
       Alien a = null;
    	
//       Alien tevisko = new Alien();
//       tevisko.setAid(103);
//       tevisko.setAname("dkdl");
//       tevisko.setColor("blue");
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
       
      
       SessionFactory sf = con.buildSessionFactory();
       Session session1 = sf.openSession();
       Transaction tx= session1.beginTransaction();
      
       a=(Alien)session1.get(Alien.class,101);
       System.out.println(a);
     
//       session1.save(tevisko);
       tx.commit();
       session1.close();
       
       Session session2 = sf.openSession();
      
       Transaction tx1= session2.beginTransaction();
       
       
       
       a=(Alien)session2.get(Alien.class,101);
       System.out.println(a);
//       tevisko = (Alien)session.get(Alien.class, 103);
       tx1.commit();
       session2.close();
//       session1.save(tevisko);
       
     
       
//       System.out.println(tevisko);
       
    }
}

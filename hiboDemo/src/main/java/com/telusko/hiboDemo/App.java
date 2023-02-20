package com.telusko.hiboDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
    public static void main( String[] args )
    {
//    	Laptop laptop = new Laptop();
//    	laptop.setLid(101);
//    	laptop.setLname("Dell");
//    	
//    	Student s = new Student();
//    	s.setRollno(1);
//    	s.setName("Kiran");
//    	s.setMarks(90);
//    	s.setLaptop(laptop); //for one to one 
//    	s.getLaptop().add(laptop);
    	
//    	laptop.getStudent().add(s);
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	
    	SessionFactory sf= con.buildSessionFactory();
    	Session session = sf.openSession();
    	
    	Transaction tx= session.beginTransaction();
    	
//    	Random r = new Random();
//    	
//    	for(int i=1; i<=50;i++)
//    	{
//    		Student s = new Student();
//    		s.setRollno(i);
//    		s.setName("Name" + i);
//    		s.setMarks(r.nextInt(100));
//    		session.save(s);
//    	}
    	
    	
//    	Query q = session.createQuery("from Student");
//    	List<Student> student = q.list();	
//    	for(Student s : student)
//    	{
//    		System.out.println(s);
//    	}
       	
//       	Query q = session.createQuery("from Student where rollno=1");	
//    	Student student = (Student)q.uniqueResult();
//       	System.out.println(student);
    	
    	
//    	Query q = session.createQuery("select rollno,name,marks from Student where rollno = 1");
//    	Object[] student =(Object[])q.uniqueResult();
//    	System.out.println(student[0]+ ":" +student[1]+":"+student[2]);
    	
    	
//    	Query q = session.createQuery("select rollno,name,marks from Student");
//    	List<Object[]> student =(List<Object[]>)q.list();
//    	
//    	for(Object[] students : student)
//    		System.out.println(students[0]+ ":" +students[1]+":"+students[2]);

    	
//        session.save(laptop);
//        session.save(s);
        
        tx.commit();
        
    }
}

package com.db.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.db.entity.Student;

public class StudentDao 
{
	private SessionFactory sf;
	public StudentDao()
	{
		Configuration config = new Configuration ().configure(); 
		sf = config.buildSessionFactory();
	}
	
	public Student InsertStudent(Student s1)
	{
		Session  session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(s1);
		tr.commit();
		return s1;
	}
	public Student DeleteStudent(int id)
	{
		Session  session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Student student=session.get(Student.class,id);
		
		if(student!=null)
		{
			session.remove(student);
		}
		tr.commit();
		return student;
	}
	
	public Student UpdateStudent(int id)
	{
		Session  session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Student student=session.get(Student.class,id);
		
		
		if(student!=null)
		{
		
		student.setName("DJFLOW");
		student.setBatch("DSA");
		student.setMarks(90);
		student.setJoiningdate("19/10/2003");
		session.update(student);
		}
		tr.commit();
		return student;
	}
	public Student findById(int id)
	{
		System.out.println(" DAO called");
		Session session = sf.openSession();
		
		System.out.println("getting data form database");
		Student student = session.get(Student.class, id);
		
		System.out.println("data from DAO:"+student.toString());
		return student;
	}

}

package com.db.service;

import com.db.dao.StudentDao;
import com.db.entity.Student;

public class StudentService 
{
	private StudentDao sDao;
	public StudentService()

	{
		sDao=new StudentDao();
	}
	
	public Student InsertStudent(Student s) {
		// TODO Auto-generated method stub
		return sDao.InsertStudent(s);
	}
	
	public Student DeleteStudent(int id)
	{
		return sDao.DeleteStudent(id);
	}
	public Student UpdateStudent(int id)
	{
		return sDao.UpdateStudent(id);
	}
	
	
	public Student findById(int id)
	{
		System.out.println("Service called");
		return sDao.findById(id); 
	}
	
}

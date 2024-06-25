package com.db.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.entity.Student;
import com.db.service.StudentService;


public class InsertStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter p=response.getWriter();
		
		
		int id=Integer.parseInt(request.getParameter("i1"));
		String s1=request.getParameter("i2");
		String s2=request.getParameter("i3");
		int marks=Integer.parseInt(request.getParameter("i4"));
		String s3=request.getParameter("i5");
		
		p.println(id);
		
			
		
		StudentService stuServ = new StudentService();
		   Student student = stuServ.findById(id);
		   
		   
		   request.setAttribute("student", student);
		   RequestDispatcher rd = request.getRequestDispatcher("details.jsp");
		   rd.forward(request, response);
		   
		   p.println("insert.......");
			
	}

	

}

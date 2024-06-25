package com.db.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.entity.Student;
import com.db.service.StudentService;


public class SearchStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	   
	   int id = Integer.parseInt(   request.getParameter("t1")   );
	   
	   System.out.println("controller called");
	   
	   StudentService stuServ = new StudentService();
	   Student student = stuServ.findById(id);
	   
	   
	   request.setAttribute("student", student);
	   RequestDispatcher rd = request.getRequestDispatcher("details.jsp");
	   rd.forward(request, response);
	   
	   
	}

	

}

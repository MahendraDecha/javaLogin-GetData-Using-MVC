package com.org.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class controlleServlet extends HttpServlet {
	
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String jspPage = "/index.jsp";
		try
		{	    
            System.out.println("contril");
			Login user = new Login();
		     user.setUsername(request.getParameter("name"));
		     user.setPassword(request.getParameter("pwd"));

		     user =  EmployeeDAO.login(user);
			  System.out.println("runing"); 		    
		     if (user.isValid())
		     {
			        
		          HttpSession session = request.getSession(true);	    
		          session.setAttribute("currentSessionUser",user); 
		          if ("displaylist".equals(action)) {

		        	  EmployeeManger manager = new EmployeeManger();
		  			ArrayList employee = manager.getEmployee();
		  			request.setAttribute("employee",employee);
		  			 jspPage = "/welcome.jsp";      		
		         }
		     
		     }
		          
		     else 
		          response.sendRedirect("invalidLogin.jsp"); 
		} 
			catch(Exception e)
		     { 
				
				e.printStackTrace();
		     
		       }
		dispatch(jspPage, request, response);
	
	}
	protected void dispatch(String jsp, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if (jsp != null) {
			RequestDispatcher rd = request.getRequestDispatcher(jsp);
			rd.forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}

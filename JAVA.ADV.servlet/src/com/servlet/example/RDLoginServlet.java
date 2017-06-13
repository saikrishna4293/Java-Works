package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RDLoginServlet extends HttpServlet{
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response ) throws IOException, ServletException{
	
		String fname = request.getParameter("first name");
		String lname = request.getParameter("last name");
		
	/*	RequestDispatcher rd = request.getRequestDispatcher("/common");
		rd.forward(request, response);
		//rd.include(request, response);

		PrintWriter pout = response.getWriter();	
		pout.println("RDLoginServlet class: Welcome User:  "+fname +"  "+ lname);
	*/
		//response.sendRedirect("http://google.com"); 
		response.sendRedirect("/JAVA.ADV.servlet/common");
	}
}

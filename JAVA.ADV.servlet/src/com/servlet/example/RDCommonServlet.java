package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RDCommonServlet extends HttpServlet{
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response ) throws IOException{
		
		String fname = request.getParameter("first name");
		String lname = request.getParameter("last name");
		
		PrintWriter pout = response.getWriter();
		pout.println("RDcommonServlet class: Welcome User:  "+fname +"  "+ lname);
	}
}

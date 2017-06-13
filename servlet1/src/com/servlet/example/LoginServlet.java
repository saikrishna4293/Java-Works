package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response ) throws IOException{
		PrintWriter pout = response.getWriter();

		String fname = request.getParameter("first name");
		String lname = request.getParameter("last name");
		pout.println("LoginServlet class: Welcome User:  "+fname +"  "+ lname);
		//pout.println("Hi "+uname+", how are you");
	}
}

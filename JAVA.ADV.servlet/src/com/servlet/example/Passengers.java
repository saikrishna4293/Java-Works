package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Passengers extends HttpServlet {

	public void service(HttpServletRequest rq, HttpServletResponse rs) throws IOException{

		PrintWriter out = rs.getWriter();
		out.println("Passengers class: Hello welcome to TSRTC");
	}
}

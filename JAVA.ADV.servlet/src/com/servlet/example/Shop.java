package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Shop extends HttpServlet{
	
	
	public void service(HttpServletRequest rq, HttpServletResponse rs ) throws IOException{
		PrintWriter pw = rs.getWriter();
		
		String name = rq.getParameter("custname");
		String prod = rq.getParameter("product");
		String qua = rq.getParameter("quantity");
		int i = Integer.parseInt(qua);
		
		pw.println("Hello :  "+name) ;
		if(prod.equalsIgnoreCase("chocolates")){
			int j= 100;
			if (i<j){
				pw.println("\n			I have chocolates left :  "+j+",");
				pw.println("\n			you ordered :" +i+" chocolates,");
				j= j-i;
				pw.println("			Total price is : " + i+"$,");
				pw.println("			THANK YOU  "+name+ " PLEASE VISIT AGAIN,  ");
				pw.println("			Chocolates remaining :" +j+".");
			}
		}
		if(prod.equalsIgnoreCase("sweets")){
			int k= 100;
			if (i<k){
				pw.println("			I have sweets left :  "+k+",");
				pw.println("   		you ordered :" +i+ " sweets,");
				k= k-i;
				int y = i*3;
				pw.println("			Total price is : " + y+"$,");
				pw.println("			THANK YOU  "+name+ " PLEASE VISIT AGAIN , ");
				pw.println("			sweets remaining :" +k+".");
			}
		}		
	}
}

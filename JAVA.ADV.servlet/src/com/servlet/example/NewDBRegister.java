package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewDBRegister extends HttpServlet {

	public void doPost(HttpServletRequest rq, HttpServletResponse rs) throws IOException{
		
		String fname = rq.getParameter("first name");
		String lname = rq.getParameter("last name");
		String uname = rq.getParameter("user name");
		String pa = rq.getParameter("pass");
		String mail = rq.getParameter("email");
		String phno = rq.getParameter("phone no");
		PrintWriter pout = rs.getWriter();

		if(fname!=null){
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
				String query = "insert into krishna values (?,?,?,?,?,?) ";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1,fname);
				ps.setString(2,lname);
				ps.setString(3,uname);
				ps.setString(4,pa);
				ps.setString(5,mail);
				ps.setString(6,phno);
				int i=ps.executeUpdate();
				pout.println("rows updated: "+i);
				
				pout.println("Registered successfully, Thank you for having an account");
				pout.println("entered first name: "+fname);
				pout.println("entered last name: "+lname);
				pout.println("entered user name: "+uname);
				pout.println("entered email address: "+mail);
				pout.println("entered phone number: "+phno);
			
			}catch (ClassNotFoundException e) {
				pout.println("ClassNotFoundException haha");
			} catch (SQLException e) {
				pout.println("SQL exception haha");
			} finally{
				pout.println("executions done");
			}
		}		
	}
}

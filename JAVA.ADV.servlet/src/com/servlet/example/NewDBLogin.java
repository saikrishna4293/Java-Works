package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewDBLogin extends HttpServlet {

	public void service(HttpServletRequest rq, HttpServletResponse rs) throws IOException{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			String query = "select * from krishna where username=?";
			String uname = rq.getParameter("username");
			String passwd= rq.getParameter("pass");
			int i = Integer.parseInt(passwd);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,uname);

			ResultSet rs1 = ps.executeQuery();
			while(rs1.next()){
				String fn=rs1.getString("firstname");
				String ln=rs1.getString("lastname");
				String un=rs1.getString("username");
				int pa=rs1.getInt("pass");
				PrintWriter out = rs.getWriter();
				if(i==pa&&uname==un){
					out.println("Login Successful");
					out.println("welcome Mr. "+fn+" "+ln);
				}else{
					out.println("username or password is incorrect");
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}


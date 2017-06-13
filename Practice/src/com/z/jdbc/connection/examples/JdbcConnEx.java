package com.z.jdbc.connection.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//load drivers
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//establish connection
		//url = "driver:@ d/b host name:port:service name"
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "hr";
		String pwd = "hr";
		Connection con = DriverManager.getConnection(url,username,pwd);
		
		//create statement or prepared statement
		Statement stmt = con.createStatement();
		
		//for reading data or getting o/p
		ResultSet rs = stmt.executeQuery("select * from employees where employee_id<110");
		
		//the above line can read data but to display we use for loop
		while(rs.next()){
			String eid=rs.getString("employee_id");
			String fname=rs.getString("first_name");
			String lname=rs.getString("last_name");
			System.out.println("empID: "+eid+", firstname: "+fname+", lastname: "+lname);
		}
	}
}

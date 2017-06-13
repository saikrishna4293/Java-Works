package com.z.jdbc.connection.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnExPS {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {	
	
		Connection con=null;
		PreparedStatement ps=null; 
		ResultSet rs=null;
		try{
			//load drivers
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			//establish connection
			//url = "driver:@ d/b host name:port:service name"
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "hr";
			String pwd = "hr";
			con = DriverManager.getConnection(url,username,pwd);
	
			//create statement or prepare statement
			ps = con.prepareStatement("select employee_id,first_name, last_name, department_name, city "
					+ "from employees e, departments d, locations l "
					+ "where employee_id<? and employee_id not in(103,112,115) and d.department_name not in 'IT'"
					+ "and e.department_id = d.department_id "
					+ "and l.location_id = d.location_id order by employee_id asc");// and last_name=?");
			ps.setInt(1,120);
			//ps.setString(2,"King");
				
			//for reading data or getting o/p
			rs = ps.executeQuery();
		
		/*	ps.setInt(1, 106);
			ResultSet rs2 = ps.executeQuery();
		*/
			//the above line can read data but to display we use for loop
			while(rs.next()){
			String eid=rs.getString("employee_id");
			String fname=rs.getString("first_name");
			String lname=rs.getString("last_name");
			String dname=rs.getString("department_name");
			String location = rs.getString("city");
			System.out.println("EMPID: "+eid+", FIRSTNAME: "+fname+ "\t"+", LASTNAME: "+lname+"\t"
								+", DEPARTMENT NAME: "+dname+"\t"+ ", City: "+location);
			}		
		}finally{
			if(rs!=null){
				rs.close();
			}
			if(ps!=null){
				ps.close();
			}
			if(con!=null){
				con.close();
			}
		}
	}
}
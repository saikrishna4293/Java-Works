package com.z.jdbc.connection.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcConnInsert {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {	
	
		Connection con=null;
		PreparedStatement ps=null; 

		try{
			//load drivers
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			//establish connection
			//url = "driver:@ d/b host name:port:service name"
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	
			//To insert data
			String insertTableSQL = "insert into departments values (?,?,?,?) ";
			ps = con.prepareStatement(insertTableSQL);
			ps.setInt(1, 280);
			ps.setString(2,"Saikrishna Post");
			ps.setInt(3,204);
			ps.setInt(4, 1500);
			
			ps.execute();
			
		}finally{
			if(ps!=null){
				ps.close();
			}
			if(con!=null){
				con.close();
			}
			System.out.println("Execution is done");
		}
	}
}
package com.z.jdbc.connection.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcConnUpdate {
	
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
			String insertTableSQL = "update departments set manager_id = ? where department_id = ? ";
			ps = con.prepareStatement(insertTableSQL);
			ps.setInt(1, 204);
			ps.setInt(2, 240);
			
			ps.execute();
			System.out.println("Execution is done");
			
		}finally{
			if(ps!=null){
				ps.close();
			}
			if(con!=null){
				con.close();
			}
		}
	}
}
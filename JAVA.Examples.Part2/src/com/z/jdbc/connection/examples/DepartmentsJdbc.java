package com.z.jdbc.connection.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentsJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List<Departments> dlist= new ArrayList<Departments>();
		Connection con=null;
		PreparedStatement ps=null; 

		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	
			String insertTableSQL = "insert into departments values (?,?,?,?) ";
			
			for (Departments dept : dlist) {
				ps = con.prepareStatement(insertTableSQL);
				ps.setInt(1, dept.getDepid());
				ps.setString(2,dept.getDepname());
				ps.setInt(3,dept.getMgrid());
				ps.setInt(4, dept.getLocid());
				ps.execute();
			}
			System.out.println("Execution done");
			
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

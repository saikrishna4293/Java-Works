package com.Exceptions;

import java.sql.Connection;
import java.sql.SQLDataException;

public class CheckedEx {

	Connection con;
	
	public void method() throws SQLDataException{
		if (con == null){
			System.out.println("hello");
			throw new SQLDataException();
		}
	}
	public static void main(String[] args) {
		CheckedEx ob = new CheckedEx();
		try{
			ob.method();
		}catch(SQLDataException e){
			System.out.println("wrong with the calling");
		}finally{
			System.out.println("program ended man");
		}
	}

}

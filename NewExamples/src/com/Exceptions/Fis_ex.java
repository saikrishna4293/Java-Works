package com.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fis_ex {

	public void read() throws IOException{
		FileInputStream fis = null;
		try{
			fis = new FileInputStream(new File("D:\\greeting.txt"));
			System.out.println("inside block: " +fis);
		}catch (FileNotFoundException e){
			System.out.println("file not found");
		}finally{
			//fis.close();
			System.out.println("program ended");
		}
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
		}
	}
	public static void main(String[] args) throws IOException {
		Fis_ex  ob = new Fis_ex();
		ob.read();		
	}
}

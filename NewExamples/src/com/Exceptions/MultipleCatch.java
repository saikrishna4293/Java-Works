package com.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultipleCatch {

	public void read(){
			try{
				FileInputStream fis = new FileInputStream(new File("D:\\greeting.txt"));
				System.out.println("inside block: " +fis);
				Class.forName("");
			}catch (FileNotFoundException e){
				System.out.println("file not found");
			}catch (ClassNotFoundException e) {
				System.out.println("couldn't find class");
			}catch (Exception d){
				System.out.println("other unknown Exception");
			}
		}
	public static void main(String[] args) {
			MultipleCatch  ob = new MultipleCatch();
			ob.read();		
	}
}
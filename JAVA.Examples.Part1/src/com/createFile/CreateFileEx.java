package com.createFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFileEx {

	public static void main(String[] args) {
		
		try {
			File file = new File("File2.txt");
			if (!file.exists()){
				file.createNewFile();
			}	PrintWriter print = new PrintWriter(file);
				print.println("Hi this is new book by SAIKRISHNA LAKKAVATRI");
				print.println(100);
				print.close();
				System.out.println("Printing done");
		}catch (IOException e) {
			System.out.println("cannot create file");
		}
	}
}

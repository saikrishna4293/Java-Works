package com.Youtube.Examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class V39ReadFileEx {

	public static void main(String[] args) throws IOException {

		BufferedReader br =null;
		//br = new BufferedReader(new FileReader("File1.txt"));
		// or we can give full address of the file where it exists.
		br = new BufferedReader(new FileReader("C:\\Users\\ezio4\\Desktop\\JOB to-do\\JAVA Workspace\\NewExamples"+
																																													"\\File1.txt"));
		String line; 
		while((line= br.readLine()) !=null){
			System.out.println(line);
		}br.close();		
	}

}

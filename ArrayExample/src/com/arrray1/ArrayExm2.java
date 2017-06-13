package com.arrray1;

public class ArrayExm2 {
	
	int[] array2 = {10,20,30,40,50,60,70,80};

	public void method(){
		System.out.println(array2.length);
		System.out.println(array2[2]);
		/*
		for (int i=0;i<array2.length;i++){
			System.out.println("array of  "+i + "  is  " + array2[i]);
		}*/
	}
 	public static void main(String[] args) {
 		ArrayExm2 ob = new ArrayExm2();
 		ob.method(); 	
	}

}

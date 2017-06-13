package com.arrray1;

public class ArrayExm {
	int[] array = new int[4];

	int i=2,j=3,k=4;
	
	public int method1(){
		array[0]=100;
		array[1]=111;
		array[2]=222;
		array[3]=333;
		return 0;
	}
	private void method2(){
		System.out.println(array.length);
		for (int i=0;i<array.length;i++){
			System.out.println("array of  "+i + "  is  " + array[i]);
		}
	}	
	public static void main(String[] args) {
		ArrayExm arr = new ArrayExm();
		arr.method1();
		//System.out.println(arr.array[3]);
		arr.method2();		
	}
}
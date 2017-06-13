package com.Youtube.Examples;

public class V14ForLoop {

	public static void main(String[] args) {
		
		int [] alist = {10,9,8,7,6};
		
		for(int i=0;i<alist.length;i++){
			System.out.println(alist[i]);
		}
		System.out.println("-------------------");
		for(int x : alist){
			System.out.println(x);
		}
	}

}

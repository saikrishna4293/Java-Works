package com.Examples;

public class Test1 {
		int num = 100;
		public void calc(int num) { 
			this.num = num * 10;            
			}     
		public void printNum(){
			System.out.println(num);     
			}     
		public static void main (String [] args) { 
			Test1 obj = new Test1 ();
			obj.calc(2);
			obj.printNum();    
			}
}

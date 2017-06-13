package com.InheritanceEx;

public class InClass1 implements In1 {

		public void clMethod(){
			System.out.println("in class1");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			InClass1 ob = new InClass1();
			ob.method1();
			ob.method2();		
			ob.method3();		
			ob.method4();		
			ob.clMethod();	
			int i = 50;
			int j = 70;
			System.out.println("interface i: "+In1.i);
			System.out.println("class i: "+i);
			System.out.println(j);
			System.out.println(k);
		}
		public void method1() {
			System.out.println("in1 method1");	
		}
		public void method2() {
			System.out.println("in1 method1");			
		}
		public void method3() {
			System.out.println("in1 method1");			
		}
		public void method4() {
			System.out.println("in1 method1");			
		}
		
}

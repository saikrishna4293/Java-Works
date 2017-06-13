package com.base.file;

import com.Inherit2.Interface2;

public class Class_I2_I1 implements Interface2 {

	public static void main(String[] args) {
		Class_I2_I1 obj10 = new Class_I2_I1();
		obj10.method3();
		obj10.method4();

	}

	public void method3() {
		System.out.println("im from i1 base pack");		
	}

	public void method4() {
		System.out.println("im from i1 base pack");
	}

	public void method5() {
		System.out.println("im from i2 inherit pack");
	}

	public void method6() {
		System.out.println("im from i2 inherit pack");
	}

}

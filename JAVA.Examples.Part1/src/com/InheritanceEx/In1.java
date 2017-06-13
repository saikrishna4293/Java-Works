package com.InheritanceEx;

public interface In1 {

	public static int i = 10;
	final int j = 20;
	public static final int k = 30;
 	//private static int m =30; cannot be private only public, static, final is accepted.
	
	public void method1();
	public abstract void method2();
	abstract void method3();
	void method4();
	}

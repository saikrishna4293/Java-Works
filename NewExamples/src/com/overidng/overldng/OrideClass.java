package com.overidng.overldng;

import java.io.IOException;

public class OrideClass extends OrideBase {

	//@Override
	public int OrideBase() throws  IOException{
		System.out.println("im in Child");
		return 0;
	}
	public static void main(String[] args) throws Exception {
		OrideClass obj = new OrideClass();
		obj.OrideBase();
		OrideBase obje = new OrideBase();
		obje.OrideBase();
	}
}

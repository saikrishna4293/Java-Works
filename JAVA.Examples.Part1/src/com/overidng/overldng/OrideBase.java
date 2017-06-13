package com.overidng.overldng;

public class OrideBase {

	protected int OrideBase() throws Exception{
		System.out.println("im in Base");
		return 0;
	}
	public static void main(String[] args) throws Exception {
		OrideBase ob = new OrideBase();
		ob.OrideBase();
		OrideClass obj = new OrideClass();
		obj.OrideBase();
	}

}

package com.Pub.Priv.Pro.Def;

public class FinalClas {

	int i;
	static int j;
	final int k=20;
	
	
	public static void main(String[] args) {
		final	 FinalClas ob =new FinalClas();
		FinalClas ob1 = new FinalClas();
		
		//ob.k =30;
		System.out.println(ob.k);
		System.out.println("----------------------------------");
	
		ob.j =20;
		System.out.println(ob.j);
		
		ob1.j =30;
		System.out.println(ob1.j);
		System.out.println(ob.j);
		System.out.println("----------------------------------");
		ob.i =20;
		System.out.println(ob.i);
		ob1.i = 30;
		System.out.println(ob1.i);
		System.out.println(ob.i);
	}
}

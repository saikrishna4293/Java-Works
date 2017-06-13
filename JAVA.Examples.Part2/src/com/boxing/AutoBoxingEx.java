package com.boxing;

public class AutoBoxingEx {

	public static void main(String[] args) {
		/*Integer ob = new Integer(9);
		int i = ob.intValue(); 		//UNBOXING -- conversion of wrapper to primitive data type
		i = i++;
		System.out.println("before adding: "+ob);
		ob = new Integer(i);
		System.out.println("after adding:  "+ob);*/
		
		//AUTOBOXING -- conversion of primitive data type into its equivalent wrapper type
		Integer ob = 9;
		System.out.println("before increment: "+ob);
		ob++;
		System.out.println("after increment:  "+ob);
		
		
	}

}

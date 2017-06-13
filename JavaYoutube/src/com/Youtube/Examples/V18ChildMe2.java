package com.Youtube.Examples;

public class V18ChildMe2 {

	public static void main(String[] args) {

		
		
		V18BaseMe2 ob1 = new V18BaseMe2(12, "hello");
	 	V18BaseMe2 ob2 = new V18BaseMe2(13, "fedfdsfsd");
	 /* V18BaseMe2 ob3 = new V18BaseMe2(14, "hello");
	 * V18BaseMe2 ob4 = new V18BaseMe2(15, "hello");
	 */
		System.out.println("eid: "+ob1.getEid()+",  ename: "+ob1.getEname());
		System.out.println("eid: "+ob2.getEid()+",  ename: "+ob2.getEname());
	}
}

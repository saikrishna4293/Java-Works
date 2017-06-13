package com.Youtube.Examples;

public class V18ChildMe {

	public static void main(String[] args) {

		V18BaseMe e1 = new V18BaseMe();
		e1.setEid(10);
		e1.setEname("Virat");
		System.out.println("eid: "+ e1.getEid()+ ",  ename: "+e1.getEname());
		
		V18BaseMe e2 = new V18BaseMe();
		e2.setEid(20);
		e2.setEname("Sachin");
		System.out.println("eid: "+ e2.getEid()+ ",  ename: "+e2.getEname());
	}

}

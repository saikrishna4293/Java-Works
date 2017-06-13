package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrListSort {

	List<String> alist = new ArrayList<String>();
		
		public void assign(){
			alist.add("Virat");//0
			alist.add("Dhoni");//1
			alist.add("Sachin");//2
			alist.add("Yuvraj");//3->4
			alist.add("Rahul");//4->out
			alist.remove(4);
			alist.add(3,"Ashwin");//3
		}
		public void display(){
			Collections.sort(alist);
			//for (Object obj : alist) {
			//	System.out.println(obj.toString());	
			//}
			for (String str : alist){
				System.out.println(str);
			}
		}
		public static void main(String[] args) {
			ArrListSort ob = new ArrListSort();
			ob.assign();
			ob.display();
			System.out.println("Program executed successfully");
			//System.out.println(alist.get(2));

		}

}

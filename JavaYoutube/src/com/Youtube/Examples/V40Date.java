package com.Youtube.Examples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class V40Date {

	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println(dt.toString()); //gives date time
		System.out.println(dt.getDate()); //just date 23
		System.out.println(1900+dt.getYear()); //add 1900
 		System.out.println(dt.getDay());	//tue =2, wed =3
		System.out.println(dt.getHours()); //24 hour format just hour
		System.out.println(dt.getMinutes()); //just minutes
		System.out.println(dt.getMonth()); //just
		
		SimpleDateFormat ob = new SimpleDateFormat("E yyyy / MM / dd  HH-mm-ss"); // we can google simpledateformat letters to use
		System.out.println(ob.format(dt));
	}
}

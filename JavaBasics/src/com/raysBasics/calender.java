package com.raysBasics;

import java.util.Calendar;

public class calender {


	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //create object by presenent date and time
		for (int i = 0; i <= 12; i++) {
			cal.add(Calendar.DATE, 30); // present date me 30 days add krta he
			System.out.println(cal.getTime()); // print a new date

		}
		
		System.out.print("   ");
	}
}


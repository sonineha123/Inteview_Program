package com.raysBasics;

public class Factotial {

	public static void main(String[] args) {

		int fact = 1; //no store krta he
		int num = 7;

		for (int i = num; i > 0; i--) {

			fact = fact * i;

		}
		
		System.out.println(fact);

	}


}


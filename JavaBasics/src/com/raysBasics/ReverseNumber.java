package com.raysBasics;

public class ReverseNumber {

	
	public static void main(String[] args) {

		int num = 584;
		int num2 = num;
		int temp = 0;
		int r ;

		while (num2 != 0) {

			r = num2 % 10;
			temp = temp * 10 + r;
			num2 = num2 / 10;

		}

		System.out.println(temp);

	}


}


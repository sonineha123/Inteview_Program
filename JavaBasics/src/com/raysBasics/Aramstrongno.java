
package com.raysBasics;

public class Aramstrongno {
	
	public static void main(String[] args) {

		int num = 153;
		int temp = 0;
		int num2 = num;
		int r = 0;

		while (num2 != 0) {

			r = num2 % 10;
			temp = temp + r * r * r;
			num2 = num2 / 10;
		}

		if (temp == num) {

			System.out.println("ArmStrongNo");

		} else {
			System.out.println("Not ArmStrongNo");
		}

	}

}


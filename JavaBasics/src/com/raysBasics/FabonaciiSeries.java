package com.raysBasics;

public class FabonaciiSeries {
	public static void main(String[] args) {
		int a = 0; //first digit
		int b = 1; //second digit
		int c;  //3rd digit
		for (int i = 1; i <= 10; i++) {  //10 time loop
			c = a + b; //
			System.out.print(a + " ");
			a = b;
			b = c;

		}
	}

}


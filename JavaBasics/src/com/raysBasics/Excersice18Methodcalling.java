
package com.raysBasics;

public class Excersice18Methodcalling {

	public static void main(String[] args) {

		int[] arr = { 18, 17, 16, 14, 5, 6, 7, 8 };
		int num = 15;

		int temp = findIndex(arr, num); 
		

		System.out.println(temp);
	}

	public static int findIndex(int[] arr, int num) {  // arr num as a input liya he
		int temp = -1;

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
	//			temp = arr[i];
				temp = i ;				// break;
			}
		}

		return temp;
	}

	
}

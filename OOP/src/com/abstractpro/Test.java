package com.abstractpro;

public class Test {
	
	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.area();
		r.sum();

		Shape s = new Rectangle(); // This line assigns the new Rectangle instance
		// to the reference variable s, which is of type Shape.

		s.area(); // call parant ki hogi lekin chlegi child ki
		s.sum();

		 Shape.sum();

	}

	

}
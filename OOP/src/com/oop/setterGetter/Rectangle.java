package com.oop.setterGetter;

public class Rectangle extends Shape {

	public int l;
	public int w;

	public Rectangle() {
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	@Override
	public double area() {
		double d = l * w;
		System.out.println(d);
		return d;
	}

}

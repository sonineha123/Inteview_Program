package com.abstractpro;

public class AbstractExTest extends AbstractEx{
	
	@Override
	
	public int sum(int a, int b ) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
	  AbstractExTest a = new AbstractExTest();
		               int b= a.sum(2 , 20);
		               System.out.println(" value = "+b);
		
	}
	}



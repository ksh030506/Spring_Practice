package com.javalec.ex;

public class Calculator {
	
	public void addition(int f, int s) {
		System.out.println("addition()");
		int result = f + s;
		System.out.println(f + " + " + s + " = " + result);
	}
	
	public void subtration(int f, int s) {
		System.out.println("subtration()");
		int result = f - s;
		System.out.println(f + " - " + s + " = " + result);
	}
	
	public void multiplication(int f, int s) {
		System.out.println("multiplication()");
		int result = f * s;
		System.out.println(f + " * " + s + " = " + result);
	}
	
	public void division(int f, int s) {
		System.out.println("division()");
		int result = f / s;
		System.out.println(f + " / " + s + " = " + result);
	}

}
package com.dataProviderPkg;

public class CalImp implements Calculator {

	public int sum(int a, int b) {
		return (a + b);
	}

	public int min(int a, int b) {
		return (a - b);
	}

	public int div(int a, int b) {
		return (a / b);
	}

	public int mul(int a, int b) {
		return (a * b);
	}

	public void display() {
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
	}

}

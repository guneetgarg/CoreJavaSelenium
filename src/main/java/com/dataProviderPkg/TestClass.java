package com.dataProviderPkg;

import org.openqa.selenium.Alert;

public class TestClass {

	public static void main(String[] args) {
		Calculator cal = new CalImp();
		System.out.println(cal.sum(11, 2));

		System.out.println("main");
	}
}

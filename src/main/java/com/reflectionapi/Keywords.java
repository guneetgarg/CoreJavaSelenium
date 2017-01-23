package com.reflectionapi;

import org.openqa.selenium.WebDriver;

public class Keywords {
	public WebDriver driver;

	public void openBrowser(String object, String data) {
		System.out.println("open browser method invoked");
	}

	public String captureScreenshot(String filename, String keyword_execution_result) {
		System.out.println("sreen");
		return "returning String from captureScreenshot method :: :)";
	}

	public void ASSERALL() {
		System.out.println("assert all method invoked");
	}

}

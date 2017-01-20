package com.reflectionapi;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class Keywords {
	public static SoftAssert s_assert = new SoftAssert();
	public WebDriver driver;

	public void openBrowser(String object, String data) {
		System.out.println("Drivers path");
		String path = "";

	}

	public void verifyTitle(String object, String data) {
	}

	public void exist(String object, String data) {
	}

	public void isErrPresent(String object, String data) {
	}

	public void click(String object, String data) {
	}

	public void executeWithJavaScript(String object, String data) {
	}

	public void synchronize(String object, String data) {
	}

	public void waitForElementVisibility(String object, String data) {
		System.out.println("here");
	}

	public void closeBrowser(String object, String data) {

	}

	public void pause(String object, String data) throws NumberFormatException, InterruptedException {
	}

	public void Ribonverification(String object, String data) {

	}

	public void offeringCount(String object, String data) {
	}

	public void waitText(String object, String data) {
		try {
			Thread.sleep(3000);
		} catch (Exception ex) {
		}
	}

	public void captureScreenshot(String filename, String keyword_execution_result) {
		System.out.println("sreen");
	}

	public void ASSERALL() {
		s_assert.assertAll();
	}

}

package com.xmlgen;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Demo2 {
	static WebDriver driver;

	public static void main(String[] args) {
		Alert alert = driver.switchTo().alert();
	}
}
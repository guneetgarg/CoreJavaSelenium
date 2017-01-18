package com.locatorType;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SvgXpath {
	WebDriver driver;
	String path = "file:///C:/Users/ggarg1/git/CoreJavaSelenium/src/main/java/com/locatorType/SvgDemo.html";

	@Test
	private void dmo() {
		System.setProperty("webdriver.chrome.driver", "Drivers_executable/chromedriver.exe");
		driver = browserStart();
		System.out.println(driver.findElement(By.xpath("//*[name()='svg']/*[name()='rect']")).getAttribute("x"));
		driver.close();
	}

	public WebDriver browserStart() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(path);
		return driver;
	}
}
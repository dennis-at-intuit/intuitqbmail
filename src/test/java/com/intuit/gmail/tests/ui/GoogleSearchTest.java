package com.intuit.gmail.tests.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.mac");
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
	}
}
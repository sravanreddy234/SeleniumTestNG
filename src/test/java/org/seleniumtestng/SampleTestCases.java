package org.seleniumtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestCases {
	
	public WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void loginMethod() {
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.findElement(By.name("userName")).sendKeys("reddy234");
		driver.findElement(By.name("password")).sendKeys("Reddy234$");
		driver.findElement(By.name("login")).click();
	}
	@AfterTest
	public void wrapUp() {
		driver.close();
	}
}

package org.seleniumtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
	@Test(priority=0)
	public void loginMethod() {
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.findElement(By.name("userName")).sendKeys("reddy234");
		driver.findElement(By.name("password")).sendKeys("Reddy234$");
		driver.findElement(By.name("login")).click();
	}
	@Test(priority=2)
	public void noOfPass() {
		Select noOfPass = new Select(driver.findElement(By.name("passCount")));
		noOfPass.selectByVisibleText("2");
	}
	
	@Test(priority=1)
	public void fromCity() {
		Select fromCity = new Select(driver.findElement(By.name("fromPort")));
		fromCity.selectByValue("Sydney");
	}
	
	@Test(priority=3)
	public void fromDayMonth() {
		Select fromMonth = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		fromMonth.selectByValue("6");
		Select fromDay = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		fromDay.selectByValue("18");
		
	}
	
	@AfterTest
	public void wrapUp() {
		driver.close();
	}
}

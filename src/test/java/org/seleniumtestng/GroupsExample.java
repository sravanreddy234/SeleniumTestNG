package org.seleniumtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsExample {
	
	public WebDriver driver;
	@Test(groups= {"one","two"})
	public void tc01LaunchURL() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V1/index.php");
	}
	@Test(groups= {"one"})
	public void tc02VerifyLaunchPage() {
		String expectedTitle = " GTPL Bank Home Page ";
		String pageTitle = driver.getTitle();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text() = 'Gtpl Bank']")).isDisplayed(), "Launch page displayed");
		System.out.println("Launch page not displayed");
	}
	@Test(groups= {"one","two"})
	public void tc03EnterCredentials() {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr251028");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mErAbUz");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}
	@Test(groups= {"one","two"})
	public void tc04VerifyHyperlinks() {
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed(),"Logout is available");
		System.out.println("Logout is not available");
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
	}
	@Test(groups= {"two"})
	public void tc05AcceptPopup() {
		String popUpText = driver.switchTo().alert().getText();
		System.out.println(popUpText);
		driver.switchTo().alert().accept();
		System.out.println("popup accepted");
	}
	@Test(groups= {"one","two"})
	 public void tc06closeExecution() {
		System.out.println("in closeExecution method");
		 driver.quit();
		 System.out.println("Execution stopped");
	 }
	
}

package org.firstsuite;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlipkartClass {
  
	public WebDriver driver;
	
		@BeforeClass
		public void init() {
			System.setProperty("webdriver.chrome.driver","D:\\Selenium Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("in Flipkart method");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		}

		// To log in flipkart
		@Test
		public void login() {
			driver.navigate().to("https://www.flipkart.com");
			driver.close();
		}
	}

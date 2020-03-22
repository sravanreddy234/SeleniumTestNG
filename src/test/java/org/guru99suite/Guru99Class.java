package org.guru99suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Guru99Class {
	public static WebDriver driver;
  
	@Test    
    public void a_executSessionOne(){
            //First session of WebDriver
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //Goto guru99 site
            System.out.println("in first Session");
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            driver.findElement(By.name("uid")).sendKeys("Driver 1");
            driver.close();
        }
        
    /*@Test    
        public void b_executeSessionTwo(){
            //Second session of WebDriver
    	System.setProperty("webdriver.chrome.driver","D:\\Selenium Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
            //Goto guru99 site
        System.out.println("in second Session");
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        driver.close();
        }
        
    @Test    
        public void c_executSessionThree(){
            //Third session of WebDriver
    	System.setProperty("webdriver.chrome.driver","D:\\Selenium Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
            //Goto guru99 site
        System.out.println("in third Session");
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
        driver.close();
        }  */      
    	
}

package com.automation.travel.flight1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logintest {
	WebDriver driver;

	@BeforeTest
	void setup()
	{
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Tuntun/Downloads/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");

	}
	
	@Test
	void test1()
	{
		System.out.println("login sucessful");
	}
	
	@Test
	void test2()
	{
		System.out.println("This is home page");
	}
	
	@AfterTest
	void test3()
	{
		
		
		
		driver.close();
		
	}
	

}

package com.march28th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Programs_basic {
	WebDriver driver=null;
	
	@Test(priority = 0)
	public void Browser_launch() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test(priority = 1)
	public void navigate() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	    driver.close();
	}
	@Test(priority = 2)
	public void currenturl() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	
	}

}

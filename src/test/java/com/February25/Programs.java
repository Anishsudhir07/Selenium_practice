package com.February25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Programs {
	WebDriver driver=null;
	
    
	@Test(priority = 0)
	public void Launch() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		System.out.println("current thread=" +Thread.currentThread().getId());
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(priority = 1)
	public void Navigate()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().back();
		driver.close();
	}
	
	@Test(priority=2)
	public void Getcurrenturl() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();
	}
	
	
	
	
}

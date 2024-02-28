package com.march28th;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	
	WebDriver driver=null;
	
	@Test(priority = 0)
	public void selectby_index() throws Throwable
	{
	
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement web=driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')]"));
		
		Select s=new Select(web);
		s.selectByIndex(3);
		Thread.sleep(3000);
		driver.close();
		
	}
    
	@Test(priority = 1)
	public void selectby_value() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement web=driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')]"));
		
		Select s=new Select(web);
		s.selectByValue("search-alias=appliances");
		Thread.sleep(3000);
		driver.close();
		
	}
	
	@Test(priority = 2)
	public void selectby_visibletext() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement web=driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')]"));
		
		Select s=new Select(web);
		s.selectByVisibleText("Baby");
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(priority=3)
	public void getall_options() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement web=driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')]"));
		
		Select s=new Select(web);
		List<WebElement> li=s.getOptions();
		for(WebElement b: li)
		{
			System.out.println(b);
	}
		Thread.sleep(3000);
	    driver.close();
//	public void Selectall_deselectall()
//	{
//		
//	}
	
}
}

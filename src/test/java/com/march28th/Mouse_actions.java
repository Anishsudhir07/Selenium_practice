package com.march28th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_actions {
	
	WebDriver driver=null;
	
	@Test(priority = 0)
	public void rightclick() throws Throwable
	{
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement web=driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]"));
	Actions a=new Actions(driver);
	a.contextClick(web).perform();
	
	Thread.sleep(2000);
	driver.close();
	
	
	}
	@Test(priority = 1)
	public void leftclick() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("Iphone");
		
		WebElement web =driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]"));
		Actions a2=new Actions(driver);
		a2.moveToElement(web).perform();
		Thread.sleep(3000);
		driver.close();
		
	}
	@Test(priority = 2)
	public void doubleclick() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("Iphone");
		
		WebElement web =driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]"));
		Actions a=new Actions(driver);
		a.doubleClick(web).perform();
		Thread.sleep(3000);
		driver.close();
	}
//	@Test
//	public void drag_drop()
//	{
//		WebDriverManager.edgedriver().setup();
//		driver=new EdgeDriver();
//	}

}

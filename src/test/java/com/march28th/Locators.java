package com.march28th;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	WebDriver driver=null;
	
	@Test(priority = 0)
	public void classname_locator() throws Throwable
	{
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElement(By.className("vsar-lens-icon")).click();
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(priority = 1)
	public void tagename_locator()
	{
		WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  List<WebElement> web=driver.findElements(By.tagName("a"));
		  for(WebElement b: web)
		  {
			  System.out.println(b);
		  }
		  driver.close();
	}
	
	@Test(priority = 2)
	public void id_locator() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.id("glow-ingress-line2")).click();

		  Thread.sleep(3000);
		  driver.close();		  
	}

	@Test(priority = 3)
    public void linktext_locator() throws Throwable
    {
    	WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.linkText("Forgotten password?")).click();
		  Thread.sleep(2000);
	
		  Thread.sleep(3000);
		  driver.close();
		  
    }
	
	@Test(priority = 4)
	public void css_locator() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Iphone");
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1600)");
			
			Thread.sleep(3000);
			
			driver.close();
	}
	
	@Test(priority = 5)
	public void xpath_locators() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//button[contains(@data-testid,'royal_login_button')]")).click();
		  Thread.sleep(3000);
		  driver.close();
	}

}

package com.march28th;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test(priority = 0)
public class Windowhandles {
	WebDriver driver=null;
	
	public void single_window() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parent=driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> children_Parent=driver.getWindowHandles();
		for(String child:children_Parent)
		{
			System.out.println("tabs list are " + child);
			if(!child.equals(parent))
			{
				driver.switchTo().window(child);
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
	    System.out.println(driver.getCurrentUrl());
	    driver.close();	
		
	}
	
	@Test(priority = 1)
	public void single_tab() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String Parent=driver.getWindowHandle();
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> child_parent=driver.getWindowHandles();
		
		for(String child: child_parent)
		{
			System.out.println(child);
			if(!child.equals(Parent))
			{
				driver.switchTo().window(child);
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		driver.switchTo().window(Parent);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		driver.close();
	}

}

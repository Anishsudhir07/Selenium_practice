package com.february22nd;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles_tabs {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String Parent=driver.getWindowHandle();
		System.out.println("Parent window" + Parent);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@id,'newTabBtn')]")).click();
		Set<String> handles=driver.getWindowHandles();
		for(String child: handles)
		{
			System.out.println("Child window" + child);
			if(!child.equals(Parent))
			{
				driver.switchTo().window(child);
				JavascriptExecutor jse2=(JavascriptExecutor) driver;
				jse2.executeScript("window.scrollBy(0,600)");
				
				//driver.findElement(By.xpath("//button[contains(@id,'promptBox')]")).click();
				
				Thread.sleep(4000);
				driver.close();
			}
		}
		
		driver.switchTo().window(Parent);
		Thread.sleep(5000);
		String finalwindow=driver.getWindowHandle();
		System.out.println("You are now in " + finalwindow);
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}

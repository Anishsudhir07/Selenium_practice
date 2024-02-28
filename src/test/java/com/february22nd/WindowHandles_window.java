package com.february22nd;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles_window {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Parent=driver.getWindowHandle();
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,600)");
		
		driver.findElement(By.xpath("//button[contains(@id,'newWindowBtn')]")).click();
		Thread.sleep(2000);
		Set<String> childs=driver.getWindowHandles();
		for(String child:childs)
		{
			System.out.println(child);
			if(!child.equals(Parent))
			{
				driver.switchTo().window(child);
				//driver.manage().window().maximize();
				JavascriptExecutor jse2=(JavascriptExecutor) driver;
				jse2.executeScript("window.scrollBy(0,600)");
				driver.findElement(By.id("firstName")).sendKeys("Anish");
				driver.findElement(By.id("lastName")).sendKeys("Das");
				driver.findElement(By.id("clearbtn")).click();
				
				Thread.sleep(3000);
				driver.close();
			
			}
		}
		
		driver.switchTo().window(Parent);
		String fi=driver.getWindowHandle();
		System.out.println("You are finally in " + fi);
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		

	}

}

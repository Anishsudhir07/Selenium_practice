package com.february22nd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_contains {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("Iphone");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(2000);
		driver.close();
		

	}

}

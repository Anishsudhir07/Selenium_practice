package com.february22nd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linktext {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement web=driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')]"));
		Thread.sleep(1000);
		Select s=new Select(web);
		s.selectByValue("search-alias=alexa-skills");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
				JavascriptExecutor jse=(JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,1600)");
				Thread.sleep(3000);
				
				driver.close();

	}

}

package com.march28th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup {
	
	WebDriver driver=null;
	
	@Test(priority = 0)
	public void alert_popup() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1200)");
		driver.findElement(By.id("alert1")).click();
		Alert art=driver.switchTo().alert();
		art.accept();
		
		Thread.sleep(3000);
		driver.close();
		
	}
	
	@Test(priority = 1)
	public void Authentication_popup() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		driver.close();
		
	}
	
	@Test(priority = 2)
	public void Fileupload() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.remove.bg/upload");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//String projectpath=System.getProperty("user.dir");
		driver.findElement(By.xpath("//button[contains(@class,'!border !border-transparent rounded-full font-bold transition ease-in-out text-center font-body no-underline hover:no-underline inline-flex items-center justify-center text-2xl px-8 py-2.5 text-white !bg-primary hover:!bg-primary-hover active:!bg-primary-hover active:scale-[0.98] focus:outline-none focus-visible:outline-none focus:ring-none focus-visible:ring focus-visible:ring-offset-2 focus-visible:ring-primary-hover')]")).sendKeys("C:\\Users\\anish\\OneDrive\\Desktop\\screenshot\\amazon.JPG");;
         Thread.sleep(3000);
	}
	
//	public void FileDownload()
//	{
//		
//	}
	

}

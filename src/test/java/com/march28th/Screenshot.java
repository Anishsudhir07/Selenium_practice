package com.march28th;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	WebDriver driver=null;
	
	@Test(priority = 0)
	public void screenshot() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(screenshot,new File("C:\\\\Users\\\\anish\\\\OneDrive\\\\Desktop\\\\screenshot\\\\amazon2.jpg"));
		Thread.sleep(3000);
		driver.close();
		
	}

}

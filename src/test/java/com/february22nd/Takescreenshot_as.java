package com.february22nd;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takescreenshot_as {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshot, new File("C:\\Users\\anish\\OneDrive\\Desktop\\screenshot\\amazon.jpg"));
		Thread.sleep(3000);
		driver.close();

	}

}

package com.february22nd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_page {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.close();
		

	}

}

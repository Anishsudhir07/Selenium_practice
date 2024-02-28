package com.february22nd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_launching {

	@Test(invocationCount = 3)
	public void launch() throws InterruptedException {
	     WebDriverManager.edgedriver().setup();
	     WebDriver driver=new EdgeDriver();
	     
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.in");
	     Thread.sleep(3000);
	     driver.close();

	}

}

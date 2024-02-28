package com.february22nd;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_select {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement web=driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')]"));
         
		Select s=new Select(web);
		List<WebElement> list=s.getOptions();
		
		Thread.sleep(3000);
		for(WebElement show:list)
		{
			System.out.println(show);
		}
		
		driver.close();
		
	}

}

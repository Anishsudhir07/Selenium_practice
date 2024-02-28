package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Priority_testng {
	WebDriver driver=null;
	
	@Test 
	public void test1() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.close();
	}
    
}

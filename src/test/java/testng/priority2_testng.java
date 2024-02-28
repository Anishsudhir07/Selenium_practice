package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class priority2_testng {
	WebDriver driver=null;
	
	@Test 
	public void test1() throws Throwable
	{
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(4000);
	driver.close();
	}
    
}

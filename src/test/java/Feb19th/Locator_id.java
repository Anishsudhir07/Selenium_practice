package Feb19th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_id {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nokia");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();	
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0,1400)");
		
		String str=driver.getCurrentUrl();
		System.out.println(str);
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		

	}

}

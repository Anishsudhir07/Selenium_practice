package Feb19th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_actions {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement web=driver.findElement(By.xpath("//a[contains(@data-csa-c-content-id,'nav_cs_electronics')] "));
		
		Actions a=new Actions(driver);
		
	a.moveToElement(web).perform();
	
	Thread.sleep(4000);
	driver.close();
		

	}

}

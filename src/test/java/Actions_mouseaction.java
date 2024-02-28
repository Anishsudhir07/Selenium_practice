import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_mouseaction {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		WebElement ele =driver.findElement(By.xpath("//a[contains(@data-csa-c-content-id,'nav_cs_electronics')] "));
		Actions a=new Actions(driver);
		
		a.moveToElement(ele).perform();
		//a.contextClick(ele).perform();
		//a.doubleClick(ele).perform();
		//a.dragAndDrop(ele, ele).perform();
		Thread.sleep(4000);
		
		driver.close();
		

	}

}

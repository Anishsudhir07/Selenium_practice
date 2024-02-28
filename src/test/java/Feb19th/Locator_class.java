package Feb19th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_class {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys("Iphone");
		
		//Thread.sleep(2000);
		
		driver.findElement(By.className("icp-nav-link-inner")).click();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gettermethods {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		WebElement ele=driver.findElement(By.name("email"));
		
		Point loc=ele.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		
		Dimension size=ele.getSize();
		
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
driver.close();
	}

}

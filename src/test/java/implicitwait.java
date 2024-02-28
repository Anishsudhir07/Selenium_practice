import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitwait {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		for(WebElement b:link)
		{
			System.out.println(b.getText());
		}
		
		driver.close();
	}

}

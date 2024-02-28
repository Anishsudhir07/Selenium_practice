import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isselected {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@type,'radio')]")).click();
		
//		if(web.isSelected())
//		{
//			
//			System.out.println("female selected");
//		}
//		
//		else
//		{
//			System.out.println("male selecetd");
//		}
	}

}

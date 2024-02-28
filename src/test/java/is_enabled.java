import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class is_enabled {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https:/www.facebook.com");
	WebElement web=driver.findElement(By.name("login"));
	if(web.isEnabled())
	{
		System.out.println("pass");
		web.click();
	}
	
	else
	{
		System.out.println("fail");
	}

	}

}

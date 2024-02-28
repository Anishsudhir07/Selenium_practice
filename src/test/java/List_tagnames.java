import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List_tagnames {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
	List<WebElement> links	=driver.findElements(By.tagName("a"));
	
	for(WebElement b: links)
	{
		System.out.println(b.getText());
	}
	
	Thread.sleep(4000);

	driver.close();
	}

}

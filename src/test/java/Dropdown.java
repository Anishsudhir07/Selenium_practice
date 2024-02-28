import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		
		WebElement ele  =driver.findElement(By.id("searchDropdownBox"));
		
		Select s=new Select(ele);
		//s.selectByIndex(7);
		//s.selectByVisibleText("Amazon Pharmacy");
		//s.selectByValue("search-alias=alexa-skills");
		
		List<WebElement> erle=s.getOptions();
		
		System.out.println(erle.size());
		
		for(WebElement b: erle)
		{
			System.out.println(b.getText());
		}
		
		Thread.sleep(3000);

	}

}

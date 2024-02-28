package Feb19th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_selectbyvalue {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement web=driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')]"));
		
		Select s=new Select(web);
		s.selectByValue("search-alias=alexa-skills");
		Thread.sleep(3000);
		driver.close();
		

	}

}

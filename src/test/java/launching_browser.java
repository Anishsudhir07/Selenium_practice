import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launching_browser {

	public static void main(String[] args) throws Throwable {
	
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("https://www.google.com");
		
		Thread.sleep(4000);
		driver.close();

	}

}

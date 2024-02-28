import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class data_properties {

	public static void main(String[] args) throws Throwable {
		
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Data.properties");
		
		Properties prob=new Properties();
		prob.load(fis);
		
		String url=prob.getProperty("url");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		Thread.sleep(6000);
		
		driver.close();
		
		

	}

}

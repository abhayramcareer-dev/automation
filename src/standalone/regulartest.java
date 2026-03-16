package standalone;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobj.pageobject;

public class regulartest {
	
	 WebDriver driver;
	
	public static void main(String Args[]) {
	    WebDriver driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    pageobject pj= new pageobject(driver);
		pj.credentials("standard_user","secret_sauce");
		
		

	}
	
	

}

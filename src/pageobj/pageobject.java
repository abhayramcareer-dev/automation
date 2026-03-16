package pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import standalone.basetest;

public class pageobject  extends basetest {
	WebDriver driver;
	
	public pageobject(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements( driver,this);
		
		
	}
	
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id="login-button")
	WebElement log;
	
	
	public void credentials(String name,String password) {
		username.sendKeys(name);
		pass.sendKeys(password);
		log.click();
		
		
	}

}

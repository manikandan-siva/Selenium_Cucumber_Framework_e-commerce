package pageObjects;

import org.openqa.selenium.By; //to store locators in variables
import org.openqa.selenium.WebDriver; // selenium webdriver interface
import org.openqa.selenium.WebElement; //to return webelement

//encapsulated privately locators

public class UserHomePage {
	
	//constructor to read test driver to page driver
	
	WebDriver pageDriver;

	public UserHomePage(WebDriver testDriver) {
		this.pageDriver = testDriver;
	}
	
	//locators
	private By userTitle = By.className("account");
	private By personalLink = By.partialLinkText("personal");
	
	//methods to operate webelements
	public WebElement getUserTitle()
	{
		return pageDriver.findElement(userTitle);
	}
	
	//directly clicking it for now
	public void clickPersonalLink()
	{
		pageDriver.findElement(personalLink).click();
	}		
	
	

}

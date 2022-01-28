package pageObjects;

import org.openqa.selenium.By; //to store locators in a variable
import org.openqa.selenium.WebDriver; // selenium webdriver interface

//import com.rediff.pageObjects.CreateAccountPage;

//encapsulated by declaring locators as private
//so only this class can access it and none can change it dynamically 

public class SiteHomePage {
	
	
	WebDriver pageDriver;
	
	//constructor to assign the driver from test case file to page object file
	public SiteHomePage(WebDriver testDriver)
	{
		this.pageDriver=testDriver;
	}


	//locator
	private By signInButton = By.partialLinkText("Sign");
	
	// Webelement operations
	//if we click on signin, it will take always to create account page, so we directly create object for it, thus optimizing the code
	public  CreateAccountPage signIn()
	{
		pageDriver.findElement(signInButton).click();
		CreateAccountPage acc = new CreateAccountPage(pageDriver);
		return acc;
	}
}

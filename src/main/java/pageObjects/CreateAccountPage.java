package pageObjects;

import org.openqa.selenium.By; //store locators in variables
import org.openqa.selenium.WebDriver; //selenium webdriver interface
import org.openqa.selenium.WebElement; //to return webelements

//encapsulating locators by making it private thus restricting it access only to this class

public class CreateAccountPage {
	
	WebDriver pageDriver;
	
	public CreateAccountPage(WebDriver testDriver) {
		// TODO Auto-generated constructor stub
		this.pageDriver = testDriver;
	}


	//locators
	private By email = By.id("email_create");
	private By registerButton = By.id("SubmitCreate");
	
	//Webelements
	public WebElement putEmail()
	{
		return pageDriver.findElement(email);
	}
	
	//if we click on submit, it will take always to personal info page, so we directly create object for it, thus optimizing the code
	public PersonalInfoPage register()
	{
		pageDriver.findElement(registerButton).click();
		PersonalInfoPage usrDtls = new PersonalInfoPage(pageDriver);
		return usrDtls;
	}
	
	
}

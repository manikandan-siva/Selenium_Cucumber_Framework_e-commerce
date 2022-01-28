package pageObjects;

import org.openqa.selenium.By; //to store locators in variables
import org.openqa.selenium.WebDriver; //selenium webdriver interface
import org.openqa.selenium.WebElement; //to return webelement

//encapsulated locators as private to restrict its access 

public class PersonalInfoPage {
	
	//Constructor to assign test driver to page driver
	WebDriver pageDriver;

	public PersonalInfoPage(WebDriver testDriver) {
		// TODO Auto-generated constructor stub
		this.pageDriver = testDriver;
	}

	//locators
	private By titleMr = By.id("id_gender1");
	private By titleMrs = By.id("id_gender2");
	private By fName = By.id("customer_firstname");
	private By lName = By.id("customer_lastname"); 
	private By pwd = By.id("passwd");
	private By Addrs = By.id("address1");
	private By city = By.cssSelector("[name='city']");
	private By state = By.id("id_state");
	private By post = By.id("postcode");
	private By other = By.id("other");
	private By mobile = By.id("phone_mobile");
	private By submit = By.id("submitAccount");
	
	//methods to operate webelements
	public WebElement selectMr() 
	{
		return pageDriver.findElement(titleMr);
	}
	
	public WebElement selectMrs() 
	{
		return pageDriver.findElement(titleMrs);
	}
	
	public WebElement putFirstName() 
	{
		return pageDriver.findElement(fName);
	}
		
	public WebElement putLastName() 
	{
		return pageDriver.findElement(lName);
	}
	
	
	public WebElement putPwd() 
	{
		return pageDriver.findElement(pwd);
	}
	
	public WebElement putAddrs() 
	{
		return pageDriver.findElement(Addrs);
	}

	
	public WebElement putCity() 
	{
		return pageDriver.findElement(city);
	}
	
	
	public WebElement putState() 
	{
		return pageDriver.findElement(state);
	}
	
	
	public WebElement putPost() 
	{
		return pageDriver.findElement(post);
	}
	
	
	public WebElement putOther() 
	{
		return pageDriver.findElement(other);
	}
	
	
	public WebElement putMobile() 
	{
		return pageDriver.findElement(mobile);
	}
	
	
	public UserHomePage submit() 
	{
		 pageDriver.findElement(submit).click();
		 UserHomePage usrHome = new UserHomePage(pageDriver);
		 return usrHome;
		
	}
	

}

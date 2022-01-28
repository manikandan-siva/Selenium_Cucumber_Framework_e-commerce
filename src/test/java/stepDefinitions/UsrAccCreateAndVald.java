package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select; //for drop down operations

//import com.rediff.pageObjects.CreateAccountPage;

import io.cucumber.java.en.*; //to access all cucumber keywords meanings like given, then , and
import pageObjects.*; //accessing page object factory
import resources.*; //accessing base cls for driver details

public class UsrAccCreateAndVald extends Base {
    
	UserHomePage usrHome; //declaring it as class variable as we use it across methods
	Logger logs = LogManager.getLogger(UsrAccCreateAndVald.class.getName());
	public WebDriver driver=null;
	
	@Given("^webdriver to access a browser$")
    public void webdriver_to_access_a_browser() throws Throwable {
		logs.error("Initiating Driver");
        driver = driverInit();
        logs.error("Driver Initiation complete");
    }
    
    @And("^going to \"([^\"]*)\" page$")
    public void going_to_ecommerce_page(String site) throws Throwable {
    	logs.info("Launching URL - "+site);
        driver.get(site);
        logs.error("URL Launched successfully");
    }


    @When("^user provides (.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+) and (.+)$")
    public void user_provides_email_and_personalinfo(String email, String title, String firstname, String lastname, String pwd,
    		String addrs, String city, String state, String post, String addninfo, String mobile 
    		) throws Throwable {
    	SiteHomePage home = new SiteHomePage(driver);
    	CreateAccountPage acc = home.signIn();
    	acc.putEmail().sendKeys(email);
    	 logs.error("ssss");
    	PersonalInfoPage usrDet = acc.register();
    	 logs.error("55ttytt");
    	
    	if (title == "Mr")
    		usrDet.selectMr().click();
    	else
    		usrDet.selectMrs().click();
    	
    	usrDet.putFirstName().sendKeys(firstname);
    	usrDet.putLastName().sendKeys(lastname);
    	usrDet.putPwd().sendKeys(pwd);
    	usrDet.putAddrs().sendKeys(addrs);
    	usrDet.putCity().sendKeys(city);
    	
    	Select dd = new Select(usrDet.putState());
    	dd.selectByVisibleText(state);
    	
    	usrDet.putPost().sendKeys(post);
    	usrDet.putOther().sendKeys(addninfo);
    	usrDet.putMobile().sendKeys(mobile);
    	usrHome = usrDet.submit();
    	
    }

    @Then("^user (.+),(.+) home page will be displayed$")
    public void user_account_home_page_will_be_displayed(String firstname, String lastname) throws Throwable {
        if (lastname == usrHome.getUserTitle().getText())
        		System.out.println("user creation success");
        usrHome.clickPersonalLink();
    }


    @And("^browser will be closed$")
    public void browser_will_be_closed() throws Throwable {
        driver.close();

}
}

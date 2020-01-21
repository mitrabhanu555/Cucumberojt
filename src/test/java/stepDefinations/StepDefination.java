package stepDefinations;

import org.openqa.selenium.WebDriver;

import CommonFunLib.FunctionERP;
import cucumber.api.java.en.When;

public class StepDefination {
	WebDriver driver;
	
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
	    driver = FunctionERP.startBrowser("chrome");
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable {
		
		FunctionERP.openApplication(driver);
	   
	}

	@When("^Wait For UserName$")
	public void wait_For_UserName() throws Throwable {
		
		FunctionERP.waitForElement(driver, "name", "username", "10");
	   
	}

	@When("^Enter UserName$")
	public void enter_UserName() throws Throwable {
		
		FunctionERP.waitForElement(driver, "name", "username", "10");
	  
	}

	@When("^Wait For Password$")
	public void wait_For_Password() throws Throwable {
		
		FunctionERP.waitForElement(driver, "name", "password", "10");
	    
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
		
		FunctionERP.typeAction(driver, "name", "password", "master");
	    
	}

	@When("^Click On Login$")
	public void click_On_Login() throws Throwable {
	  FunctionERP.clickAction(driver, "id", "btnsubmit");
	}

	@When("^wait For Logout$")
	public void wait_For_Logout() throws Throwable {
	   FunctionERP.waitForElement(driver, "id", "logout", "15");
	}

	@When("^Click On Logout$")
	public void click_On_Logout() throws Throwable {
	   FunctionERP.clickAction(driver, "id", "logout");
	}

	@When("^wait For Ok$")
	public void wait_For_Ok() throws Throwable {
	   FunctionERP.waitForElement(driver, "xpath", "(//*[text()='OK!'])[1]", "15");
	}

	@When("^Click On Ok$")
	public void click_On_Ok() throws Throwable {
	  FunctionERP.clickAction(driver, "xpath", "(//*[text()='OK!'])[1]");
	}

	@When("^CloseBrowser$")
	public void closebrowser() throws Throwable {
	   FunctionERP.closeBrowser(driver);
	}

}

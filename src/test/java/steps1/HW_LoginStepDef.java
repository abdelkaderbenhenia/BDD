package steps1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import util.BrowserFactory;

public class HW_LoginStepDef {
	WebDriver driver;
	LoginPage loginPage;

	 @Before
	 public void beforeRun() {
		 driver=BrowserFactory.startBrowser(); 
		 loginPage=PageFactory.initElements(driver, LoginPage.class);
	 }
	
	
	//@Given("^User is on the Techfios login page$")
	public void User_is_on_the_Techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin/");
	}
	
	
	@Given("^User is on the \"([^\"]*)\" login page$")
	public void User_is_on_the_login_page(String page) {
		if(page.equalsIgnoreCase("Techfios")) {
		driver.get("https://techfios.com/billing/?ng=admin/");
		}else if(page.equalsIgnoreCase("GoogleSearch")) {
		driver.get("https://google.com/billing/?ng=admin/");
		}
	}

	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String userName,String password) throws Throwable {
		loginPage.enterCredentials(userName, password);
	}
	
		@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String userName) throws Throwable {
		loginPage.enterUserName(userName);
	}
	
	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		loginPage.enterPassword(password);
	}

	@When("^User clicks signin button$")
	public void user_clicks_signin_button() throws Throwable {
		loginPage.clickSigninButton();
	}

	
	@When("^User should land on the Dashboard page$")
	public void user_should_land_on_the_Dashboard_page() throws Throwable {
		String expectedTitle="Dashboard- iBilling";
		String actualTitle=loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		//loginPage.takeScreenshotAtEndOfTest(driver);
		
	}
	
	@When("^User clicks bank and cash button$")
	public void user_clicks_bank_and_cash_button() throws Throwable {
		loginPage.clickBankCashButton();
	}
	
	@When("^User clicks New Account$")
	public void user_clicks_New_Account() throws Throwable {
		loginPage.clickNewAccountButton();
	}
	
	@When("^User Add Account enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Add_Account_enters_and(String title, String description, String initialBalance, String accountNumber, String contactPerson, String phone , String bankURL) throws Throwable {
		loginPage.enterNewAccount(title, description, initialBalance, accountNumber, contactPerson, phone, bankURL);
	}
	
	 
	@When("^User clicks submit account button$")
	public void user_clicks_submit_account_button() throws Throwable {
		loginPage.clickSubmitAccountButton();
	}
	
	
	@Then("^User should land on the account add page$")
	public void user_should_land_on_the_account_add_page() throws Throwable {
		Thread.sleep(3000);
		loginPage.takeScreenshotAtEndOfAddAcount(driver);
		
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}


}

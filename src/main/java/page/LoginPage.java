package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_FIELD;

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_FIELD;

	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SIGNIN_FIELD;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a")
	WebElement BANK_CASH_FIELD;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement NEW_ACCOUNT_FIELD;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement ACCOUNT_TITLE_FIELD;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement DESCRIPTION_FIELD;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement INITIAL_BALANCE_FIELD;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement ACCOUNT_NUMBER_FIELD;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement CONTACT_PERSON_FIELD;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement PHONE_FIELD;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement BANKING_URL_FIELD;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SUBMIT_ACCOUNT_FIELD;

	
	
	// Interactive Methods
	public void enterUserName(String userName) {
		USERNAME_FIELD.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}

	public void enterCredentials(String userName, String password) {
		USERNAME_FIELD.sendKeys(userName);
		PASSWORD_FIELD.sendKeys(password);
	}

	public void clickSigninButton() {
		SIGNIN_FIELD.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException{
		TakesScreenshot ts=((TakesScreenshot)driver);
		File scourceFile=ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat formatter=new SimpleDateFormat("MMddyy_HHmmss");
		Date date=new Date();
		String lable=formatter.format(date);
		String currentDirectory=System.getProperty("user.dir");
		//FileUtils.copyFile(scourceFile, new File(currentDirectory + "/screenshot/"+ System.currentTimeMillis()+".png"));
		FileUtils.copyFile(scourceFile, new File(currentDirectory + "/screenshot/"+ lable +".png"));
	}

	public void clickBankCashButton() {
		BANK_CASH_FIELD.click();
	}
	
	public void clickNewAccountButton() {
		NEW_ACCOUNT_FIELD.click();
	}
	
	public void enterNewAccount(String title, String description, String initialBalance, String accountNumber, String contactPerson, String phone , String bankURL) {
		SimpleDateFormat formatter=new SimpleDateFormat("MMddyy_HHmmss");
		Date date=new Date();
		String lable=formatter.format(date);
		ACCOUNT_TITLE_FIELD.sendKeys(title+lable);
		DESCRIPTION_FIELD.sendKeys(description+lable);
		INITIAL_BALANCE_FIELD.sendKeys(initialBalance);
		ACCOUNT_NUMBER_FIELD.sendKeys(accountNumber+lable);
		CONTACT_PERSON_FIELD.sendKeys(contactPerson+lable);
		PHONE_FIELD.sendKeys(phone+lable);
		BANKING_URL_FIELD.sendKeys(bankURL);
	}
	public void clickSubmitAccountButton() {
		SUBMIT_ACCOUNT_FIELD.click();
	}
	public void takeScreenshotAtEndOfAddAcount(WebDriver driver) throws IOException{
		TakesScreenshot ts=((TakesScreenshot)driver);
		File scourceFile=ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat formatter=new SimpleDateFormat("MMddyy_HHmmss");
		Date date=new Date();
		String lable=formatter.format(date);
		String currentDirectory=System.getProperty("user.dir");
		//FileUtils.copyFile(scourceFile, new File(currentDirectory + "/screenshot/"+ System.currentTimeMillis()+".png"));
		FileUtils.copyFile(scourceFile, new File(currentDirectory + "/screenshot/"+ lable +".png"));
	}
}

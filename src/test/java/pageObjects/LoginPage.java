package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import stepDefinitions.BaseClass;
import utilities.Helper;

public class LoginPage extends BaseClass{
	
	public LoginPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public String url = "https://lms-frontend-phase2.herokuapp.com/";

	String errMsg="Invalid username and password Please try again";
	
	@FindBy(xpath = "//input[@id='username']")
	public WebElement UserName;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement Password;

	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	public WebElement LoginBn;
	
	@FindBy(xpath="//form//mat-error[@id='errormessage']")
	public WebElement ErrMsg;

	public void checkTitle() {
		String title = Helper.getTitle();
		System.out.println("Title is "+title);
		Assert.assertEquals(title, "LMS");
	}

	public void checkHomePageTitle() {
		String title = Helper.getTitle();	
		Assert.assertEquals(title, "LMS");
	}

	public void enterUserName(String username) {
		UserName.clear();//		
		System.err.println("User Name: " + username);
		UserName.sendKeys(username);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}

	public void enterPassword(String password) {
		Password.clear();
//		Helper.getDriver().navigate().refresh();
		System.err.println("Password: " + password);
		Password.sendKeys(password);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
	}

	public void clickLogin() throws InterruptedException {
		LoginBn.click();
		Thread.sleep(8000);
	}
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.BaseClass;
import utilities.Helper;

public class LoginPage2 extends BaseClass {
	
	public LoginPage2 (WebDriver webDriver)
	{
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath="//input[@id ='username']")
	@CacheLookup
	WebElement inputUsername;
	
	@FindBy(xpath="//input[@id ='username']")
	@CacheLookup
	static WebElement inputUname;
	
	@FindBy(xpath ="//input[@id ='password']")
	@CacheLookup
	WebElement inputPassword;
	
	@FindBy(xpath ="//input[@id ='password']")
	@CacheLookup
	static WebElement inputPwd;
	
	@FindBy(xpath="//button[@id ='login']")
	@CacheLookup
	WebElement btnLogin;	
	
	@FindBy(xpath="//div[@id ='loginstatus']")
	@CacheLookup
	WebElement divLoginStatus;	
	
	@FindBy(xpath="//mat-card-title/div[1]")
	@CacheLookup
	WebElement divHomePageTitle;
	
	@FindBy(xpath="//mat-error[@id='mat-error-0']")
	@CacheLookup
	WebElement divErrorMsgUN;
	
	@FindBy(xpath="//mat-error[@id='mat-error-1']")
	@CacheLookup
	WebElement divErrorMsgPWD;
	
	@FindBy(xpath="//mat-error[@id='errormessage']")
	@CacheLookup
	WebElement divCommonErrMsg;
	
	@FindBy(xpath="//mat-error[@id='mat-error-5']")
	@CacheLookup
	WebElement divErrMsgwithoutUN;
	
	public void SetUserName(String uName) {
		inputUsername.clear();
		inputUsername.sendKeys(uName);
	}
	
	public static void SetUName(String uName) {
		inputUname.clear();
		inputUname.sendKeys(uName);
	}
	
	public void SetPassword(String pwd) {
		inputPassword.clear();
		inputPassword.sendKeys(pwd);
	}
	
	public static void SetPwd(String pwd) {
		inputPwd.clear();
		inputPwd.sendKeys(pwd);
	}
	
	public void ClickBtnLogin() {
		btnLogin.click();
	}
	
	public String GetLoginStatusMessage() {
		
		String message = "";
		int divMessageSize = Helper.getDriver().findElements(By.id("loginstatus")).size();
		
		if (divMessageSize == 1)
		{
			message = divLoginStatus.getText();
		}
		return message;
	}
	
	public String getHomePgTitle() {
		 return divHomePageTitle.getText();		
	}
	
	public String getErrMsgUN() {
		 return divErrorMsgUN.getText();		
	}
	
	public String getErrMsgPWD() {
		 return divErrorMsgPWD.getText();		
	}
	
	public String getErrMsgCommon() {
		 return divCommonErrMsg.getText();		
	}
	public String getErrMsgWithoutUN() {
		 return divErrMsgwithoutUN.getText();		
	}
}

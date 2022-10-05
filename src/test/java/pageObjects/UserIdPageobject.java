package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserIdPageobject {
	@FindBy(xpath = "//p-button//button[1]//span[1][text()='U001']")
	@CacheLookup
	WebElement UserId1;
	@FindBy(xpath = "//p-button//button[1]//span[1][text()='U002']")
	@CacheLookup
	WebElement UserId2;
	@FindBy(xpath = "//p-button//button[1]//span[1][text()='U003']")
	@CacheLookup
	WebElement UserId3;
	@FindBy(xpath = "//p-button//button[1]//span[1][text()='U004']")
	@CacheLookup
	WebElement UserId4;
	@FindBy(xpath = "//span[text()='Cancel']")
	@CacheLookup
	WebElement Cancelbutton;
	@FindBy(xpath = "//span[text()='Cancel']")
	@CacheLookup
	WebElement Cancelbutton1;
	@FindBy(xpath = "//span[text()='Cancel']")
	@CacheLookup
	WebElement Cancelbutton2;
	@FindBy(xpath = "//span[text()='Cancel']")
	@CacheLookup
	WebElement Cancelbutton3;

	WebDriver driver;

	public UserIdPageobject(WebDriver WebDriver) {
		PageFactory.initElements(WebDriver, this);
	}

	public void UserIdclicking() {
		UserId1.click();
		Cancelbutton.click();
		UserId2.click();
		Cancelbutton1.click();
		UserId3.click();
		Cancelbutton2.click();
		UserId4.click();
		Cancelbutton3.click();
	}
}
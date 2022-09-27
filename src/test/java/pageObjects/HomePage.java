package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.BaseClass;

public class HomePage extends BaseClass {
	public HomePage (WebDriver webDriver)
	{
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath="//mat-card-title/div[1]")
	@CacheLookup
	WebElement divPMHomePageTitle;
	
	public String getPMHomePgTitle() {
		 return divPMHomePageTitle.getText();		
	}
	

}

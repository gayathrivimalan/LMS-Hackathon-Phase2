package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.BaseClass;
import utilities.MenuItems;

public class HeaderPage extends BaseClass{
	
		public HeaderPage (WebDriver webDriver)
		{
			PageFactory.initElements(webDriver, this);
		}
		
		@FindBy(xpath="//span[text()=' LMS - Learning Management System ']")
		@CacheLookup
		WebElement spanSiteHeader;		
		
		@FindBy(xpath="//span[text()='Program']")
		@CacheLookup
		WebElement spanProgramBtn;
		
		@FindBy(xpath="//span[text()='Batch']")
		@CacheLookup
		WebElement spanBatchBtn;		
		
		@FindBy(xpath="//span[text()='User']")
		@CacheLookup
		WebElement spanUserBtn;
		
		@FindBy(xpath="//span[text()='Assignment']")
		@CacheLookup
		WebElement spanAssignmentBtn;
		
		@FindBy(xpath="//span[text()='Attendance']")
		@CacheLookup
		WebElement spanAttendanceBtn;
		
		@FindBy(xpath="//span[text()='Logout']")
		@CacheLookup
		WebElement spanLogoutBtn;
		
		
		public String getSiteHeader() {
			 return spanSiteHeader.getText();		
		}
		
			
		public Boolean IsMenuBarItemDisplayed(MenuItems menuItem) {
			Boolean result = false;
			if(menuItem.equals(MenuItems.Program))
			{
				result = spanProgramBtn.isDisplayed();
			}
			else if(menuItem.equals(MenuItems.Batch))
			{
				result = spanBatchBtn.isDisplayed();
			}
			else if(menuItem.equals(MenuItems.User))
			{
				result = spanUserBtn.isDisplayed();
			}	
			else if(menuItem.equals(MenuItems.Assignment))
			{
				result = spanAssignmentBtn.isDisplayed();
			}
			else if(menuItem.equals(MenuItems.Attendance))
			{
				result = spanAttendanceBtn.isDisplayed();
			}
			else if(menuItem.equals(MenuItems.Logout))
			{
				result = spanLogoutBtn.isDisplayed();
			}
			
			return result;	
			
		}
}

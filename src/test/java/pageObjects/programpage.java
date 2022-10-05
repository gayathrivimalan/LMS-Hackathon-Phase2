package pageObjects;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class programpage {

	WebDriver driver;
	
	@FindBy(xpath="//app-program//div[@class='box'][1]")
    WebElement text;
	@FindBy(xpath ="//span[contains(@class,'current')]")
	WebElement entries;
	@FindBy(xpath ="//div[contains(@class,'footer')]/div")
	WebElement total;
	@FindBy(xpath ="//mat-card-title//button[@icon='pi pi-trash']")
	WebElement delete;
	@FindBy(xpath ="//span[contains(@class,'current')]")
	WebElement record;
    @FindBy (xpath="//input[@placeholder='Search...']")
    WebElement searchtext;
    @FindBy(xpath="//tbody/tr[1]/td[2]")   
    WebElement display;
    @FindBy(xpath="//tbody/tr[1]/td[3]")   
    WebElement desc;
    @FindBy(xpath="//tbody/tr[1]/td[4]")   
    WebElement status;
    
    @FindBy(xpath = "//tr[1]//span[@class='p-button-icon pi pi-pencil']")
	public WebElement editbutton  ;
	@FindBy(xpath = "//div[@role='dialog']")
	public WebElement programdetailform  ;
	@FindBy(xpath = "//input[@id='programName']")
	public WebElement editName  ;
	@FindBy(xpath = "//input[@id='programDescription']")
	public WebElement editdescription  ;
	@FindBy(xpath = "//div[@class='p-radiobutton-box p-highlight']")
	public WebElement statusactive  ;
	@FindBy(xpath = "//input[@id='Inactive']")
	public WebElement statusinactive; 
	@FindBy(xpath = "//button[@ng-reflect-label='Cancel']")
	public WebElement programdetailformcancel  ;
	@FindBy(xpath = "//button[@ng-reflect-label='Save']")
	public WebElement programdetailformsave  ;
	@FindBy(xpath = "//div[contains(@class,'summary')]")
	public WebElement successmsg  ;
	@FindBy(xpath = "//div[contains(@class,'detail')]")
	public WebElement successmsgcont  ;
	
	
	
	@FindBy(xpath = "//div[@class='p-checkbox-box p-component']")
	public List<WebElement> checkboxprogrampage;
	//multipledeleteyes
	@FindBy(xpath = "//p-confirmdialog//span[contains(@class,'title')]")
	public WebElement confirmdeletionform;
	@FindBy(xpath = "//button[@ng-reflect-label='Yes']")
	public WebElement multipledeleteconfirmyes  ;
	@FindBy(xpath = "//span[text()='Are you sure you want to delete the selected programes?']")
	public WebElement multipledeleteconfirm  ;
	@FindBy(xpath = "//button[@ng-reflect-label='No']")
	public WebElement multipledelteconfirmno  ;
	@FindBy(xpath = "//button[@ng-reflect-label='No']")
	public WebElement deletedsearchprogramname  ;
	
	//delete program
	@FindBy(xpath = "//button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only']")
	public WebElement Deletebutton  ;
	@FindBy(xpath = "//span[text()='Yes']")
	public WebElement deteleconfirmyes  ;
	@FindBy(xpath = "//button[@ng-reflect-label='No']")
	public WebElement deleteconfirmno  ;
	@FindBy(xpath = "//button[@ng-reflect-label='No']")
	public WebElement deletepopup  ;
	//
	@FindBy(xpath = "//button[@ng-reflect-label='A New program']")
	public WebElement addnewprogrambutton  ;
	@FindBy(xpath = "//small[@class='p-invalid ng-star-inserted']")
	public WebElement namereq  ;
	@FindBy(xpath = "//span[text()='Save']")
	public WebElement addnewprogramsave  ;
	@FindBy(xpath = "//button[@ng-reflect-label='Cancel']")
	public WebElement addnewprogramcancel  ;
	@FindBy(xpath = "//input[@id='programName']")
	public WebElement addnewprogramentername  ;
	@FindBy(xpath = "//input[@id='programDescription']	")
	public WebElement addnewprogramenterdescription  ;
	@FindBy(xpath = "//input[@placeholder='Select a Program name']	")
	public WebElement addnewprogramdropdownprog  ;
	@FindBy(xpath = "//p-radiobutton[@ng-reflect-value='ACTIVE']	")
	public WebElement addnewprogramactive ;
	@FindBy(xpath = "//p-radiobutton[@ng-reflect-value='INACTIVE']	")
	public WebElement addnewprograminactive ;
	@FindBy(xpath = "//input[@id='programNoOfClasses']	")
	public WebElement addnewprogramnoofclass ;
	@FindBy(xpath = "//button[@ng-reflect-label='Save']	")
	public WebElement newprogramaddedsave ;
	//pagination
	@FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-right']	")
	public WebElement paginationrightangle ;
	@FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-left']	")
	public WebElement paginationleftangle ;
	@FindBy(xpath = "//button[@class='p-paginator-next p-paginator-element p-link p-ripple p-disabled']	")
	public WebElement paginationverifynext ;
	//ascending
	@FindBy(xpath = "//p-sorticon[@field='programName']")
	public WebElement ascendingarrowprogramname ;
	@FindBy(xpath = "//p-sorticon[@field='description']")
	public WebElement ascendingarrowprogramdescription ;
	@FindBy(xpath = "//p-sorticon[@field='status']")
	public WebElement ascendingarrowprogramstatus ;
	

    
    
	public programpage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public String verifyhometext() {
		return text.getText();
		}
	
	public String verifyentries() {
	return entries.getText();	
	}
	
	public String verifytotal() {
		return total.getText();
	}
	
	public boolean verifydelete() {
		return delete.isEnabled();
	}
	public String recordcount() {
		return record.getText();
	}

	
	public String searchtext() {
		String str=(searchtext).getAttribute("placeholder");
		return str;
	}
	
	public void searchname(String name) {
		searchtext.sendKeys(name);
		searchtext.submit();
	}
	
	public String namesearchentries(String name) {
		/*int count = 0;
		while (display.getText().contains(name)){
		    count++;
		    //System.out.println(display.getText()); 
		    //display.getText() = display.getText().substring(display.getText().indexOf(name) + name.length());
		}
		System.out.println("Count is"+ count); 
		return count;*/
		return display.getText();
		
	}
	public String descsearchentries(String descrip) {
		
		return desc.getText();
		
	}
	
	public String statussearchentries() {
		Assert.assertTrue(status.getText().contains("Inactive"));
		return status.getText();		
	}
	
	public void editbutton() {
		editbutton.click();
	}
	public void editprogramname(String name) {
		editName.clear();
		editName.sendKeys(name);		
	}
	public void editedprogramname() {	
		editName.isDisplayed();		
	}
	public void editprogramdescription(String desc) {
		editdescription.clear();
		editdescription.sendKeys(desc);
	}
	public void editeddescripname() {		
		editdescription.isDisplayed();	
	}

	public Boolean changestatus() {
		boolean result=statusinactive.isSelected();
		if( result=false) {
			statusinactive.click();
			result=true;
		}
		return result;
	}
	public void changedstatus() {
		statusinactive.isDisplayed();
	}
	public void cancelprogram() {
		programdetailformcancel.click();
		}
	public void programform() {
		programdetailform.isDisplayed();
	}

	public void saveprogram() {
		programdetailformsave.click();
	}
	
	public void successmessage() {
		successmsg.getText();
		successmsgcont.getText();
		System.out.println(successmsg.getText());
		System.out.println(successmsgcont.getText());
	}
	
	public void checkbox() {
		List<WebElement> rows=checkboxprogrampage;
		for(int i=0;i<rows.size();i++) {
			checkboxprogrampage.get(i).click();;
		}
	}
	public void multipledelete() {
		Deletebutton.click();
	}
	
	public void multipledeleteconfirm() {
		confirmdeletionform.click();
	}
	public void multipledeleteyes() {
		multipledeleteconfirmyes.click();
	}
	public void searchdeletedprogramname(String dgdg) {
		searchtext.click();
		searchtext.sendKeys(dgdg);
		
	}
	public void multipledeleteno() {
		multipledelteconfirmno.click();
	}
	public void deleteanyprogram() {
		Deletebutton.click();
	}
	public void deleteanyprogrampopup() {
		deletepopup.click();
	}
	public void deleteanyprogramyes() {
		deteleconfirmyes.click();
	}
	//select another deletebutton but xpath same for all
	public void deleteanyprogramno() {
		deleteconfirmno.click();
	}
	public void deletesearch(String dgdg) {
		searchtext.click();
		searchtext.sendKeys(dgdg);
		
	}
	public void addnewprogram() {
		addnewprogrambutton.click();
		
	}
	public void addnewprogramsavenotentering() {
		addnewprogramsave.click();
		
	}
	public void addnewprogramnamerequired() {
		namereq.click();
		
	}
	public void addnewprogramcancelnotentering() {
		addnewprogramcancel.click();
		
	}	
	public void addnewprogramenterprogramname(String enterbname) {
		addnewprogramentername.sendKeys(enterbname);
		
	}	
	public void addnewprogramenterdescrip(String enterbdescrip) {
		addnewprogramentername.sendKeys(enterbdescrip);
		
	}
	public void addnewprogramenterprogname(String enterbprogn) {
		addnewprogramdropdownprog.sendKeys(enterbprogn);
		
	}
	public void changestatusaddnewprogram() {
			statusactive.click();
		}
	public void addnewprogramNoofclass(String noofclass) {
		addnewprogramnoofclass.sendKeys(noofclass);
	}
	public void addnewprogramsave() {
		addnewprogramsave.click();
	}
	public void newprogramsearch(String enterbname) {
		searchtext.click();
		searchtext.sendKeys(enterbname);
		
	}
	//pagination
	public void manageprogrampage() {
		text.isDisplayed();	
		
	}
	public void navigatenext() {
		paginationrightangle.click();
	}
	public void navigateprevious() {
		paginationleftangle.click();
	}
	public void navigatelastpage() {
		paginationverifynext.click();
	}
	//ascending
	public void ascendingprogramname() {
		ascendingarrowprogramname.click();
	}
	public void ascendingprogramdesc() {
		ascendingarrowprogramdescription.click();
	}
	public void ascendingprogramstatus() {
		ascendingarrowprogramstatus.click();
	}
	



}

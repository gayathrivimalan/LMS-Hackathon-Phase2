package stepDefinitions;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.programpage;
import utilities.Helper;




public class ProgramTest extends BaseClass{
	//WebDriver driver;
		String URL="https://lms-frontend-phase2.herokuapp.com/";
		
		@Given("In program User is logged on to LMS website")
		public void In_progam_user_is_logged_on_to_lms_website() throws InterruptedException {
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\maniv\\eclipse-workspace\\LMS\\src\\test\\resources\\driver\\chromedriver.exe");
			//driver=new ChromeDriver();
		    //driver.get(URL);
		    //driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Helper.openPage(URL);
			program=new programpage(Helper.getDriver()); 
			
		}

		@When("User is on Program page")
		public void user_is_on_program_page() throws Exception {    
		program=new programpage(Helper.getDriver()); 
		Thread.sleep(1000);
		}

		@Then("User should see a heading with text {string} on the page")
		public void user_should_see_a_heading_with_text_on_the_page(String string) {
			try {
			System.out.println("Verified "+program.verifyhometext());
			Assert.assertTrue(program.verifyhometext().contains("Manage Program"));
			}catch(Exception ex){
				
			}	
		}

	@Then("User should see the text as Showing x to y of z entries below the table")
	public void user_should_see_the_text_as_showing_x_to_y_of_z_entries_below_the_table() {
		try {
		System.out.println("Verified "+program.verifyentries());
		Assert.assertTrue(program.verifyentries().contains("Showing"));
		}catch(Exception ex){
			
		}
	}


}

package com.cg.bookstore.stepdefinations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.cg.bookstore.pagebeans.CreateBookPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookStoreFeatureStepDefination {
	private WebDriver driver;
	private CreateBookPage createBookPage;
	
	/*
	 *	 Setting up the Test Environment
	 *  Driver is set to Chrome to test the HTML page
	 */
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		driver=new ChromeDriver();	
	}
	
	@Given("^Admin is accessing CreateBookPage on Browser$")
	public void admin_is_accessing_CreateBookPage_on_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Admin opens the create book form$")
	public void admin_opens_the_create_book_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^'Create Book' will be displayed on the title$")
	public void create_Book_will_be_displayed_on_the_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Admin is trying submit data without selecting 'Category'$")
	public void admin_is_trying_submit_data_without_selecting_Category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^'This is a required field!' alert message should display$")
	public void this_is_a_required_field_alert_message_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Admin is trying to submit request without entering 'Title'$")
	public void admin_is_trying_to_submit_request_without_entering_Title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Admin is trying to submit request without entering 'Author'$")
	public void admin_is_trying_to_submit_request_without_entering_Author() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Admin is trying to submit request without entering valid 'ISBN'$")
	public void admin_is_trying_to_submit_request_without_entering_valid_ISBN() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Admin is trying to submit request without selecting  valid 'Publish Date'$")
	public void admin_is_trying_to_submit_request_without_selecting_valid_Publish_Date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Admin is trying to submit request without entering  valid 'Book Image'$")
	public void admin_is_trying_to_submit_request_without_entering_valid_Book_Image() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Admin is trying to submit request without entering  valid 'Price'$")
	public void admin_is_trying_to_submit_request_without_entering_valid_Price() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Admin is trying to submit request without entering  valid 'Description'$")
	public void admin_is_trying_to_submit_request_without_entering_valid_Description() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Admin is clicking on 'Save' button after entering valid set of information$")
	public void admin_is_clicking_on_Save_button_after_entering_valid_set_of_information() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^'Book Created Successfully!' alert message should display$")
	public void book_Created_Successfully_alert_message_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	/*
	 *	After the complete testing of the HTML page
	 *	The Chrome Browser will automatically closed
	 *	And the success of all the test cases will be displayed on the console.
	 */
	@After
	public void tearDownStepEnv() {
		driver.close();
	}
	
}

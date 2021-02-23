package stepDefinitions;

import java.io.IOException;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;
import pageObjects.ProductManagement_page;

public class StepDefinitions extends BaseClass {

	@Before
	public void LoadTestData() throws IOException {

		BaseClass load = new BaseClass();
		load.setupSuite();

	}

	@Given("^User Launch Chrome Browser$")
	public void user_Launch_Chrome_Browser() throws Throwable {
		// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		// + "//Drivers/chromedriver2.exe");
		BaseClass.getDriver();
		loginpage = new LoginPage(driver);
		driver.manage().window().maximize();

	}

	@When("^User Opens URL$")
	public void uset_Opens_URL() throws Throwable {
		driver.get(AppUrl);
		Thread.sleep(2000);

	}

	@When("^User enters email \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_email_and_Password_as(String emailId, String password) throws Throwable {
		loginpage.input_For_EmailID_Field(Email);
		loginpage.input_For_Password_Field(Password);

	}

	@When("^User enters invalid emailId and Password as mentioned below$")
	public void user_enters_invalid_emailId_and_Password_as_mentioned_below(DataTable data) throws Throwable {
		List<List<String>> obj = data.raw();
		loginpage.input_For_EmailID_Field(obj.get(0).get(0));
		loginpage.input_For_Password_Field(obj.get(0).get(1));
	}

	@When("^User enters emailid \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_emailid_and_Password_as(String arg1, String arg2) throws Throwable {
		loginpage.input_For_EmailID_Field(arg1);
		loginpage.input_For_Password_Field(arg2);

	}

	@When("^Click on Login$")
	public void click_on_Login() throws Throwable {
		loginpage.click_On_LoginButton();

	}

	@Then("^Dashboard page should be shown$")
	public void dashboard_page_should_be_shown() throws Throwable {

		String value_For_Dashboard_Label = loginpage.read_Value_For_Dashboard_Label();
		String expected_Value = "Dashboard";
		String actual_Value = value_For_Dashboard_Label;
		if (actual_Value.contains(expected_Value)) {
			System.out.println("Asserstion passed, because actual value contains the expected value.");
		}

	}

	@Then("^Validation error message should be shown$")
	public void validation_error_message_should_be_shown() throws Throwable {
		String value_For_ErroMessagePopup_Text = loginpage.read_Value_For_ErroMessagePopup_Text();
		String expected_Value = "We cannot find an account with that username";
		String actual_Value = value_For_ErroMessagePopup_Text;
		if (actual_Value.contains(expected_Value)) {
			System.out.println("Asserstion passed, because actual value contains the expected value.");
		}
		Thread.sleep(3000);
	}

	@When("^User clicks on Logout button and Clicking on confirm button$")
	public void user_clicks_on_Logout_button_and_Clicking_on_confirm_button() throws Throwable {
		loginpage.click_On_LogoutButton();
		loginpage.click_On_Logout_Confirm_Button();

	}

	@Then("^Login page should be shown$")
	public void login_page_should_be_shown() throws Throwable {
		String value_For_SignIn_Text = loginpage.read_Value_For_SignIn_Text();
		String expected_Value = "Sign into your account";
		String actual_Value = value_For_SignIn_Text;
		if (actual_Value.contains(expected_Value)) {
			System.out.println("Asserstion passed, because actual value contains the expected value.");
		}

	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
		driver.close();

	}

}
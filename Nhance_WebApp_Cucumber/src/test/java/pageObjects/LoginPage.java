package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class LoginPage {
	public WebDriver driver;
	WaitHelper waithelper;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// Initialize Elements
		PageFactory.initElements(driver, this);
		waithelper = new WaitHelper(driver);
	}

	// To write the emailID in the emailID field
	@FindBy(xpath = "//input[@class = 'form-control inputboxWidth ng-untouched ng-pristine ng-invalid']")
	public WebElement emailField;

	public void input_For_EmailID_Field(String EmailID) {
		waithelper.WaitForElement(emailField, 10);
		emailField.sendKeys(EmailID);

	}

	// To write the Password in the password field
	@FindBy(xpath = "//input[@class = 'form-control inputboxWidth passsword-field ng-untouched ng-pristine ng-invalid']")
	public WebElement passwordField;

	public void input_For_Password_Field(String Password) {
		waithelper.WaitForElement(passwordField, 10);
		passwordField.sendKeys(Password);

	}

	// To click on Login Button
	@FindBy(xpath = "//input[@class = 'ui-flatButton']")
	public WebElement loginButton;

	public void click_On_LoginButton() {
		waithelper.WaitForElement(loginButton, 10);
		loginButton.click();

	}
	
	// To assert the dashboard label after login
	@FindBy(xpath = "//span[contains(text(), 'Dashboard')]")
	public WebElement dashboard_Label;

	public String read_Value_For_Dashboard_Label() {
		waithelper.WaitForElement(dashboard_Label, 10);
		String value_For_Dashboard_Label = dashboard_Label.getText();
		return value_For_Dashboard_Label;

	}

	// To click on Logout Button
	@FindBy(xpath = "//img[@class = 'logoutLogo']")
	public WebElement logoutButton;

	public void click_On_LogoutButton() {
		waithelper.WaitForElement(logoutButton, 10);
		logoutButton.click();

	}

	// To click on confirm button, after clicking Logout Button
	@FindBy(xpath = "//button[@class = 'swal2-confirm swal2-styled']")
	public WebElement logout_Confirm_Button;

	public void click_On_Logout_Confirm_Button() {
		waithelper.WaitForElement(logout_Confirm_Button, 10);
		logout_Confirm_Button.click();

	}
	
	// To assert the signin text on login screen, after logout
	@FindBy(xpath = "//h2[contains(text(), 'Sign into your account')]")
	public WebElement signIn_Text;

	public String read_Value_For_SignIn_Text() {
		waithelper.WaitForElement(signIn_Text, 10);
		String value_For_SignIn_Text = signIn_Text.getText();
		return value_For_SignIn_Text;

	}
	
	// To assert the validation error message text on login screen, after clicking login with invalid creds
	@FindBy(xpath = "//div[contains(text(), 'We cannot find an account with that username')]")
	public WebElement erroMessagePopup_Text;

	public String read_Value_For_ErroMessagePopup_Text() {
		waithelper.WaitForElement(erroMessagePopup_Text, 10);
		String value_For_ErroMessagePopup_Text = erroMessagePopup_Text.getText();
		return value_For_ErroMessagePopup_Text;

	}


}

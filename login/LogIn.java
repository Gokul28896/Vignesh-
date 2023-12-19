package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.driver.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.SignInPageLocators;
import userdetails.UserData;
import utils.CommonActions;

public class LogIn extends CommonActions{
	
	static WebDriver driver;

	@Given("Launch application")
	public void launch_application() throws InterruptedException {
		driverLaunch();
		launchApp();
	}

	@Given("Enter the username and password")
	public void enter_the_username_and_password() {
		enterText(SignInPageLocators.userNameTextBox, UserData.userName);
		enterText(SignInPageLocators.passwordTextBox, UserData.password);
	}

	@When("I click login button")
	public void i_click_login_button() {
		click(SignInPageLocators.logInButton);
	}

	@Then("I validate the error message")
	public void i_validate_the_error_message() {
		getText(SignInPageLocators.errorMessage);
	}
}

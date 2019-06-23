package com.orangehrm.step;

import org.junit.Assert;

import com.syntax.pages.HomePage;
import com.syntax.pages.LoginPage;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginHRM extends CommonMethods {

	LoginPage login;
	
	@Given("I navigated to OrangeHRM")
	public void i_navigated_to_OrangeHRM() {
		setUp();

	}

	@Given("I see OrangeHRM logo")
	public void i_see_OrangeHRM_logo() {
	    login = new LoginPage();
	    boolean isDisplayed = login.logo.isDisplayed();
	    Assert.assertTrue(isDisplayed);
	}

	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
	    sendText(login.username, ConfigsReader.getProperty("username"));
	    sendText(login.password, ConfigsReader.getProperty("password"));
	  }

	@When("I click login button")
	public void i_click_login_button() {
		 click(login.loginButton);
	}

	
	@Then("I successfully logged in")
	public void i_successfully_logged_in() {
	    HomePage home = new HomePage();
	    Assert.assertTrue(home.pageTitle.isDisplayed());
	}
	
	@Then("I close browser")
	public void i_close_browser() {
	    tearUp();
	}

	@When("I enter invalid username and password")
	public void i_enter_invalid_username_and_password() {
		  sendText(login.username, "Test");
		  sendText(login.password, "Test135");
		 
	}
	
	@Then("I see error message is displayed")
	public void i_see_error_message_is_displayed() {
	    Assert.assertTrue(login.invalidLoginText.isDisplayed());
	    String errorText=login.invalidLoginText.getText().trim();
	    Assert.assertEquals("Invalid Credentials", errorText);
	}
}

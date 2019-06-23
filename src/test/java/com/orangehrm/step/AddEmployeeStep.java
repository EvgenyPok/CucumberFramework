package com.orangehrm.step;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.syntax.pages.AddEmployeePage;
import com.syntax.pages.HomePage;
import com.syntax.pages.LoginPage;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddEmployeeStep extends CommonMethods {

	LoginPage login;
	HomePage home;
	AddEmployeePage emp;

	@Given("I logged into Orange HRM")
	public void i_logged_into_Orange_HRM() {
		login = new LoginPage();
		home = new HomePage();
		emp = new AddEmployeePage();
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@When("I click PIM link")
	public void i_click_PIM_link() {
		click(home.PIM);
	}

	@When("I click on Add Employee Link")
	public void i_click_on_Add_Employee_Link() {
		click(home.addEmployee);
	}

	@When("I provide {string}, {string}, {string} and {string}")
	public void i_provide_Employee_details(String fName, String mName, String lName, String location) {
		sendText(emp.firstName, fName);
		sendText(emp.middleName, mName);
		sendText(emp.lastName, lName);
		click(emp.location);
		selectList(emp.locationList, location);

	}

	@When("I click on create login details")
	public void i_click_on_create_login_details() {
		click(emp.LoginDetailsCheckBox);
		}

	@When("I provide {string},{string}")
	public void i_provide(String username, String password) {
	    sendText(emp.username,username);
	    sendText(emp.password, password);
	    sendText(emp.confirmPassword, password);	   
	}
	
	@When("I  click on Save Button")
	public void i_click_on_Save_Button() {
		click(emp.saveBtn);
	}

	@Then("Employee {string}, {string} successfully added")
	public void employee_successfully_added(String fName, String lName) throws InterruptedException {
		emp = new AddEmployeePage();
		waitForElementBeVisible(emp.empCheck, 40);
		String empName = emp.empCheck.getText();
		
		Assert.assertEquals(fName + " " + lName, empName);
		System.out.println("Added successfully");
	}

	@Then("I see following labels")
	public void i_see_following_labels(DataTable addEmpLabelsExpected) {
		List<String> labels = addEmpLabelsExpected.asList();
		System.out.println("Expected labels list size: "+labels.size());
		
		List<WebElement> labelList=emp.addEmpLabels;
		System.out.println("Actual labels list size: "+labelList.size());
		
		int counter=0;
		for (WebElement label : labelList) {
			for (String explabel : labels) {
				if (explabel.equals(label.getText().replace("*", ""))) {
					counter++;
				}
			}
		}

		Assert.assertEquals(counter, labels.size());
		
		System.out.println("----Prinitng labels from cucmber DataTable");
		for (String explabel : labels) {
			System.out.println(explabel);
		}
	
		System.out.println("----Printing label texts from web page");
		for (WebElement label : labelList) {
			System.out.println(label.getText().replace("*",""));
		}
	}

	@When("I enter invalid username and password I see errorMessage")
	public void i_enter_invalid_username_and_password_I_see_errorMessage(DataTable wrongUsers) throws InterruptedException {
		List<Map<String, String>> usermsg = wrongUsers.asMaps();
		LoginPage login = new LoginPage();
		
		for (Map<String, String> map : usermsg) {
			System.out.println(map.get("UserName"));
			System.out.println(map.get("Password"));
			System.out.println(map.get("ErrorMessage"));
			System.out.println("-------------------");

		
			sendText(login.username, map.get("UserName"));
			sendText(login.password, map.get("Password"));
			click(login.loginButton);
			Thread.sleep(3000);
			waitForElementBeVisible(login.invalidLoginText, 30);
			String actualMessage = login.invalidLoginText.getText().trim();
			String expectedMessage = map.get("ErrorMessage");
			Assert.assertEquals(expectedMessage, actualMessage);
			
		}
	}
	

}

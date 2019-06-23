package com.orangehrm.step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {
	
	public static WebDriver driver;
	public WebElement searchBar;
	
	@Given("I navigated to the google.com website")
	public void i_navigated_to_the_google_com_website() {
	    System.out.println("I am navigating to Google.com website");
	    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

	@When("I type in a search string")
	public void i_type_in_a_search_string() {
		System.out.println("I search an item");
		String searchItem = "SDET vs Tester";
		searchBar = driver.findElement(By.cssSelector("input[title='Search']"));
		searchBar.clear();
		searchBar.sendKeys(searchItem);
		
	   
	   
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
	    System.out.println("I click on search");
	    searchBar.sendKeys(Keys.ENTER);
	}

	@Then("I see the search results are displayed")
	public void i_see_the_search_results_are_displayed() {
	    System.out.println("results are displayed");
	}
}

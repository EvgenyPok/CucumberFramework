package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(className = "page-title")
	public WebElement pageTitle;
	@FindBy(id = "menu_admin_viewSystemUsers")
	public WebElement manageUsers;
	
	@FindBy(xpath="//span[text()='PIM']//..")
	public WebElement PIM;
	
	@FindBy (xpath = "//*[@id='menu_admin_viewAdminModule']//span[text()='Admin']")
	public WebElement admin;
	
	@FindBy (xpath = "//span[text()='Organization']/..")
	public WebElement organization;
	
	@FindBy (xpath = "//span[text()='Locations']/..")
	public WebElement locations;
	
	@FindBy (xpath = "//i[text()='add']/..")
	public WebElement addLocation;
	
	@FindBy(css= "a#menu_pim_addEmployee")
	public WebElement addEmployee;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
}
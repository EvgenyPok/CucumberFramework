package com.syntax.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class AddLocationPage extends BaseClass{

	public AddLocationPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy (css = "input#name") 
	public WebElement locationName;
	
	@FindBy (xpath = "//*[@id='countryCode_inputfileddiv']//div//input") 
	public WebElement selectCountry;
	
	@FindBy (xpath = "//*[@id='countryCode_inputfileddiv']//div//ul/li") 
	public List<WebElement> listOfCountries;
	
	@FindBy (css = "input#city") 
	public WebElement locationCity;	
	
	@FindBy (css = "input#zipCode") 
	public WebElement locationZipCode;
	
	@FindBy (xpath = "//a[text()='Save']") 
	public WebElement saveBtn;
	
	@FindBy (xpath = "//*/tbody/tr/td[2]") 
	public List<WebElement> AddedLocationNamesList;
	
}

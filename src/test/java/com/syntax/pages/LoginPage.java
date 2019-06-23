package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class LoginPage extends BaseClass {
	
	// locating WebElements using @FindBy annotation
	@FindBy(id = "txtUsername") public WebElement username;
	@FindBy(name = "txtPassword") public WebElement password;
	@FindBy(id = "btnLogin") public WebElement loginButton;
	@FindBy (css="img[src*='logo.png']") public WebElement logo;
	
	@FindBy (css="div.toast-message") public WebElement invalidLoginText;
	
	// initialize all of our variables
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username, String password) {
		CommonMethods.sendText(this.username, username);
		CommonMethods.sendText(this.password, password);
		loginButton.click();
		
	}
}

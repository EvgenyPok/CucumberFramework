package com.syntax.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BaseClass {

	public static WebDriver driver;
		
	public static void setUp() {
		
		ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);
		String browser=ConfigsReader.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "src\\test\\resources\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.egde.driver", "src\\test\\resources\\drivers\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("browser given is wrong");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(ConfigsReader.getProperty("url"));
	}
	
	
	public static void tearUp() {
		driver.quit();
	}
	
	
}


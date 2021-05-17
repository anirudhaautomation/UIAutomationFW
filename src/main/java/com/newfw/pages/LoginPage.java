package com.newfw.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newfw.helper.browserconfiguration.config.ObjectReader;
import com.newfw.helper.logger.LoggerHelper;
import com.newfw.helper.wait.WaitHelper;
import com.newfw.testbase.TestBase;
/**
 * 
 * @author anirudha
 *
 */
public class LoginPage {
	private WebDriver driver;
	private final Logger logger = LoggerHelper.getLogger(LoginPage.class);
	WaitHelper waitHelper;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
		//waitHelper.waitForElement(userName,ObjectReader.reader.getExplicitWait());
		new TestBase().getNavigationScreen(driver);
		TestBase.logExtentReport("Login Page Object Created");
	}
	//Login Page Repositories
		@FindBy(id = "txtUsername")
		WebElement userName;
		@FindBy(id = "txtPassword")
		WebElement password;
		@FindBy(id = "btnLogin")
		WebElement loginBtn;
		@FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
		WebElement forgotPasswordLink;
		
		public void checkPageTitle(){
			logger.info("Checking for Page Title");
			//logExtentReport("Checking for Page Title");
			String pageTitle = driver.getTitle();
			logger.info("Page Title is "+ pageTitle);
		}
}

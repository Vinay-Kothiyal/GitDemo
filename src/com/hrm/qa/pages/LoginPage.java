package com.hrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement Username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement Submit;
	
	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle(){
		return driver.getTitle();
		
	}
	
	public HomePage loginHRM(String un, String pw) {
		Username.sendKeys(un);
		Password.sendKeys(pw);
		Submit.click();
		return new HomePage();
	}
	

}

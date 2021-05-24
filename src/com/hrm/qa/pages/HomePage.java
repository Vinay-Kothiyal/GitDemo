package com.hrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	// Page factory
	@FindBy(xpath = "//b[contains(text(),'PIM')]")
	WebElement PIMtab;

    //Initializing Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateHomePageURL() {
		return driver.getCurrentUrl();
	}

	public PIM_Page clickPIMtab() {
		PIMtab.click();
		return new PIM_Page();

	}
}

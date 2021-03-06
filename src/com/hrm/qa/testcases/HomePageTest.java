package com.hrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.hrm.qa.pages.HomePage;
import com.hrm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage= new LoginPage();
		homePage = loginPage.loginHRM(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void verifyHomePageURL() {
		String homeURL = homePage.validateHomePageURL();
		Assert.assertEquals(homeURL, "OrangeHRM");
	}
    @Test
    public void verifyPIMPage() {
    	homePage.clickPIMtab();
    }
    
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

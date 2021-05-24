package com.hrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.hrm.qa.pages.HomePage;
import com.hrm.qa.pages.LoginPage;

import net.bytebuddy.implementation.bind.annotation.Super;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority=1)
	public void testTitle() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}

	@Test(priority=2)
	public void testLogin() {
		homePage = loginPage.loginHRM(prop.getProperty("username"), prop.getProperty("password"));

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

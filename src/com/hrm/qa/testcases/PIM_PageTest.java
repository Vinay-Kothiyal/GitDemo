package com.hrm.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.hrm.qa.pages.HomePage;
import com.hrm.qa.pages.LoginPage;
import com.hrm.qa.pages.PIM_Page;

public class PIM_PageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	PIM_Page pimPage;

	public PIM_PageTest() {
		super();
	}

	@BeforeMethod
	public void setUP() {
		initialization();
		loginPage= new LoginPage();
		homePage = loginPage.loginHRM(prop.getProperty("username"), prop.getProperty("password"));
		pimPage = homePage.clickPIMtab();
		
	}

	@Test(priority=1)
	public void verifyAddEmployeeTab() {
		pimPage.validateAddEmployeePage();
	}

	@Test(priority=2)
	public void verifyAddEmployeebutton() {
		pimPage.validateAddEmployeePage();
		pimPage.validateAddEmpBtn();
	}

	@Test(priority=3)
	public void verifyValidations() {
		pimPage.validateAddEmployeePage();
		pimPage.validateAddEmpBtn();
		List<WebElement> validations = driver.findElements(By.xpath("//span[@class='validation-error']"));
		for (WebElement error : validations) {
			System.out.println(error.getText());
			System.out.println("=========================");
			Reporter.log("Error displayed");
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
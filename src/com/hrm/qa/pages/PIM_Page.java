package com.hrm.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class PIM_Page extends TestBase{
	
	//PageFactory
	@FindBy(xpath="//a[contains(@id,'menu_pim_addEmployee')]")
	WebElement AddEmployee;
	
	@FindBy(xpath="//input[contains(@id,'btnSave')]")
	WebElement Savebtn;
	
	@FindBy(xpath="//span[@class='validation-error']")
	List<WebElement> Errormsg;

	//Initialization
	public PIM_Page() {
		PageFactory.initElements(driver, this);
	}
    //Actions
	public void validateAddEmployeePage() {
		AddEmployee.click();
	}
	
	public void validateAddEmpBtn() {
		Savebtn.click();
	}
}

package testNGpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest_1 {

	@Test
	public void validate_title() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/eclipse setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(
				"https://eshop-oneshop-nginx.stagev2.eshop.yo-digital.com/category/devices-mobile/list/product_listing");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, "Smart Phone", "Title is not matched");
		System.out.println("validate tilte is running");
		driver.quit();

	}

	@Test
	public void validate_url() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/eclipse setup/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://eshop-oneshop-nginx.stagev2.eshop.yo-digital.com/category/devices-mobile/list/product_listing");
		String pageURL = driver.getCurrentUrl();
		boolean filter = driver.findElement(By.xpath("//a[contains(@class,'Filter')]")).isDisplayed();
		Assert.assertTrue(filter, "filter not present");
		System.out.println("validate url is running");
		driver.quit();
	}
}
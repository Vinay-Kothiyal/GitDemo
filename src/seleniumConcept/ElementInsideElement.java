package seleniumConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementInsideElement {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:/eclipse setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.walmart.com");
		////span[contains(@class,'price-main')]
		driver.findElement(By.xpath("//input[@id='a']")).sendKeys("Mens Shoes");
		driver.findElement(By.xpath("//button[@id='global-search-submit']")).click();
		//   //div[@class='search-result-gridview-item-wrapper']
		//  //div[@class='search-result-gridview-item-wrapper']//span[@data-type='priceTags']
		//
	}

}

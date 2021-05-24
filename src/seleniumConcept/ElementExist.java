package seleniumConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/eclipse setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.walmart.com");
		
		////span[contains(@class,'price-main')]
//		boolean searchbox=driver.findElement(By.xpath("//input[@id='global-search-input']")).isDisplayed();
//		System.out.println("Searchbox "+searchbox);
		try {
			driver.findElement(By.xpath("//input[@id='global-search-input2']"));
			System.out.println("Element displayed");
		}
		catch(Exception e) {
			System.out.println("Fail: element not displayed");
		}
		driver.quit();
	}

}

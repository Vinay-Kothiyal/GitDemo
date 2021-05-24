package seleniumConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/eclipse setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.goodreads.com/");
		List<WebElement> images=driver.findElements(By.xpath("//img[contains(@src,'jpg')]"));
		System.out.println(images.size());
		for(WebElement image: images) {
			if(image.isDisplayed()) {
			System.out.println(image.isDisplayed());
			System.out.println(image.getAttribute("alt"));
			System.out.println("=====================================");
			}	
		}
		driver.close();
	}
}

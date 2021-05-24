package seleniumConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrieveWebElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/eclipse setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
	//	List<WebElement> links = driver.findElements(By.xpath("//a"));
		List<WebElement> links = driver.findElements(By.xpath("//ul[@class='header__menu']/li"));
		for (WebElement link : links) {
			String text = link.getText();
			if (!text.trim().isEmpty()) {
				System.out.println(link.getText());
				System.out.println("========================");
			}
		}
		driver.close();
	}
}

package seleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allurl {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse setup\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver",
		// "/NewProject/ExeFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Batman");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Go']")).click();
		List<WebElement> Images = driver.findElements(By.tagName("a"));
		for(WebElement image: Images) {
			System.out.println(image.getText());
			System.out.println("===============================");
		}
		driver.quit();
		
	}

}

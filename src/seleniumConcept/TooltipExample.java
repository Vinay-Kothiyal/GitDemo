package seleniumConcept;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/eclipse setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Actions act = new Actions(driver);
		WebElement app = driver.findElement(By.xpath("//a[@class='gb_D']"));
		act.moveToElement(app).perform();
		Thread.sleep(1000);
		String Apptooltip = driver.findElement(By.xpath("//div[@class='gb_Se']")).getText();
		System.out.println(Apptooltip);

		// System.out.println(driver.findElement(By.xpath("//div[@class='gb_Se']")).getText());
		// System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Google
		// apps')]")).getText());

		Thread.sleep(1000);
		driver.quit();
	}
}

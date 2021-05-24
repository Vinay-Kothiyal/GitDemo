package seleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/eclipse setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/nested-iframes-example/");
		Thread.sleep(1000);
		driver.switchTo().frame("parent_iframe");
		driver.switchTo().frame("iframe1");
		driver.findElement(By.xpath("//button[@id='u_5_6']")).click();
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//button[@id='u_5_5']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Test Pages']")).click();
	}

}

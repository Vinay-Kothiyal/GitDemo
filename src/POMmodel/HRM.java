package POMmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse setup\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'menu_leave_applyLeave')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='applyBtn']")).click();
		List<WebElement> errors=driver.findElements(By.xpath("//span[@class='validation-error']"));
		for(WebElement error: errors) {
			System.out.println(error.getText());
			System.out.println("==========================");
		}
		driver.quit();
	}

}

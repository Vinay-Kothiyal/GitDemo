package seleniumConcept;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindows {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "E:/eclipse setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
		driver.findElement(By.xpath("//button[@id='u_7_8']")).click();
		Set<String> windows = driver.getWindowHandles();
		String twit = "https://twitter.com/";
		for (String s : windows) {
			System.out.println(s);
			driver.switchTo().window(s);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println("=============================");
//			if(driver.getCurrentUrl().equals("https://twitter.com/")) {
			if (driver.getCurrentUrl().equals(twit)) {
				driver.findElement(By.xpath("//a[@href='https://about.twitter.com']")).click();
				break;

			}
//			driver.findElement(By.xpath("//a[@href='https://about.twitter.com']")).click();
		}
	}
}

package seleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramExample1 {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "E:/eclipse setup/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
	driver.switchTo().frame("globalSqa");
	driver.findElement(By.xpath("//[@placeholder='Search...']")).click();
}
}

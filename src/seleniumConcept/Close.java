package seleniumConcept;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "E:/eclipse setup/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.dezlearn.com/multiple-browser-windows/");
	String ParentWindow=driver.getWindowHandle();
	driver.findElement(By.xpath("//button[@id='u_7_8']")).click();
	Set<String> windows=driver.getWindowHandles();
	for(String window: windows) {
		driver.switchTo().window(window);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("==============================");
		driver.close();
		
	}
	
}
}

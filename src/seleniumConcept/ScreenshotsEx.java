package seleniumConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import library.Utility;

public class ScreenshotsEx {

	public static void main(String[] args) throws IOException, Exception {

		System.setProperty("webdriver.chrome.driver", "E:/eclipse setup/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Utility.captureScreenshot(driver, "BrowserStarted");
		Thread.sleep(1000);
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(source, new File("./Screenshots/facebook.png"));
		System.out.println("Screenshot taken");*/
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rahul");
		Thread.sleep(1000);
		Utility.captureScreenshot(driver, "TypeUName");
		driver.quit();
	}

}

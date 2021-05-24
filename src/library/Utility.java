package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {
	
	
	public static void captureScreenshot(WebDriver driver, String screensotName) {
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFileToDirectory(source, new File("./Screenshots/"+screensotName+".png"));
			System.out.println("Screenshot taken");
		} catch (Exception e) {
			
			System.out.println("WException while taking screenshot"+e.getMessage());
		} 
		
	}

}

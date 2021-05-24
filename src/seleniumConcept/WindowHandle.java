package seleniumConcept;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String args[]) {
	//	System.setProperty("webdriver.chrome.driver", "E:/eclipse setup/chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver", System.getProperty(\"user.dir\")+\"ExeFiles/chromedriver.exe\"");
		//System.getProperty("user.dir")+"ExeFiles/chromedriver.exe"
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/ExeFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
	    	if(!window.equals(parentwindow)) {
	    		driver.switchTo().window(window);
	    	}
		}
	    driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
//			if (window.equals(parentwindow)) {
//				System.out.println("same window");
//			} else {
//				driver.switchTo().window(window);
//			}
//		}
//		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
	}
}

package seleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/eclipse setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		int columncount = driver.findElements(By.xpath("//table/tbody/tr[1]/td")).size();
		System.out.println(columncount);
		int rowcount = driver.findElements(By.xpath("//table/tbody/tr")).size();
		for (int i = 1; i <= rowcount; i++) {
			for (int j = 1; j <= columncount; j++) {
				// String s = "//table/tbody/tr["+i+"]/td";
				String s = "//table/tbody/tr[" + i + "]/td[" + j + "]";
				WebElement elem = driver.findElement(By.xpath(s));
				System.out.print(elem.getText() + " ");

			}
			System.out.println();
		}
		driver.quit();
	}

}

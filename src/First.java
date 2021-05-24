import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse setup\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.get("https://www.google.com/");
		driver1.findElement(By.xpath("//input[@name='q']")).sendKeys("Javattpoint");
		Actions action=new Actions(driver1);
		action.moveToElement(driver1.findElement(By.xpath("(//*[text()='javatpoint'])[1]"))).click().build().perform();
		//driver1.findElement(By.xpath("//input[@data-ved='0ahUKEwj2uLK_qI7vAhXJqksFHUWMCKMQ4dUDCAs']")).click();
		driver1.findElement(By.xpath("//span[text()='Javatpoint: Tutorials List']")).click();
		String NewURL = driver1.getCurrentUrl();
		System.out.println(NewURL);
		System.out.println(driver1.getTitle());
		String Title = "Tutorials List - Javatpoint";
		if (driver1.getTitle().equals(Title)) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title not matched");
		}
		driver1.close();
	}
}

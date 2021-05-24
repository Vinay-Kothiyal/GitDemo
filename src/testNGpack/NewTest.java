package testNGpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  @BeforeMethod
  public void beforemethod() {
	 System.out.println("before method");
  }
  @Test(priority=2)
  public void firstmethod() {
	  System.out.println("first method");
  }
  @Test(priority=1)
  public void secondmethod() {
	  System.out.println("second method");
  }
  @AfterMethod
  public void aftermethod() {
	 System.out.println("after method");
  }
}

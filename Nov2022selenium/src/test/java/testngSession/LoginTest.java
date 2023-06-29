package testngSession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends baseTest {
	
	//static WebDriver driver;
	
//	@BeforeTest
//	public static void setup() {
//		
//		driver= new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");	
//	}
	
	@Test(priority=1)
	public static void getTitle() {
		String title= driver.getTitle();
		System.out.println("Title is " + title);
	}
		
	@Test(priority=2)
	public static void isDisplayed() {
		boolean flag= driver.findElement(By.tagName("h2")).isDisplayed();
		Assert.assertTrue(flag);
		System.out.println("is displayed? " + flag);
	}
}

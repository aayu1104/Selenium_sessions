package testngSession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends baseTest{

//	static WebDriver driver;
//	
//	@BeforeTest
//	public static void setup() {
//		
//		driver= new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");	
//	}

	@Test(priority=1)
	public static void getTitle() {
		String title= driver.getTitle();
		System.out.println("Title is " + title);
	}
		
	@Test(priority=2)
	public static void isDisplayed() {
		boolean flag= driver.findElement(By.xpath("//input[@value='Continue']")).isDisplayed();
		Assert.assertTrue(flag);
		System.out.println("is displayed? " + flag);
	}

}

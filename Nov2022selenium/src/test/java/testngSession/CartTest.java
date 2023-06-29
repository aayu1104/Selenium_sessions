package testngSession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends baseTest {
	
	//static WebDriver driver;
	
//	@BeforeTest
//	public static void setup() {
//		
//		driver= new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/");	
//	}
	
	@Test(priority=1)
	public static void getTitle() {
		String title= driver.getTitle();
		System.out.println("Title is " + title);
	}
		
	@Test(priority=2)
	public static void isDisplayed() {
		boolean flag= driver.findElement(By.xpath("//img[@title='MacBook']")).isDisplayed();
		Assert.assertTrue(flag);
		System.out.println("is displayed? " + flag);
	}
}

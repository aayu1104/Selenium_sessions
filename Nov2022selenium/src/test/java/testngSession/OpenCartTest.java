package testngSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {
	
	static WebDriver driver;
	
	@BeforeTest
	public static void setup() {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
	}
	
	@Test
	public void titleTest() {
		
		String title = driver.getTitle();
		System.out.println("page title:" + title);
		Assert.assertEquals(title, "Your Store");
	}

	@Test
	public void searchExistTest() {
		
		boolean flag = driver.findElement(By.name("search")).isDisplayed();
		Assert.assertTrue(flag);
	}

}
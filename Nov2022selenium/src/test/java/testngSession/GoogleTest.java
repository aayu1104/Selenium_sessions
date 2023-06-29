package testngSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {

	static WebDriver driver;
	
	@BeforeTest
	public static void setup() {
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title:" + title);
		Assert.assertEquals(title, "Google");
	}

	@Test
	public void searchExistTest() {
		boolean flag = driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
	}

}

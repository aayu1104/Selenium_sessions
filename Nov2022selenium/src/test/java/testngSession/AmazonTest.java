package testngSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class AmazonTest {
    
	static WebDriver driver;
//	@Test
//	public void amazonPageTest() {
//		System.out.println("checking title....");
//		String title = driver.getTitle();
//		System.out.println("page title:" + title);
//		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
//		
//		
//		
//		System.out.println("checking search....");
//		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
//		Assert.assertTrue(flag);
//		
//		
//		
//		System.out.println("checking help....");
//		boolean flag1 = driver.findElement(By.linkText("Help")).isDisplayed();
//		Assert.assertTrue(flag1);
//
//
//
//	}

	// tcs should be independent
	
	 
	 @BeforeTest
		public static void setup() {
			driver= new ChromeDriver();
			driver.get("https://www.amazon.com");
		}
	 
	@Test
	public void titleTest() {
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("page title:" + title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
		
		//System.out.println("page title:");
	}

	@Test
	public void searchExistTest() {
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.com");
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
		System.out.println("searchExistTest" + flag);
		
		//System.out.println("searchExistTest");
	}

	@Test
	public void isHelpExistTest() {
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.com");
		boolean flag = driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(flag);
		System.out.println("isHelpExistTest" + flag);
		
		//System.out.println("isHelpExistTest");
	}

}
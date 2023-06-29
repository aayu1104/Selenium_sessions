package testngSession;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class baseTest {
	
	static WebDriver driver;
	@Parameters({"url","browser"})
	@BeforeMethod
	public static void setUp(String url,String browserName) {
		
		System.out.println("running test on : " + browserName);	
		
			if (browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else {
				System.out.println("plz pass the right browser...." + browserName);
			}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterMethod
	public static void tearDown() {
		driver.quit();	
	}

}

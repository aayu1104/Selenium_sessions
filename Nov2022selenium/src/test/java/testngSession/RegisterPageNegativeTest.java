package testngSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterPageNegativeTest {
	
	public WebDriver driver;
	
	
	public boolean doRegister(String firstName,String lastName,String email,String telephone,String password,String repassword) throws InterruptedException {
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);
		
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-password")).sendKeys(repassword);
		driver.findElement(By.xpath("//input[@value='0']")).click();
		//driver.findElement(By.xpath("//input[@value='Continue']/preceding-sibling::input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(3000);
		
		String errorMesg = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		System.out.println(errorMesg);
		if (errorMesg.contains("Warning: You must agree to the")) {
			return true;
		}
		return false;
	}

		
	@DataProvider
	public Object[][] getRegTestData() {
		return new Object[][] { //[3][5]
			
			{"Heena", "Vaghela", "heeena@gmail.com", "9090909098", "heena@123", "heena@123"},
			{"vinutha", "ravindra", "vinnu@gmail.com", "9090909099", "vinu@123", "vinu@123"},
			{"supriya", "bendukuri", "suppriya@gmail.com", "9090909088", "sup@123", "sup@123"},
		};
	}
	
	
	@Test(dataProvider = "getRegTestData")
	public void registerTest(String firstName, String lastName, String email, String telephone, String password, String repassword) throws InterruptedException {
		System.out.println(firstName + lastName + email + telephone + password+ repassword);
		boolean flag=doRegister(firstName,lastName,email,telephone,password,repassword);
		Assert.assertTrue(flag);
	}
		
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	}

	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}

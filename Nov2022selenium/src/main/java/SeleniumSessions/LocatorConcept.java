package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1. id
		
		//method 1.(but this method is too lengthy what if we have to change mail and password many times)
		//driver.findElement(By.id("input-email")).sendKeys("ayushi@froiden.com");
		//driver.findElement(By.id("input-password")).sendKeys("ayushi@123");
		
		//method 2.
		//WebElement email=driver.findElement(By.id("input-email"));
		//WebElement password=driver.findElement(By.id("input-password"));		
		//email.sendKeys("ayushi@froiden.com");
		//password.sendKeys("ayushi@123");
		
		//method 3. by locator
//		By email=By.id("input-email");
//		By password=By.id("input-password");
//		
//		WebElement eId= driver.findElement(email);
//		WebElement pwd = driver.findElement(password);
//		
//		eId.sendKeys("ayushi@froiden.com");
//		pwd.sendKeys("ayushi@123");
		
		//method 4. by locator + generic method for web element
//		By email=By.id("input-email");
//		By password=By.id("input-password");
//		
//		getElement(email).sendKeys("abc@qa.com");
//		getElement(password).sendKeys("1234");
		
		
		//method 5. by locator + generic method for web element and actions

//		By email=By.id("input-email");
//		By password=By.id("input-password");
//		
//		doSendKeys(email,"aayu@qa.com");
//		doSendKeys(password,"aayu123");
		
		
		//method 6. by locator + generic method for web element and actions in elementUtil class
		
		By email=By.id("input-email");
		By password=By.id("input-password");
		
		elementUtil eleUtil = new elementUtil(driver); //constructor calling with object creation
		
		eleUtil.doSendKeys(email, "aayu@qa.com");
		eleUtil.doSendKeys(password, "123");
		
	}
	
		public static WebElement getElement(By locator) {
			
			return driver.findElement(locator);
			
		}
		
		public static void doSendKeys(By locator,String value) {
			
			getElement(locator).sendKeys(value);
			
		}
	
	
	
	

}

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {

	static WebDriver driver;

	public static void main(String[] args) {
		
		//create a web element + perform an action(click,semdkeys,gettext,isdisplayed)
		//to create a web element: need a locator
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1.by id: unique
		//driver.findElement(By.id("input-email")).sendKeys("text@qa.com");
		
		//2.by name:can be duplicate so choose id
		//driver.findElement(By.name("email")).sendKeys("text@qa.com");
		
		//3. by class name:can be duplicate most of the time so can not recommended for use it
		//use if it is unique
		//driver.findElement(By.className("form-control")).sendKeys("text@qa.com");
		
		//4.by x-path: not an attribute.address of the element in the HTML DOM
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("aayu@qa.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("aayu@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();		
		
		//using another method
		//by locator
		By email=(By.xpath("//*[@id=\"input-email\"]"));
		By password=(By.xpath("//*[@id=\"input-password\"]"));
		By loginbtn=(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		
		doSendkeys(email,"aayu@qa.com");
		doSendkeys(password,"aayu123");
		doclick(loginbtn);
		
		//5.by css selector
		
		//6.by linkText
		
		//7.PartialLinktext
		
		//8.tagName
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		
		By payment= By.linkText("Recurring payments");
		String val=getElementText(payment);	
		System.out.println(val);
		
	}
	
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
	
		public static void doSendkeys(By locator, String value) {
			getElement(locator).sendKeys(value);
		}
	
		public static void doclick(By locator) {
			getElement(locator).click();
		}
	
		public static String getElementText(By locator) {
			return getElement(locator).getText();
		}
		
		
		
}

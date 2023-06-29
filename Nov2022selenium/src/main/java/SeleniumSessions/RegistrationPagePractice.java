package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPagePractice {

	static WebDriver driver;

	public static void main(String[] args) {
		
		//create a web element + perform an action(click,sendkeys,gettext,isdisplayed)
		//to create a web element: need a locator
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//create locators:
		By firstName=(By.id("input-firstname"));
		By lastName=(By.name("lastname"));
		By email= (By.xpath("//*[@id=\"input-email\"]"));
		By telephone= (By.cssSelector("#input-telephone"));
		By password= (By.id("input-password"));
		By confirmPassword= (By.id("input-confirm"));
		By radioBtn= (By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
		By checkbox= (By.name("agree"));
		By submit= (By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		By tagName= (By.tagName("h1"));
		
		doSendKeys(firstName,"Ayushi");
		doSendKeys(lastName,"Khandal");
		doSendKeys(email,"ayushikhandal1102@gmail.com");
		doSendKeys(telephone,"9024092859");
		doSendKeys(password,"Ayushi@123");
		doSendKeys(confirmPassword,"Ayushi@123");
		doClick(radioBtn);
		doClick(checkbox);
		doClick(submit);
		String tag=getElementText(tagName);
		
		if(tag.equals("Your Account Has Been Created!")) {
			
			System.out.println("Pass");
		}else
			System.out.println("fail");
		//System.out.println(tag);
	}
	
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
	
		public static void doSendKeys(By locator, String value) {
			getElement(locator).sendKeys(value);
		}
	
		public static void doClick(By locator) {
			getElement(locator).click();
		}
		
		public static String getElementText(By locator) {
			return getElement(locator).getText();
			
		}
	
	
	
	

}

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) {
		
		String browserName= "chrome";
		
		browserUtil brUtil= new browserUtil();// object of brUtil class
		
		WebDriver driver=brUtil.initDriver(browserName);
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = brUtil.getPageTitle();
		System.out.println(title);
		
		//by locators
		
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		elementUtil eleUtil = new elementUtil(driver);
		
		eleUtil.doSendKeys(firstName, "Amrita");
		eleUtil.doSendKeys(lastName, "singh");
		eleUtil.doSendKeys(email, "Amrita@qa.com");
		eleUtil.doSendKeys(telephone, "7964122455");
		eleUtil.doSendKeys(password, "Amrita@123");
		eleUtil.doSendKeys(confirmPassword, "Amrita@123");
		
		
	}


}




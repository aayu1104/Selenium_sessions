package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownHandle {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//dropDown---> htmltag <select>
		//use select class in selenium
		
//		WebElement country_ele=driver.findElement(By.id("Form_getForm_Country"));
//		
//		Select select = new Select(country_ele);
//		select.selectByIndex(7);
//		select.selectByValue("India");//value attribute
//		select.selectByVisibleText("Belgium");//text on the option
		
		By country= By.id("Form_getForm_Country");
		doSelecctDropDownByIndex(country,101);
		Thread.sleep(2000);
		doSelectDropDownByValue(country, "India");
		Thread.sleep(2000);
		doSelectDropDownByVisibleText(country,"Belgium");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelecctDropDownByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByValue(By locator,String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectDropDownByVisibleText(By locator,String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	
	
	
	
	
}

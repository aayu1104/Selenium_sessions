package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getFooterElementsList {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By footerEle= (By.xpath("//footer[//a"));
		List<String>footerText=getFooterElementTextList(footerEle);
		System.out.println(footerText);		
				
	}
	
	
	public static List<String> getFooterElementTextList(By locator) {
		List<String> footerEleTextList = new ArrayList<String>();//top casting and physical capacity of this arraylist is zero,virtual is 10;ArrayList class is child of list interface
		List<WebElement> eleList=getElements(locator);
		for(WebElement e :eleList) {
			String text=e.getText();
			footerEleTextList.add(text);
		}
		return footerEleTextList;
	}
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}	

}

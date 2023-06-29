package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementFromPageSection {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		List<WebElement> panelLinksList= driver.findElements(By.xpath("//aside[@id='column-right']//a"));
//		System.out.println(panelLinksList.size());
//		
//		for(WebElement e :panelLinksList ) {
//			String text=e.getText();
//			System.out.println(text);
//		}
		
		By rightPanelLinks= (By.xpath("//aside[@id='column-right']//a"));
		List<String> ListElement= getElementTextList(rightPanelLinks);
		System.out.println(ListElement);
		
	}
	
	public static List<String> getElementTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();//top casting and physical capacity of this arraylist is zero,virtual is 10;ArrayList class is child of list interface
		List<WebElement> eleList=getElements(locator);
		
		for(WebElement e :eleList) {
			String text=e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}	

}

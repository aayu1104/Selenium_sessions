package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttribute {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.findElement(By.tagName("a"));
		
		By links= By.tagName("a");
		By imges= By.tagName("img");
		
//		List<WebElement> linksList=getElements(links);
//		System.out.println("total links  " + linksList.size());
//		
//		for(WebElement e : linksList) {
//			String hrefVal= e.getAttribute("href");
//			String linkText=e.getText();
//			
//			System.out.println(hrefVal + "------>" +linkText);
//		}
//		
//		List<WebElement> imgesList=getElements(imges);
//		System.out.println("total imges  " + imgesList.size());
//		
//		for(WebElement e : imgesList) {
//			String srcVal= e.getAttribute("href");
//			
//			System.out.println(srcVal);
//		}
		
		getElementsAttributes(links,"href");
		getElementsAttributes(imges,"src");
		
	}
	//generic method
	
	public static void getElementsAttributes(By locator,String attrName) {
		List<WebElement> eleList= getElements(locator);
		
		for(WebElement e: eleList) {
			String attrVal = e.getAttribute(attrName);
			System.out.println(attrVal);
		}
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
		
	}
}

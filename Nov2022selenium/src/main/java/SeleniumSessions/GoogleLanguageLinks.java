package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		By lang=By.xpath("//div[@id='SIvCob']/a");
		By footerPath=By.xpath("//div[@class='KxwPGc SSwjIe']//a");
		
		List<String>footertext =getFooterEleLinks(footerPath);
		System.out.println(footertext);
		
		List<WebElement> langLinks=driver.findElements(lang);
		System.out.println(langLinks.size());
		
		for(WebElement e :langLinks) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals("ગુજરાતી")) {
				e.click();
				break;
			}
		}	
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static List<String> getFooterEleLinks(By locator) {
		List<String> footerEleTextList = new ArrayList<String>();
		List<WebElement> eleList=getElements(locator);
			for(WebElement e :eleList) {
				String text=e.getText();
				footerEleTextList.add(text);
			}
		return footerEleTextList;	
	}
}

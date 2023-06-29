package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImgs {

	static WebDriver driver;

	public static void main(String[] args) {
		
		//create a web element + perform an action(click,sendkeys,gettext,isdisplayed)
		//to create a web element: need a locator
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//find all the links on the page
		List<WebElement> imgsList=driver.findElements(By.tagName("img"));
		//print the total links count
				int imgsCount=imgsList.size();
				System.out.println(imgsCount);
	}

}

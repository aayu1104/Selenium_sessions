package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		
		//create a web element + perform an action(click,sendkeys,gettext,isdisplayed)
		//to create a web element: need a locator
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//find all the links on the page
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
		
		//print the total links count
		int linksCount=linksList.size();
		System.out.println(linksCount);
		
		//print the text of each link
		
//		for(int i=0;i<linksCount;i++) {
//				String text=linksList.get(i).getText();
//		
//			//avoid blank text
//		
//				if(text.length()>0) {
//					System.out.println(i +   text);
//					
					//get total blank links count 
					
					//int blankCount= linksCount-(text.length());
					//System.out.println("blank count is "+ blankCount);
			//	}	
				
				
		 //}
		
		
		//for each
			int count=0;
			for(WebElement e:linksList ) {
				
				String text= e.getText();
				if(text.length()>0) {
					System.out.println(count +":"+text);
					count++; 
				}
				
				//count++; 
			}
			System.out.println(count);
			int blankLinks = linksCount-count;
			System.out.println(blankLinks);
	}

}
  
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleExceptionGoogleConcept {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		List <WebElement> linksList=driver.findElements(By.xpath("//div[@id= 'SIvCob']//a"));
		
		for (int i=0 ; i< linksList.size(); i++) {
			
			linksList.get(i).click();
			Thread.sleep(3000);
			linksList=driver.findElements(By.xpath("//div[@id= 'SIvCob']//a"));
		}
			
	}

}
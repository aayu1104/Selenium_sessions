package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorConcept {

	public static void main(String[] args) throws InterruptedException {

//		above
//	near
//left	.   right
//	
//	   below
	
//sel 4.x:
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.aqi.in/dashboard/canada");
	
	Thread.sleep(3000);
	
	WebElement ele=driver.findElement(By.linkText("Lethbridge, Canada"));
	
	String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
	System.out.println(rightIndex);
	
	String leftIndex= driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
	System.out.println(leftIndex);

	String aboveIndex= driver.findElement(with(By.tagName("p")).above(ele)).getText();
	System.out.println(aboveIndex);

	String belowIndex= driver.findElement(with(By.tagName("p")).below(ele)).getText();
	System.out.println(belowIndex);	
		
	String nearIndex= driver.findElement(with(By.tagName("a")).below(ele)).getText();
	System.out.println(nearIndex);		
			
	}

}

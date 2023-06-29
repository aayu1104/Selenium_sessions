package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcepts {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.in/");  // or driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		
	}

}

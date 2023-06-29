package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// 1. open browser:chrome,ff
		
		//ChromeDriver driver= new ChromeDriver();
		
		//top casting
		
		String browser="Chrome";
		WebDriver driver=null;

//		if(browser.equals("Chrome")) {
//			driver= new ChromeDriver();
//		}else if(browser.equals("Safari")) {
//			driver= new SafariDriver();
//		}else {
//			System.out.println("please check");
//		}
		
		switch(browser){
			
		case "Chrome":
			driver= new ChromeDriver();
		case "Firefox":
			driver= new FirefoxDriver();
		}
		
		
		//2. get URL
		
		driver.get("https://www.google.com");
		
		//3. get title
		
		String actTitle= driver.getTitle();
		System.out.println("Page title "+ actTitle);
		
		//validation/checkpoint
		if(actTitle.equals("Google")) {
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
		
		//Automation steps(1,2,3) + validation = automation testing
		
		driver.quit();
		
	}
	
	
	
	
	

}

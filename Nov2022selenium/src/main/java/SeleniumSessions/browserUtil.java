package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class browserUtil {
	
	private WebDriver driver;
	
	/**
	 * This method is used to initialize the driver on the bases of given browser
	 * @param browserName
	 * @return this return the specific browser driver
	 */
	public WebDriver initDriver(String browserName) {
		
		switch(browserName.toLowerCase().trim()) {
		
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "fireFox":
			driver=new FirefoxDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;
		case "Edge":
			driver=new EdgeDriver();
			break;
			
		default:
		break;
		
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		return driver;
		
	}
		public void launchUrl(String url) {
			
			if(url==null) {
				System.out.println("yrl can't be null");
			}
		
			if(url.indexOf("https")==0) {
				driver.get(url);
			}
		
		}
	
		
		public String getPageTitle() {
			String title = driver.getTitle();
			return title;
		}
	
	
	
	
	
	

}

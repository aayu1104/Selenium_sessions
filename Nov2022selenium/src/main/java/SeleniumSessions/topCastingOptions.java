package SeleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class topCastingOptions {

	public static void main(String[] args) {
		
		//1.  browser specific - can't be used for cross browser testing
		//ChromeDriver driver = new ChromeDriver();//cd
		//FirefoxDriver driver = new FirefoxDriver();//ff
		
		//2. wd= new cd valid top casting recommended
		//WebDriver driver = new ChromeDriver();
		
		//3. sd= new cd - valid but not recommended
		//SearchContext driver = new ChromeDriver();
		
		//4. rwd= new cd valid top casting recommended
		//RemoteWebDriver driver = new ChromeDriver();
		
		//5. wd= new rwd - used for remote execution(on third party),GRID
		//WebDriver driver = new RemoteWebDriver(remoteAddress,capabilities);
		
		//6. sc= new rwd - not recommended
		//SearchContext driver = new RemoteWebDriver(remoteAddress,capabilities);
		
		
		//WebDriver driver= new WebDriver(); //it is an interface and you can not create the object.
	}

}

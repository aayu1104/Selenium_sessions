package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitVsClose {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("htttps://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		System.out.println(driver.getTitle());
		
		
		
	}

}

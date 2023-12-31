package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
		Thread.sleep(4000);
		
		selectUser("deepti gupta");
		String cName= getUserCompanyName("deepti gupta");
		System.out.println(cName);
		
		
	}

	////a[text()='deepti gupta']/parent::td/preceding-sibling::td/input[@type='checkbox']
	public static void selectUser(String userName) {
		
		driver.findElement(By.xpath("//a[text()='deepti gupta']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	////a[text()='deepti gupta']/parent::td/following-sibling::td/a[@context='company']
	public static String getUserCompanyName(String userName) {
		
		return driver.findElement(By.xpath("//a[text()='deepti gupta']/parent::td/following-sibling::td/a[@context='company']")).getText();
	}
	
	
	
	
	
	
	
}

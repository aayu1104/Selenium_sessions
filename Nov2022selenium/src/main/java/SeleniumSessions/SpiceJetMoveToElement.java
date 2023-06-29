package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpiceJetMoveToElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		
		WebElement addOn = driver.findElement(By.xpath("//div[text()='Add-ons']"));
		Actions act = new Actions(driver);
		act.moveToElement(addOn).build().perform();
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Zero Cancellation")).click();
		
	}

}

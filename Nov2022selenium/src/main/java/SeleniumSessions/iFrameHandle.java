package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//browser - ch

		//page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
		
		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("proposal 1");
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-3']")).sendKeys("Jaipur");
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-4']")).sendKeys("2023-03-31");
		driver.findElement(By.name("RESULT_TextArea-5")).sendKeys("Gather motor vehicle information quickly and efficiently with Formsite’s Vehicle Registration Form Template for vehicles, motorcycle.");
		driver.findElement(By.name("RESULT_FileUpload-6")).sendKeys("/home/froiden/Downloads");
		Thread.sleep(3000);
		driver.findElement(By.name("RESULT_TextField-8")).sendKeys("Ayush");
		driver.findElement(By.name("RESULT_TextField-9")).sendKeys("Sharma");
		driver.findElement(By.name("RESULT_TextField-10")).sendKeys("gyanwardhan heights");
		driver.findElement(By.name("RESULT_TextField-11")).sendKeys("Jhotwara");
		driver.findElement(By.name("RESULT_TextField-12")).sendKeys("Kota");
		
		//Dropdown
		WebElement state_ele=driver.findElement(By.id("RESULT_RadioButton-13"));
		Select select = new Select(state_ele);
		select.selectByIndex(7);
		
		driver.findElement(By.name("RESULT_TextField-14")).sendKeys("45578");
		driver.findElement(By.name("RESULT_TextField-15")).sendKeys("789458626");
		driver.findElement(By.name("RESULT_TextField-16")).sendKeys("la@qa.in");
		driver.findElement(By.name("Submit")).click();
		
		
		
		//driver.switchTo().defaultContent();
		
		
	}

}
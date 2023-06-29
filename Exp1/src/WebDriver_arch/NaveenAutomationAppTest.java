package WebDriver_arch;

public class NaveenAutomationAppTest {

	
	 	//static Webdriver driver;
	 	public static void main(String[] args) {
		
		//top-casting used to make only one object so that you can use any browser from one object
	 		Webdriver driver = new ChromeDriver();
		
		//ChromeDriver driver = new ChromeDriver();
		
		driver.get(" https://www.naveenautomationlab.com");
		String actualTitle = driver.getTitle();
		System.out.println("pagetitle : "+ actualTitle);
		if(actualTitle.equals("naveen automation lab")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}
		
		driver.sendKeys("email", "naveen@gmail.com");
		driver.sendKeys("password", "123456");
		driver.click("login button");
		driver.close();
	}

}

package WebDriver_arch;

public class ChromeDriver implements Webdriver {
	
	//constructor
	public ChromeDriver() {
	
		System.out.println("chrome is launched...");
	}

	@Override
	public void findElement(String element) {
		System.out.println("find elements" + element);		
	}

	@Override
	public void get(String url) {
		System.out.println("enter url " + url);	
		
	}

	@Override
	public String getTitle() {
		System.out.println("getting the title ");
		return "naveen automation lab";
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on button "+ element);
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering value " + value + "into" + element);
		
	}

	@Override
	public void close() {
		System.out.println("Close browser");
		
	}

}

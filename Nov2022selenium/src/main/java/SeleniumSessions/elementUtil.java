package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class elementUtil {
	
	private WebDriver driver;
	
	public elementUtil(WebDriver driver) {  //constructor
		this.driver=driver;  //to provide same session id 
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
		
	}
	
	public void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
		
	}

	public  void doclick(By locator) {
		getElement(locator).click();
	}

	public String getElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public String getElementAttribute(By locator,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public void getElementsAttributes(By locator,String attrName) {
		List<WebElement> eleList= getElements(locator);
		
		for(WebElement e: eleList) {
			String attrVal = e.getAttribute(attrName);
			System.out.println(attrVal);
		}
		
	}
	
	public int getElementsCount(By locator) {
		int eleCount =  getElements(locator).size();
		System.out.println("total elements for  "+locator+ "------>"+ eleCount);
		return eleCount;
	}
	
	public  List<String> getElementTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();//top casting and physical capacity of this arraylist is zero,virtual is 10;ArrayList class is child of list interface
		List<WebElement> eleList=getElements(locator);
		
		for(WebElement e :eleList) {
			String text=e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}
	
	//////  ------------------drop-down by select tag utils------------------

	public void doSelecctDropDownByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void doSelectDropDownByValue(By locator,String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public void doSelectDropDownByVisibleText(By locator,String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
		
		}
	
	public List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		List<String> optionsTextList = new ArrayList<String>();
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
		
		}

	public void selectDropDownValue(By locator, String expValue) { //this method is used when you don't have these 3 option to select the option of drop down
		List<WebElement> optionsList = getDropDownOptionsList(locator);
			for(WebElement e : optionsList) {
				String text = e.getText();
				System.out.println(text);
					if(text.equals(expValue)) {
						e.click();
						break;
					}
			}
	}
		
	public int getTotalDropDownOptions(By locator) {
		int optionsCount = getDropDownOptionsList(locator).size();
		System.out.println("total options ==> " + optionsCount);
		return optionsCount;
		
	}
	

}

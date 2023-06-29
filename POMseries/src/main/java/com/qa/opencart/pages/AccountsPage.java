package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	
	public WebDriver driver;
	
	//private by locators
	
		private By logoutLink= By.linkText("Logout");
		private By accsheaders= By.cssSelector("div#content h2");
		private By search= By.name("search");

	//const..
	public AccountsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//page actions/methods
	//private by locators are used in public methods- encapsulation
	public String getAccountpageTitle() {
		String title=driver.getTitle();
		System.out.println("tile is"+ title);
		return title;
	}
	
	public String getAccountpageURL() {
		String url=driver.getCurrentUrl();
		System.out.println("tile is"+ url);
		return url;
	}
	
	public boolean isLogoutLinkExist() {
		return driver.findElement(logoutLink).isDisplayed();
	}
	
	public boolean isSearchExist() {
		return driver.findElement(search).isDisplayed();
	}
	
	public List<String> getAccountsPageHeaderList() {
		List<WebElement> accsHeaderList= driver.findElements(accsheaders);
		List<String> accsHeaderValList=new ArrayList<String>();
		
		for(WebElement e:accsHeaderList) {
			String text=e.getText();
			accsHeaderValList.add(text);
		}
		return accsHeaderValList;
		
	}
	
	
	
}

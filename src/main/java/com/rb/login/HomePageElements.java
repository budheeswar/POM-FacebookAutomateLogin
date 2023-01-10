package com.rb.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageElements {
	
	WebDriver driver;
	
	By logoff = By.linkText("Log out");
	
	public HomePageElements(WebDriver d) {
		this.driver=d;
	}
	
	public void doLogOut() {
		driver.findElement(logoff).click();
	}
	
	

}

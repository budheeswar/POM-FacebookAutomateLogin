package com.rb.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeLoginPageElements {
	
	WebDriver driver;
	
	By user = By.name("username");
	By password = By.name("password");
	By submit = By.id("submit");
	
	public PracticeLoginPageElements(WebDriver d) {
		this.driver= d;
	}
	
	public void loginCredentials(String name, String pass) {
		driver.findElement(user).sendKeys(name);
		driver.findElement(password).sendKeys(pass);
		
	}
	public void clickSubmit() {
		driver.findElement(By.id("submit")).click();
	}
	

}

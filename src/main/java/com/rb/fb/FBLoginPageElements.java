package com.rb.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBLoginPageElements {
	WebDriver driver;

	public FBLoginPageElements(WebDriver d) {
		this.driver = d;
	}
	
	//Locating Elements
	By email = By.id("email");
	By password = By.id("pass");
	By login = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button");
	
	//Methods for above elements
	public void setEmail(String e) {
		driver.findElement(email).sendKeys(e);
	}
	public void setPassword(String p) {
		driver.findElement(password).sendKeys(p);
	}
	
	public void clickLogin() {
		System.out.println("before login click");
		driver.findElement(login).click();
		System.out.println("after login click");
	}
	public void loginData(String eml, String passw) {
		this.setEmail(eml);
		this.setPassword(passw);
		this.clickLogin();
	}
}

package com.rb.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBHomePageElements {
	WebDriver driver;

	public FBHomePageElements(WebDriver d) {
		this.driver = d;
	}

	// By nameText =
	// By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/ul/li/div/a/div[1]/div[2]/div/div/div/div/span/span");
	By profile = By.className("x3ajldb");
	By logout = By.xpath(
			"/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span");

	// Methods for above elements
	public void homePageTitle() {
		
		System.out.println("Home Page Title " + driver.getTitle());
		
	}
	public void profileNavigation() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(profile).click();
	}
	public void logOut() {
		driver.findElement(logout).click();
		System.out.println("Logout Successfully");
	}
}

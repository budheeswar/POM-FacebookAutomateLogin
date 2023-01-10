package com.rb.fb;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {

	WebDriver driver;

	@Test(priority = 0)
	public void fbLoginMethod() {
		// Create object for LOGIN PAGE Class
		FBLoginPageElements fbLogin = new FBLoginPageElements(driver);
		fbLogin.loginData("keepsmileeveryday000@gmail.com", "danarekha");
	}

	@Test(priority = 1)
	public void fbHomeMethod() throws InterruptedException {
		Thread.sleep(2000);
		FBHomePageElements home = new FBHomePageElements(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		home.profileNavigation();
		home.logOut();
	}

	@BeforeTest
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void afterTest() {
		//driver.quit();
	}

}

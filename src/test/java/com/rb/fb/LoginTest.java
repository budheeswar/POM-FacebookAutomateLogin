package com.rb.fb;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rb.login.PracticeLoginPageElements;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	String Name = "student";
	String password = "Password123";
  @Test
  public void loginWebPageCredentials() {
	  PracticeLoginPageElements login = new PracticeLoginPageElements(driver);
	  login.loginCredentials(Name, password);
	  login.clickSubmit();
	  
	  
  }
  @BeforeTest
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void afterTest() {
		//driver.quit();
	}

}

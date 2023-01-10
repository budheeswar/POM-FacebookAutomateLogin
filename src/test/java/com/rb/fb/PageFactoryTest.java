package com.rb.fb;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.rb.pagefactory.POM_PageFactoryApproach;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactoryTest {
	
	WebDriver driver;
  @Test
  @Parameters("SearchKey")
  public void SearchSelenium(String key) throws AWTException {
	  //Provide key value in xml file
	  //key = Selenium"
	  POM_PageFactoryApproach object =  new POM_PageFactoryApproach(driver);
	  object.fetchTitle();
	  object.searchKey(key);
  }
  @BeforeTest
 	public void beforeTest() {

 		WebDriverManager.chromedriver().setup();
 		driver = new ChromeDriver();
 		driver.get("https://google.com/");
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 	}

 	@AfterTest
 	public void afterTest() throws InterruptedException {
 		Thread.sleep(5000);
 		driver.quit();
 	}


}

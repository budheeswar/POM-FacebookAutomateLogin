package com.rb.pagefactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class POM_PageFactoryApproach {
	
	// wil try to automate google search using POM design pattern using PAGE FACTORY
	
	WebDriver driver;
	
	public POM_PageFactoryApproach(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(d, this);
	}
	
	//Locating elements
	@FindBy(how = How.CLASS_NAME, using ="gLFyf")
	WebElement searchBox;
	
	public void fetchTitle() {
		String t = driver.getTitle();
		System.out.println("Title :"+t);
	}
	public void searchKey(String key) throws AWTException {
		searchBox.sendKeys(key);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
	}	

}

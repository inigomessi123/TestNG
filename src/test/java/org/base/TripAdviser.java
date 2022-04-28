package org.base;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;

public class TripAdviser extends BaseClassMethod {
	
public static void main(String[] args) throws AWTException, InterruptedException {
	getDriver();
	launchUrl("https://www.tripadvisor.in/");
	WebElement search = locators("xpath", "//input[@placeholder='Where to?']");
	textSend("finland", search);
	enter();
	
	Thread.sleep(5000);
	
	WebElement frameSwitch = locators("xpath","handlers");
	
	driver.switchTo().frame(frameSwitch);
	
	
	
	
		
		
	}
}

package org.base;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataDriven extends BaseClassMethod{
		

public static void main(String[] args) throws AWTException   {
			getDriver();
		launchUrl("https://www.amazon.in/");
		locators("id", "twotabsearchtextbox");
		textSend("iphone 13 pro max", findElement);
	enter();
		
		locators("id", "nav-search-submit-button");
		buttonClick2();
		
List<WebElement> iphoneList = locators1("tagName", "h2");
		
		for (int i = 0; i < iphoneList.size(); i++) {
			WebElement webElement = iphoneList.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
		}

		
		
		
	



}
}
	
	
	



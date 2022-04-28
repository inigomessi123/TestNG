package org.base;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testing5 extends BaseClassMethod{
	
	
	
	
	
	@Test(dataProvider="Datas")
	private void tc01(String UserName,String PassWord) throws InterruptedException, IOException {
		getDriver();
		launchUrl("https://www.facebook.com/");
		locators("id", "email").sendKeys("UserName");
		locators("id", "pass").sendKeys("PassWord");
		locators("name", "login").click();
		Thread.sleep(2000);
		screenShot("login");
		
	}
	
}



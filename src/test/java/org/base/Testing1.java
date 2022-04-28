package org.base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing1 extends BaseClassMethod {
	@Parameters({"userNamee","passWord"})
	@Test
	private void tc01(@Optional ("iniko.3192@gmail.com")String userName,String passWord) {
	getDriver();
	launchUrl("https://www.facebook.com/");
	WebElement textUser=locators("id","email");
	textSend(userName,textUser);
	textJavaScript2(userName, findElement);
	
	WebElement textPass=locators("id","pass");
	textSend(passWord, textPass);
	textJavaScript2(passWord, findElement);
	
	WebElement login=locators("name","login");
	buttonClick(login);

	}

}

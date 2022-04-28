package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassMethod {
public static WebDriver driver;
public static WebElement findElement;
public static WebElement findElements;
JavascriptExecutor jk=(JavascriptExecutor)driver;

public static WebDriver getDriver() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.manage().window().maximize();
return driver;
}
public static void launchUrl(String url) {
driver.get(url);

}
public static WebElement locators(String locatorType,String value) {
if (locatorType.equals("id")) {
    findElement = driver.findElement(By.id(value));
 return findElement;
}else if (locatorType.equals("name")) {
findElement = driver.findElement(By.name(value));
return findElement;

}else if (locatorType.equals("xpath")) {
 findElement = driver.findElement(By.xpath(value));
 return findElement;


}else if (locatorType.equals("link")) {
	WebElement findElement = driver.findElement(By.linkText(value));
	return findElement;

} 
else {
System.out.println("No Locators");
 return findElement;
}
}
public static List<WebElement> locators1(String locatorType,String value) {
	
		List<WebElement> findElements = driver.findElements(By.tagName(value));
		return findElements;
}




public static void textSend( String text,WebElement findElement) {
findElement.sendKeys(text);
}
public static void textSend2(String text) {
findElement.sendKeys(text);
}
public static void buttonClick(WebElement findElement) {
findElement.click();
}

public static void buttonClick2() {
findElement.click();
}

public static void textJavaScript(String user,WebElement element) {
JavascriptExecutor jk=(JavascriptExecutor)driver;
jk.executeScript("arguments[0].setAttribute('value','"+user+"')", element);
}
public static void buttonJavaScript(WebElement refElement) {
JavascriptExecutor jk=(JavascriptExecutor)driver;
jk.executeScript("arguments[0].click()", refElement);
}
public static void textJavaScript( WebElement refElement) {
JavascriptExecutor jk=(JavascriptExecutor)driver;
jk.executeScript("arguments[0].click()", refElement);
}
public static void textJavaScript2(String user,WebElement element) {
	JavascriptExecutor jk=(JavascriptExecutor)driver;
	jk.executeScript("arguments[0].setAttribute('value','"+user+"')", element);
}

public static void screenShot(String name) throws IOException {
TakesScreenshot tk=(TakesScreenshot)driver;
File sourceFile=tk.getScreenshotAs(OutputType.FILE);
File desnationFile=new File("H:\\ScreenShot"+name+".png");
FileUtils.copyFile(sourceFile, desnationFile);
}

public static void enter() throws AWTException {
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	//r.keyRelease(KeyEvent.VK_ENTER);
	
	
}
public static void act() {
	Actions act=new Actions(driver);
	act.doubleClick(findElement).perform();
	

}


}
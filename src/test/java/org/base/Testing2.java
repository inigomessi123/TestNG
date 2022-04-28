package org.base;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing2 extends BaseClassMethod {
	@Parameters({"browser"})
	@Test
	private void tc01(String browser) {
	if (browser.equalsIgnoreCase("ChromeBrowser")) {
	getDriver();
	launchUrl("https://www.flipkart.com/");
	} else if(browser.equalsIgnoreCase("EdgeBrowser")){
	getDriver();
	launchUrl("https://www.snapdeal.com/");

	}else {
	System.out.println("End");
	}
	}


}

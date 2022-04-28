package org.base;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class Testing4 extends BaseClassMethod {
	@Test(expectedExceptions=NoSuchElementException.class)
	private void tc01() {
		launchUrl("https://www.facebook.com/");
		locators("id","email").sendKeys("messi");

	}

}

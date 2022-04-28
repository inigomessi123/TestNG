package org.base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing6 {
	@Test(retryAnalyzer=Testing7.class)
	private void tc0() {
		String s="Java";
		System.out.println(s);
		Assert.assertTrue(false);
	}
	@Test
	private void tco1() {
		System.out.println("End");

	}

}

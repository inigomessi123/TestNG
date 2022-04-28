package org.base;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	@Test
	private void tc01() {
		String s="Jack";
		Assert.assertTrue(true);
		System.out.println(s);
	}
	@Test
	private void tc02() {
		String s="Jack";
		Assert.assertTrue(false);
		System.out.println(s);
	}
	
	@Test
	private void tc03() {
		String s="Java";
		boolean contains=s.contains("Java");
		Assert.assertEquals(contains, true);
		System.out.println(contains);
	}
	@Test
	private void tc04() {
		String s="Java";
		boolean contains=s.contains("z");
		Assert.assertEquals(contains, true);
		System.out.println(contains);
	}
	@Test
	private void tc05() {
		String s="Java";
		boolean contains=s.contains("z");
		boolean startsWith=s.startsWith("J");
		Assert.assertNotEquals(contains, startsWith);
		System.out.println(contains);
		
	}
	@Test
	private void tc06() {
		String s="Java";
		boolean contains=s.contains("z");
		boolean startsWith=s.startsWith("v");
		Assert.assertNotEquals(contains, startsWith);
		System.out.println(contains);
		
	}
	
	@Test
	private void tc07() {
		String s="Messi";
		boolean empty=s.isEmpty();
		SoftAssert assert1=new SoftAssert();
		assert1.assertAll();
		assert1.assertTrue(false);
		System.out.println(empty);
		
	}
	
}

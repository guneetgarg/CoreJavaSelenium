package com.factorytestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgTestClass {
	int a;
	int b;

	public TestNgTestClass(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Test
	public final void testEqual() {
		System.out.println("wwwwww");
		Assert.assertEquals(a, b);
		System.out.println("hhiiiiiiii");
	}
}
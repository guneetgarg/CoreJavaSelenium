package com.dummy;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Simple {

	@Test
	public void skipATest1() {
		throw new SkipException("Skipping - This is not ready for testing ");
	}

	@Test
	public void skipATest2() {
		throw new SkipException("Skipping - This is not ready for testing ");
	}

	@Test
	public void skipATest3() throws InterruptedException {
		Assert.fail();
		throw new SkipException("Skipping - This is not ready for testing ");
	}

	@Test
	public void skipATest4() {
		throw new SkipException("Skipping - This is not ready for testing ");
	}

	@Test
	public void Test3Passed() {
	}
}
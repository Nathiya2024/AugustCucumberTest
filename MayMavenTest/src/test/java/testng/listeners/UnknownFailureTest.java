package testng.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnknownFailureTest {

	@Test
	public void FailureTest() {
		System.out.println("Unknown Failure Test");
		Assert.assertTrue(true);
	}
}

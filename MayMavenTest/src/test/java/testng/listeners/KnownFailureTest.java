package testng.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KnownFailureTest {

	@Test(retryAnalyzer=RetryClass.class)
	public void KnownFailureTest() {
		System.out.println("Known Failure");
		Assert.assertTrue(false);
	}
}

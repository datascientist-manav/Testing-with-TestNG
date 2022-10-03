package testNGDemo_Day2;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class ListenersExample {
	
//	@Test
//	void runTests() {
//		System.out.println("Run this Test Case");
//	}
	
	@Test
	void failedTests() {
		System.out.println("Run this failed Test Case");
		AssertJUnit.assertTrue(false);		
	}

}

package testNGDemo_Day2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	@Override
	public void onTestSuccess(ITestResult result) {
	    System.out.println("The Test Case " +result.getName()+ " has been passed succesfully");
	  }
	
	
	public void onStart(ITestContext context) {
		System.out.println("The Test Case has been Started");
	  }
	
	public void onFinish(ITestContext context) {
		System.out.println("The Test Case has been completed");
	  }
	
	public void onTestFailure(ITestResult result) {
	    System.out.println("Print this MEssage when any test is getting failed");
	  }
	
	public void onTestSkipped(ITestResult result) {
	    System.out.println("");
	  }
}

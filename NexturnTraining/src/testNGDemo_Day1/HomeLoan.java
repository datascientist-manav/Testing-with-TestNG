package testNGDemo_Day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeLoan {
	
	@BeforeSuite
	void RunInTheVeryFirst() {
		System.out.println("I will be executing in The very first Position. No One Stop Me!!");
	}
	
	@AfterSuite
	void RunInTheVeryLast() {
		System.out.println("I will be executing in the last Position. No One Start Me!!");
	}
	
	@BeforeClass
	void runBeforeFirstMethodOnly() {
		System.out.println("I will be running before first method of this class only");
	}
	
	@AfterClass
	void runAfterLastMethodOnly() {
		System.out.println("I will be running before after Last method of this class only");
	}
	
	@Test
	void applyForLoan() {
		System.out.println("Apply for Home Loan");
	}
	
	@Test(groups={"smoke","regression"})
	void loanRejection() {
		System.out.println("Request for Home Loan has been rejected");
	}
	
	@Test
	void reapplyForLoan() {
		System.out.println("Re-Apply for Home Loan");
	}
	
	@Test(groups="smoke")
	void loanApproval() {
		System.out.println("Request for Home Loan has been Approved");
	}
	
	@Test
	void loanDisbursed() {
		System.out.println("Home Loan has been disbursed");
	}

}

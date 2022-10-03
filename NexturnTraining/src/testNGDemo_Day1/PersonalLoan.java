package testNGDemo_Day1;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PersonalLoan {
	
	@BeforeTest
	void RunBeforeThisTest() {
	System.out.println("I will be executing in the first of Personal loan");	
	}
	
	@AfterTest
	void RunAfterThisTest() {
	System.out.println("I will be executing in the Last of Personal loan");	
	}
	
	@Test(groups="smoke")
	void applyForLoan() {
		System.out.println("Apply for Personal Loan");
	}
	
	@Test(groups="regression")
	void loanRejection() {
		System.out.println("Request for Personal Loan has been rejected");
	}
	
	@Test(groups="smoke")
	void reapplyForLoan() {
		System.out.println("Re-Apply for Personal Loan");
	}
	
	@Test
	void loanApproval() {
		System.out.println("Request for Personal Loan has been Approved");
	}
	
	@Test
	void loanDisbursed() {
		System.out.println("Personal Loan has been disbursed");
	}

}

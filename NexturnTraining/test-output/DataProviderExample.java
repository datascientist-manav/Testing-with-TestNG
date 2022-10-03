package testNGDemo_Day2;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider = "setData", dataProviderClass = CustomizedDataprovider.class)
	void getData(int salary, int expenditure) {
		
		if(salary<25000)
		{
			System.out.println("User is not eligible for Loan at all with specified salary as: "+salary);
		}
		else
		{
			if(salary-expenditure>=25000)
			{
				System.out.println("User is eligible for Loan with specified salary as: "+salary+" and expenditure as: "+expenditure);
			}
			else {
				System.out.println("User has to reduce his/her expenditure as the specified expenditure="+expenditure+" is too much for salary="+salary);
			}
		}
	}
	
	
	@DataProvider
	Object[][] provideData() {
		Object[][] data = new Object[3][2];
		
		data[0][0] = 30000;
		data[0][1] = 10000;
		
		data[1][0] = 20000;
		data[1][1] = 5000;
		
		data[2][0] = 50000;
		data[2][1] = 3000;
				
		return data;
	}

}

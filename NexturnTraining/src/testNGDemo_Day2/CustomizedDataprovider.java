package testNGDemo_Day2;

import org.testng.annotations.DataProvider;

public class CustomizedDataprovider {
	
	@DataProvider
	Object[][] setData() {
		Object[][] data = new Object[3][2];
		
		data[0][0] = 28000;
		data[0][1] = 8000;
		
		data[1][0] = 18000;
		data[1][1] = 5000;
		
		data[2][0] = 56000;
		data[2][1] = 6000;
				
		return data;
	}

}

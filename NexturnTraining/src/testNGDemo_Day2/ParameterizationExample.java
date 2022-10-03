package testNGDemo_Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
	WebDriver driver;
	
//	@Parameters({"browser", "url"})
//	@Test
//	void takeParametersFromXml(String browserName, String urlName) {
//		System.out.println("The Browser name is : "+browserName);
//		System.out.println("The Url Name is: "+urlName);
//	}
	
	@Parameters({"browser", "url"})
	@Test
	void getTitle(String browserName, String urlName) {
		if(browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver and Jars\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Driver and Jars\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(urlName);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Parameters({"browser", "url"})
	@Test
	void maximizeWindow(String browserName, String urlName) {
		if(browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver and Jars\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Driver and Jars\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(urlName);
		driver.manage().window().maximize();
		driver.quit();
	}

}

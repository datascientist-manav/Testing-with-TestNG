package testNGDemo_Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample2 {
	
	WebDriver driver;
	
	@Parameters({"browser", "url"})
	@Test
	void OpenUrl2(String browserName, String urlName) {
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

}

package testNGDemo_Day1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotations {
	
	WebDriver driver;
	
	@BeforeGroups(groups={"regression"})
	public void runBeforeEveryregressionMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manav\\Downloads\\Testngproject\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		System.out.println("Browser has been opened");
	}
	
	@BeforeGroups(groups={"smoke"})
	public void runBeforeEverySmokeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver and Jars\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Browser has been opened");
	}
	
	@Test
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println("Title has been obtained and the title of the page is: "+ title);
		AssertJUnit.assertEquals(title, "OrangeHRM", "The Expected and Actual Title are not Matching");		
	}	
	
	@Test(groups="regression")
	public void loginButtonIsDisplayed() {
		WebElement loginButton = driver.findElement(By.xpath("//input[@name='Submit']"));
		AssertJUnit.assertTrue(loginButton.isDisplayed());
	}	
	
	
	@Test(groups="smoke")
	public void emptyPassword() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(3000);		
		WebElement emptyText = driver.findElement(By.xpath("//span[@id='spanMessage']"));
		AssertJUnit.assertEquals(emptyText.getText(), "Password cannot be empty" , "The expected value and Actual value is not matching");
	}	
	
	
	@Test
	public void emptyusername() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(3000);		
		WebElement emptyText = driver.findElement(By.xpath("//span[@id='spanMessage']"));
		AssertJUnit.assertEquals(emptyText.getText(), "Username cannot be empty" , "The expected value and Actual value is not matching");
	}
	
	@AfterGroups(groups={"smoke"})
	public void runAfterEverySmokeMethod() {
		driver.close();
		System.out.println("Close the Browser");
	}
	
	@AfterGroups(groups={"regression"})
	public void runAfterEveryRegressionMethod() {
		driver.close();
		System.out.println("Close the Browser");
	}
}

package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UrlTest {

	public String baseURL = "http://newtours.demoaut.com/";
	public WebDriver driver;
	
	@Test(priority=1)
	public void setBaseURL() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aluno\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//driver = new FirefoxDriver(); 
		driver = new ChromeDriver();
		driver.get(baseURL);
	}
	
	@Test(priority=2)
	public void verifyHomePageTitle() {
		String expectedTitle = "Welcome: Mercury Tours 2";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority=3)
	public void endSession() {
		driver.quit();
	}

	
}

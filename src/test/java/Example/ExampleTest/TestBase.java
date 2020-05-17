package Example.ExampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	
	WebDriver driver;
	
	@BeforeClass
	public void initilize() {
		 System.setProperty("webdriver.chrome.driver", "D:\\selenuim\\chromedriver.exe"); 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://bhopal-decorators.business.site");
	}
	
	@AfterClass
	public void quit() {
		driver.close();
	}

}

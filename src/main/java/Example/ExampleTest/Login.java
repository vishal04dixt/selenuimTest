package Example.ExampleTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Hello world!
 *
 */
public class Login {
	
	public WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public Sign loginZee() {
	  WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
	  if(element.isDisplayed()) {
		  element.click();
		  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	  }
	  
	  return new Sign(driver);
  }
}

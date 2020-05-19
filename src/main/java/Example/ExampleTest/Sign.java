package Example.ExampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class Sign {
	
	 WebDriver driver = null;
	
	public Sign(WebDriver driver) {
		this.driver = driver;
	}
	
	private boolean isSinginDisplay() {
		
		boolean result = false;
		boolean element = driver.findElement(By.xpath("//input[@id ='textField']")).isDisplayed();
		boolean element1 = driver.findElement(By.xpath("//img[@class = 'logoImg']")).isDisplayed();
		
		if(element && element1) {
			
			result = true;
			
		}
		return result;
		
	}
	
	public void toVerifySingnPageLoaded() {
		Assert.assertTrue(isSinginDisplay(), "SingnIn page not dispaly");
	}

}

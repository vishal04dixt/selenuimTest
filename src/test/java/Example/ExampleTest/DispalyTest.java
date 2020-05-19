package Example.ExampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DispalyTest extends TestBase{
	
	
	@Test
	public void elementDispaly() {
		WebElement element = driver.findElement(By.xpath("//div[@class='zeeLogo noSelect']/img[@title='ZEE5 Logo' ]"));
		
		String name = element.getAttribute("src");
		
	Assert.assertEquals("https://www.zee5.com/images/ZEE5_logo.png?ver=2.49.1",name);
	}
	
	@Test
	
	public void clickLoginButton() {
		Login login = new Login(driver);
		login.loginZee();
		
	}
	
	@Test
	public void toVerifySingninDispaly() {
		Sign sign = new Sign(driver);
		sign.toVerifySingnPageLoaded();
		
	}

}

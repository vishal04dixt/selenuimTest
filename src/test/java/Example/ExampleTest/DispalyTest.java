package Example.ExampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DispalyTest extends TestBase{
	
	
	@Test
	public void elementDispaly() {
		WebElement element = driver.findElement(By.xpath("//span[@class ='notification-content']"));
		
		String name = element.getText();
		
	Assert.assertEquals("Furniture Manufacturer and retailer in Bhopal",name);
	}

}

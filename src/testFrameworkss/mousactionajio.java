package testFrameworkss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class mousactionajio extends genericScript
{
	@Test
	public void runScript() throws InterruptedException
	{
		WebElement ed = driver.findElement(By.xpath("//span[.='KIDS']"));
		ac.moveToElement(ed).perform();
		Thread.sleep(2000);
	}
}

package testFrameworkss;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class childBrowser extends genericScript
{
	@Test
	public void runScript() throws AWTException, IOException
	{
		WebElement ele = driver.findElement(By.xpath("//a[.='Services']"));
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Set<String> all = driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<String>(all);
		String f=arr.get(1);
		driver.switchTo().window(f);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(-500, 0)");
		genericpho.getphoto(driver);
		String p=arr.get(0);
		driver.switchTo().window(p);
		driver.quit();
	}

}

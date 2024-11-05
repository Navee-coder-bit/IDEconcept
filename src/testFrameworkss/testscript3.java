package testFrameworkss;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class testscript3 extends genericScript
{
	@Test
	public void runScript()
	{
		driver.findElement(By.id("email")).sendKeys("Naveen");
		driver.findElement(By.id("pass")).sendKeys("naveen123");
		driver.findElement(By.name("login")).click();
	}
	@Test
	public void runscript1() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);
	}

}


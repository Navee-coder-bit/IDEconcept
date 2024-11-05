package testFrameworkss;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testscript4 extends genericScript
{
	@Test
	public void runScript2() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Naveen");
		driver.findElement(By.name("lastname")).sendKeys("Havaldar");
		driver.findElement(By.name("websubmit")).click();
	}
	@Test
	public void runScript3()
	{
		driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();
		
	}

}

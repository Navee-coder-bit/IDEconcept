package testFrameworkss;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class youtubesearch extends genericScript
{
	@Test
	public void runScript()  
	{
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("@Martin movie trailer");
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/fqLCas2sWW0/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLA67y-xbYJAm5hyGAMYqN7sCAOdiA']")).click();
      driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();
       Assert.fail();
		
	}

}

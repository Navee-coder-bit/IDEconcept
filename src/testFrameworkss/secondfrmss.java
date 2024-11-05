package testFrameworkss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class secondfrmss 
{
		@Test
		public void Demo1() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("naveensh535@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("shivakrupa");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@name='login']")).click();
			driver.quit();
		}
}

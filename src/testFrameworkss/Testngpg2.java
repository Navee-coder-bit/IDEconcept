package testFrameworkss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testngpg2 
{
	@Test
	public void Demo1() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/?utm_source=google&utm_medium=cpc&utm_campaign=GSB_Brand_August2019&gad_source=1&gclid=EAIaIQobChMI6uLd_qGSiAMVVBGDAx3qYS9MEAAYASAAEgKcB_D_BwE");
		Thread.sleep(3000);
		WebElement ed = driver.findElement(By.xpath("//span[.='KIDS']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(ed).perform();
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void Demo2() throws InterruptedException
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

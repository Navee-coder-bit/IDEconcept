package testFrameworkss;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class genericScript 
{
	public WebDriver driver;
	public Actions ac;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		driver = new ChromeDriver();
		ac = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeAppln() throws IOException
	{
		//genericpho.getphoto(driver);
		driver.close();
	}
	

}

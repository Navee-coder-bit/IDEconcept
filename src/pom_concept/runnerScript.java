package pom_concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class runnerScript 
{
	@Test
	public void loginCheck()
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		pomscript1 p = new pomscript1(driver);
		p.passData("Admin");
		p.passPwd("1234567");
		p.validClick();
		driver.close();
	}

}

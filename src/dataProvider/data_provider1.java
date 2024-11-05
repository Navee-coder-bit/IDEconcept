package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider1 {
	@Test(dataProvider = "createData1")
	public void test1(String un, String pwd) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
	}
	@DataProvider(name = "createData1")
	public Object[][] createData12()
	{
		return new Object[][]{
				{ "Naveen", "data1" },
				{ "Joker", "data2" },
				{ "King", "data3"},
				
};
	}
}


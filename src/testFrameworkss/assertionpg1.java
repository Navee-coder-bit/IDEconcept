package testFrameworkss;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionpg1 extends genericScript
{
	@Test
	public void runScript()
	{
		String URL = driver.getCurrentUrl();
		//System.out.println(URL);
		//Assert.assertEquals(URL, "https://www.youtube.com/");
		Assert.assertEquals(URL, "https://www.facebook.com/");
		System.out.println("Pass");
	}

}

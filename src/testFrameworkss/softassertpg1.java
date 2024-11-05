package testFrameworkss;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertpg1 extends genericScript
{
	@Test
	public void runScript()
	{
		String URL = driver.getCurrentUrl();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(URL, "https://www.facebook.com/");
		System.out.println("Pass");
		sa.assertAll();
	}	
}

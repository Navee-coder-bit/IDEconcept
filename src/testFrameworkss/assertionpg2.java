package testFrameworkss;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertionpg2 extends genericScript
{
	@Test
	public void runScript()
	{
	String URL = driver.getCurrentUrl();
	Assert.assertTrue(URL.contains("youtube"));
	}

}

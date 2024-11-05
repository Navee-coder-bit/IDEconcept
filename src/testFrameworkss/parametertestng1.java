package testFrameworkss;

import org.testng.Assert;
import org.testng.annotations.Test;

public class parametertestng1 
{
//	@Test(priority = 1)
//	public void test1()
//	{
//		System.out.println("Hello"); 								 Priority
//	}
//	@Test
//	public void test2()
//	{
//		System.out.println("World");
//	}
//
//}
	

//	@Test(invocationCount = 2, priority = 1)
//	public void test1()
//	{
//		System.out.println("Naveen");
//	}																invocationCount
//	@Test
//	public void test2()
//	{
//		System.out.println("Havaldar");
//	}
//}
	
	@Test(enabled = false)
	public void test1()
	{
		System.out.println("Shivakrupa");
	}																				//enabled
	@Test
	public void test2()
	{
		System.out.println("Kundapura");
	}
}
	
//	@Test
//	public void compose()
//	{
//		System.out.println("message composed");
//	}
//	@Test(dependsOnMethods = "compose")
//	public void sentItems()
//	{
//		System.out.println("message sent");						dependsOnMethods
//		Assert.fail();
//	}
//	@Test(dependsOnMethods = "sentItems")
//	public void trash()
//	{
//		System.out.println("message deleted");
//	}
//}
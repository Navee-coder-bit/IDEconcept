package pom_concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomscript1 
{
	//declaration
	@FindBy(id="email")
	private WebElement uName;
	@FindBy(name="pass")
	private WebElement pass1;
	@FindBy(name="login")
	private WebElement loginBtn;
	//initialization
	public pomscript1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void passData(String un)
	{
		uName.sendKeys(un);
	}
	public void passPwd(String pwd)
	{
		pass1.sendKeys(pwd);
	}
	public void validClick()
	{
		loginBtn.click();
	}

}

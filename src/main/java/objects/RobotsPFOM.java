package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RobotsPFOM 
{
	WebDriver driver;

	public RobotsPFOM(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//pre[@style='word-wrap: break-word; white-space: pre-wrap;']")
	WebElement robotsfile;
	
	
	public WebElement robotsFile()
	{
		return robotsfile;
	}
}

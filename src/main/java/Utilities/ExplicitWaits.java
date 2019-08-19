package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits 
{
WebDriver driver;	
	
	
	public static WebDriver dynamicWait(WebDriver driver, int time ,String path1)
	{
	WebDriverWait wait = new WebDriverWait(driver, time);
	WebElement element = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(path1)));

	boolean status = element.isDisplayed();

	if (status)
	{
		System.out.println("===== popup is visible======");
		//driver.findElement(By.xpath(path1)).click();
	} 
	else
	{
		System.out.println("===== popup is not visible======");
		
	}
	
	return driver;
	 
	}
	
	
}

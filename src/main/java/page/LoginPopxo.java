package page;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.AlertandPopups;
import base.driverClass;
import objects.LoginPFOM;

public class LoginPopxo {
	public WebDriver driver;

	public void ContinueWithFacebook(WebDriver driver) throws InterruptedException 
	{
		driver = driverClass.driverMethod();
		String cancelbutton = "//button[@id='wzrk-cancel']";
		String visiblepopup = "//div[@class='wzrk-alert wiz-show-animate']";
		AlertandPopups.cleverTapNotif(driver, 30, visiblepopup, cancelbutton);
		LoginPFOM obj = new LoginPFOM(driver);
		obj.sign_In_Hyperlink().click();
		obj.continuefacebook().click();
		Thread.sleep(500);
		String handle = driver.getWindowHandle();
		for (String winhandle : driver.getWindowHandles()) {
			driver.switchTo().window(winhandle);
		}
		obj.enterEmail().sendKeys("contribute@popxo.com");
		obj.enterPassword().sendKeys("knight-crabby-syntax");
		obj.Loginwithfb().click();
		//return obj;
	}

	// Continue with gmail
	@Test(enabled = false)
	public void ContinueWithGmail() throws InterruptedException {
		LoginPFOM obj = new LoginPFOM(driver);
		obj.sign_In_Hyperlink().click();
		obj.continue_With_Gmail().click();
		Thread.sleep(3000);
		String handle = driver.getWindowHandle();
		for (String winhandle : driver.getWindowHandles()) {
			driver.switchTo().window(winhandle);
		}
		obj.enterEmailForGmail().sendKeys("vandana.dhiman@popxo.com");
		obj.click_Next_Button_on_gmail().click();
		Thread.sleep(3000);
		obj.enterPasswordForGmail().sendKeys("nbhhbu");
		Thread.sleep(5000);
		obj.clickNextonPassword().click();
		obj.allowCleverTapPopUp();

	}

	// Continue with email
	@Test(enabled = false)
	public void ContinueWithEmail() throws InterruptedException {
		LoginPFOM obj = new LoginPFOM(driver);
		obj.sign_In_Hyperlink().click();
		obj.continue_With_Email().click();

		Thread.sleep(3000);
		String handle = driver.getWindowHandle();
		for (String winhandle : driver.getWindowHandles()) {
			driver.switchTo().window(winhandle);
		}

		Thread.sleep(3000);

		obj.enter_EmailID_For_Email().sendKeys("vandana.dhiman@popxo.com");

		obj.click_On_Next_On_Email().click();
		Thread.sleep(3000);

		obj.enter_Passwprd_For_Email().sendKeys("xyz");
		obj.click_On_Next().click();

	}

//	@Test(enabled=true)
//	public void cleverTapNotif()
//	{
//	 	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
//		LoginPFOM obj = new LoginPFOM(driver);		
//		Boolean a =obj.cleverTapPopUp().isEnabled();
//		if(a==true)
//			obj.allowCleverTapPopUp();
//
//	}

}

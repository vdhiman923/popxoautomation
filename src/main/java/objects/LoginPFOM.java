package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.driverClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPFOM {

	WebDriver driver;

	// Continue with facebook
	public LoginPFOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class='xo-sign-in-header']//a[@class='fb-non-header-btn-text']")
	WebElement clicksign_in;

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement Log_in;

	@FindBy(xpath = "//span[contains(text(),'Continue with Facebook')]")
	WebElement ContinueWithFB;
	public WebElement continuefacebook() {
		return ContinueWithFB;
	}

	public WebElement Loginwithfb() {
		return Log_in;
	}

	public WebElement enterEmail() {
		return email;
	}

	public WebElement enterPassword() {
		return password;
	}

	public WebElement sign_In_Hyperlink() {
		return clicksign_in;
	}



	// Continue with gmail

	@FindBy(xpath = "//div[@class='btn btn-primary btn-google-login']") //// div[@data-onsuccess='onSignIn']
	WebElement continue_with_gmail;

	@FindBy(xpath = "//input[@id='identifierId']")
	WebElement enter_email;

	@FindBy(xpath = "//input[@type='password']")
	WebElement enter_gmailpassword;

	@FindBy(xpath = "//content[@class='CwaK9']")
	WebElement click_next;

	@FindBy(xpath = "//div[@id='passwordNext']//content[@class='CwaK9']")
	WebElement clickPasswordNext;

	public WebElement continue_With_Gmail() {
		return continue_with_gmail;
	}

	public WebElement enterEmailForGmail() {
		return enter_email;
	}

	public WebElement click_Next_Button_on_gmail() {
		return click_next;
	}

	public WebElement enterPasswordForGmail() {
		return enter_gmailpassword;
	}

	public WebElement clickNextonPassword() {
		return clickPasswordNext;
	}

	// Continue with email

	// Continue with email on the login dilog
	@FindBy(xpath = "//div[@class='btn btn-email-link']")
	WebElement continue_with_email;

	// enter email on continue with email
	@FindBy(xpath = "//input[contains(text( ),'')]")
	WebElement enter_email_id_for_email;

	// click on next
	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement click_on_next_on_email;

	// enter password on email
	@FindBy(xpath = "//input[@type='password']")
	WebElement enter_passwprd_for_email;

	// click on next after entering password and email
	@FindBy(xpath = "//button[@type='submit']")
	WebElement click_on_next;

	public WebElement continue_With_Email() {
		return continue_with_email;
	}

	public WebElement enter_EmailID_For_Email() {
		return enter_email_id_for_email;
	}

	public WebElement click_On_Next_On_Email() {
		return click_on_next_on_email;
	}

	public WebElement enter_Passwprd_For_Email() {
		return enter_passwprd_for_email;
	}

	public WebElement click_On_Next() {
		return click_on_next;
	}

	// Allow Notifications from clevertap

	@FindBy(xpath = "//div[@class='wzrk-alert wiz-show-animate']")
	WebElement clevertap_popup_present;

	@FindBy(xpath = "//button[@id='wzrk-confirm']")
	WebElement allow_clevertap_notif;

	public WebElement cleverTapPopUp() {
		return clevertap_popup_present;
	}

	public WebElement allowCleverTapPopUp() {
		return allow_clevertap_notif;
	}

	// Click on links on Popxo Homepage

	// Click on MyFeed
	@FindBy(xpath = "//a[@class='brown-link header-link-active']")
	WebElement click_my_feed;

	// Click on Read
	@FindBy(xpath = "//div[@class='desktop-menu']//a[@href='/read']")
	WebElement click_read;

	// Click on Watch
	@FindBy(xpath = "//div[@class='desktop-menu']//a[@href='/watch']")
	WebElement click_watch;

	// Click on Shop
	@FindBy(xpath = "//a[@href='https://www.popxo.com/shop/' and @class='brown-link']")
	WebElement click_shop;

	// Click on Hangout
	@FindBy(xpath = "//div[@class='desktop-menu']//a[@href='/hangout']")
	WebElement click_hangout;

	// Click on Magazines
	@FindBy(xpath = "//span[contains(text(),'Magazine')]")
	WebElement click_magazines;

	public WebElement click_My_Feed() {
		return click_my_feed;
	}

	public WebElement click_Read() {
		return click_read;
	}

	public WebElement click_Watch() {
		return click_watch;
	}

	public WebElement click_Shop() {
		return click_shop;
	}

	public WebElement click_Hangout() {
		return click_hangout;
	}

	public WebElement click_Magazines() {
		return click_magazines;
	}

	// Language PopUp
//	@FindBy(xpath="//div[@class='close-btn-lang-popup sc-cIShpX fiLeqj']")

	@FindBy(xpath = "//div[@class='close-btn-lang-popup sc-cIShpX fiLeqj']")
	WebElement close_language_popup;

	public WebElement closeLanguagePopup() {
		return close_language_popup;
	}

	@FindBy(xpath = "//div[@id='hindi']")
	WebElement click_hindi;

	public WebElement click_Hindi() {
		return click_hindi;
	}

	// Notification popup

	@FindBy(xpath = "//div[@class='wzrk-alert wiz-show-animate']")
	WebElement close_notif_popup;

	// Deny notification button
	// @FindBy(xpath="//button[@id='wzrk-cancel']")

	@FindBy(xpath = "//button[@id='wzrk-confirm']")
	WebElement deny_notifications;

	public WebElement closeNotifPopup() {
		return close_notif_popup;
	}

	public WebElement denyNotifications() {
		return deny_notifications;
	}

	// Language drop down

	@FindBy(xpath = "//div[@class='desktop-only']//span[contains(text(),'English')]")
	WebElement lang_drop_down;

	public WebElement lang_Drop_Down() {
		return lang_drop_down;
	}

	// English
	@FindBy(xpath = "//div[@class='desktop-only']//a[contains(text(),'English')]")
	WebElement eng_drop_down;
	// Hindi
	@FindBy(xpath = "//div[@class='desktop-only']//a[contains(text(),'हिन्दी')]")
	WebElement hindi_drop_down;
	// Tamil
	@FindBy(xpath = "//div[@class='desktop-only']//a[contains(text(),'தமிழ்')]")
	WebElement tamil_drop_down;
	// Telugu
	@FindBy(xpath = "//div[@class='desktop-only']//a[contains(text(),'తెలుగు')]")
	WebElement telugu_drop_down;
	// Marathi
	@FindBy(xpath = "//div[@class='desktop-only']//a[contains(text(),'मराठी')]")
	WebElement marathi_drop_down;
	// Bangla
	@FindBy(xpath = "//div[@class='desktop-only']//a[contains(text(),'বাংলা')]")
	WebElement bangla_drop_down;

	public WebElement eng_Drop_Down() {
		return eng_drop_down;
	}

	public WebElement hindi_Drop_Down() {
		return hindi_drop_down;
	}

	public WebElement tamil_Drop_Down() {
		return tamil_drop_down;
	}

	public WebElement telugu_Drop_Down() {
		return telugu_drop_down;
	}

	public WebElement marathi_Drop_Down() {
		return marathi_drop_down;
	}

	public WebElement bangla_Drop_Down() {
		return bangla_drop_down;
	}
}




/**
 * LoginPopxo class full code
 */


/**
 public class LoginPopxo {
	
	public WebDriver driver;
	
	public LoginPopxo(WebDriver driver)
	{
	this.driver=driver;
	}
	LoginPFOM loginPFOMobj = new LoginPFOM(driver);

	String cancelbutton = "//button[@id='wzrk-cancel']";
	String visiblepopup = "//div[@class='wzrk-alert wiz-show-animate']";
	
	@Test(enabled=true)
	public WebDriver ContinueWithFacebookfromshop() throws InterruptedException 
	{
		driver.findElement(By.xpath("//span[contains(text(), 'Continue with Facebook')]")).click();
		Thread.sleep(2000);
		for (String winhandle : driver.getWindowHandles()) {
			driver.switchTo().window(winhandle);
		}
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("contribute@popxo.com");
		loginPFOMobj.enterPassword().sendKeys("knight-crabby-syntax");
		loginPFOMobj.Loginwithfb().click();
		return driver;
		
		//returning to the popxo tab 
		//Set<String> windowtab = driver.getWindowHandles();
		//List list = new ArrayList(windowtab);
		//String firstwindow=  list.get(0).toString();
		//driver.switchTo().window(firstwindow);
		//for (String winhandle : driver.getWindowHandles()) {
		//	driver.switchTo().window(winhandle);
		//}
			
		//driver.switchTo().window(firstwindow);
	}
	
	@Test(enabled=false)
	public void ContinueWithFacebook() throws InterruptedException 
	{
		driver = driverClass.driverMethod();
		//returning to the popxo tab 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Set<String> windowtab = driver.getWindowHandles();
		List list = new ArrayList(windowtab);
		String fwindow=  list.get(0).toString();
		driver.switchTo().window(fwindow);
		
		//	AlertandPopups.cleverTapNotif(driver, 30, visiblepopup, cancelbutton);
		LoginPFOM obj = new LoginPFOM(driver);
		obj.sign_In_Hyperlink().click();
		obj.continuefacebook().click();
		//Thread.sleep(3000);
		//String fbwindowhandle = driver.getWindowHandle();
		for (String winhandle : driver.getWindowHandles()) {
			driver.switchTo().window(winhandle);
		}
		
		obj.enterEmail().sendKeys("contribute@popxo.com");
		obj.enterPassword().sendKeys("knight-crabby-syntax");
		obj.Loginwithfb().click();
		
		driver.switchTo().window(fwindow);
		//return obj;
	}

	// Continue with gmail
	//@Test(enabled = false)
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

  **/


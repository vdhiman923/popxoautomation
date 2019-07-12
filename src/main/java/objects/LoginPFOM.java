package objects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPFOM
{
 
WebDriver driver;

	//Continue with facebook
	public LoginPFOM(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//li[@class='xo-sign-in-header']//a[@class='fb-non-header-btn-text']")
	WebElement clicksign_in;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Log_in;
	
	@FindBy(xpath="//span[@class='fb-non-btn-text']")
	WebElement ContinueWithFB;
	
	public WebElement Loginwithfb()
	{
	return Log_in;	
	}
	public WebElement enterEmail()
	{
	return email;
	}
	
	public WebElement enterPassword()
	{
	return password;
	}
	
	public WebElement sign_In_Hyperlink()
	{
	return clicksign_in;
	}
	
	public WebElement continuefacebook()
	{
	return ContinueWithFB;
	}
	
	//Continue with gmail
	
	@FindBy(xpath="//div[@class='btn btn-primary btn-google-login']") ////div[@data-onsuccess='onSignIn']
	WebElement continue_with_gmail;
	
	@FindBy(xpath="//input[@id='identifierId']")
	WebElement enter_email;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement enter_gmailpassword;
	
	@FindBy(xpath="//content[@class='CwaK9']")
	WebElement click_next;
	
	@FindBy(xpath="//div[@id='passwordNext']//content[@class='CwaK9']")
	WebElement clickPasswordNext;
	
	public WebElement continue_With_Gmail()
	{
		return continue_with_gmail;
	}
	public WebElement enterEmailForGmail()
	{
		return enter_email;
	}
	public WebElement click_Next_Button_on_gmail()
	{
		return click_next;
	}
	public WebElement enterPasswordForGmail()
	{
		return enter_gmailpassword;
	}
	
	public WebElement clickNextonPassword()
	{
		return clickPasswordNext;
	}

	//Continue with email

	//Continue with email on the login dilog
	@FindBy(xpath="//div[@class='btn btn-email-link']")
	WebElement continue_with_email;
	
	//enter email on continue with email
	@FindBy(xpath="//input[contains(text( ),'')]")
	WebElement enter_email_id_for_email;
	
	//click on next 
	@FindBy(xpath="//button[contains(text(),'Next')]")
	WebElement click_on_next_on_email;
	
	//enter password on email
	@FindBy(xpath="//input[@type='password']")
	WebElement enter_passwprd_for_email;
	
	//click on next after entering password and email
	@FindBy(xpath="//button[@type='submit']")
	WebElement click_on_next;
	
	
	public WebElement continue_With_Email()
	{
		return continue_with_email;
	}

	public WebElement enter_EmailID_For_Email()
	{
		return enter_email_id_for_email;
	}
	
	public WebElement click_On_Next_On_Email()
	{
		return click_on_next_on_email;
	}
	
	public WebElement enter_Passwprd_For_Email()
	{
		return  enter_passwprd_for_email;
	}
	
	public WebElement click_On_Next()
	{
		return click_on_next;
	}
	
	//Allow Notifications from clevertap
	
	@FindBy(xpath="//div[@class='wzrk-alert wiz-show-animate']")
	WebElement clevertap_popup_present;
	
	@FindBy(xpath="//button[@id='wzrk-confirm']")
	WebElement allow_clevertap_notif;
	

	public WebElement cleverTapPopUp()
	{
		return clevertap_popup_present;
	}

	public WebElement allowCleverTapPopUp()
	{
		return allow_clevertap_notif;
	}
	
	//Click on links on Popxo Homepage
	
	//Click on MyFeed
	@FindBy(xpath="//a[@class='brown-link header-link-active']")
	WebElement click_my_feed;
	
	//Click on Read
	@FindBy(xpath="//div[@class='desktop-menu']//a[@href='/read']")
	WebElement click_read;
	
	//Click on Watch
	@FindBy(xpath="//div[@class='desktop-menu']//a[@href='/watch']")
	WebElement click_watch;
	
	//Click on Shop
	@FindBy(xpath="//a[@href='https://www.popxo.com/shop/' and @class='brown-link']")
	WebElement click_shop;
	
	//Click on Hangout
	@FindBy(xpath="//div[@class='desktop-menu']//a[@href='/hangout']")
	WebElement click_hangout;
	
	//Click on Magazines
	@FindBy(xpath="//span[contains(text(),'Magazine')]")
	WebElement click_magazines;
	
	public WebElement click_My_Feed()
	{
		return click_my_feed;
	}
	
	public WebElement click_Read()
	{
		return click_read;
	}
	
	public WebElement click_Watch()
	{
		return click_watch;
	}
	public WebElement click_Shop()
	{
		return click_shop;
	}
	public WebElement click_Hangout()
	{
		return click_hangout;
	}
	public WebElement click_Magazines()
	{
		return click_magazines;
	}
	
	//Language PopUp
//	@FindBy(xpath="//div[@class='close-btn-lang-popup sc-cIShpX fiLeqj']")
	
	@FindBy(xpath="//div[@class='close-btn-lang-popup sc-cIShpX fiLeqj']")
	WebElement close_language_popup;
	
	public WebElement closeLanguagePopup()
	{
		return close_language_popup;
	}
	
	@FindBy(xpath="//div[@id='hindi']")
	WebElement click_hindi;
	
	public WebElement click_Hindi()
	{
		return click_hindi;
	}
	
	//Notification popup
	
	@FindBy(xpath="//div[@class='wzrk-alert wiz-show-animate']")
	WebElement close_notif_popup;
	
	//Deny notification button
	//@FindBy(xpath="//button[@id='wzrk-cancel']")
	
	@FindBy(xpath="//button[@id='wzrk-confirm']")
	WebElement deny_notifications;
	
	public WebElement closeNotifPopup()
	{
		return close_notif_popup;
	}
	
	public WebElement denyNotifications()
	{
		return deny_notifications;
	}
	
	//Language drop down
	
	@FindBy(xpath="//div[@class='desktop-only']//div[@class=\" lang-toggle\"]")
	WebElement lang_drop_down;
	
	public WebElement lang_Drop_Down()
	{
		return lang_drop_down;
	}

	//English
	@FindBy(xpath="//div[@class='desktop-only']//a[contains(text(),'English')]")
	WebElement eng_drop_down;
	//Hindi
	@FindBy(xpath="//div[@class='desktop-only']//a[contains(text(),'हिन्दी')]")
	WebElement hindi_drop_down;
	//Tamil
	@FindBy(xpath="//div[@class='desktop-only']//a[contains(text(),'தமிழ்')]")
	WebElement tamil_drop_down;
	//Telugu
	@FindBy(xpath="//div[@class='desktop-only']//a[contains(text(),'తెలుగు')]")
	WebElement telugu_drop_down;
	//Marathi
	@FindBy(xpath="//div[@class='desktop-only']//a[contains(text(),'मराठी')]")
	WebElement marathi_drop_down;
	//Bangla
	@FindBy(xpath="//div[@class='desktop-only']//a[contains(text(),'বাংলা')]")
	WebElement bangla_drop_down;

	public WebElement eng_Drop_Down()
	{
		return eng_drop_down;
	}
	public WebElement hindi_Drop_Down()
	{
		return hindi_drop_down;
	}
	public WebElement tamil_Drop_Down()
	{
		return tamil_drop_down;
	}
	public WebElement telugu_Drop_Down()
	{
		return telugu_drop_down;
	}
	public WebElement marathi_Drop_Down()
	{
		return marathi_drop_down;
	}
	public WebElement bangla_Drop_Down()
	{
		return bangla_drop_down;
	}
}





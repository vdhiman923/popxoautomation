package tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.ExplicitWaits;
import base.driverClass;
import objects.LoginPFOM;
import objects.ShopPFOM;
public class ShopTests extends driverClass 
{
WebDriver driver;
LoginPFOM loginPFOMobj ;
ShopPFOM shopWebElements ;// = new ShopPFOM(driver);

WebElement element;

public void getList(String listElement, int index)
{

	List<WebElement> listofclothItems = new ArrayList<WebElement>();
	listofclothItems=driver.findElements(By.xpath(listElement));
	listofclothItems.get(index).click();
}

public void getList(String listElement)
{

	List<WebElement> listofItems = new ArrayList<WebElement>();
	listofItems=driver.findElements(By.xpath(listElement));
	for(int i=0; i<listofItems.size() ;i++)
	{
		listofItems.get(i).click();
	}
}

public void getListCss(String listElement)
{

	List<WebElement> listofItems = new ArrayList<WebElement>();
	listofItems=driver.findElements(By.cssSelector(listElement));
	for(int i=0; i<listofItems.size() ;i++)
	{
		listofItems.get(i).click();
	}
}

public void getListCss(String listElement, int index)
{

	List<WebElement> listofItems = new ArrayList<WebElement>();
	listofItems=driver.findElements(By.cssSelector(listElement));
	for(int i=0; i<listofItems.size(); i++)
	{
		listofItems.get(i).click();
	}
}

//@BeforeMethod
public void beforemethod()
{
	driver= driverMethod();
	shopWebElements =new ShopPFOM(driver);
	loginPFOMobj = new LoginPFOM(driver);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}
@AfterMethod
public void aftermethod()
{
//driver.quit();
}

@Test(enabled=false)
public void positivePaymentflow() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Xpaths to pass in getList function
	String clothinglist ="//a[contains(text(),'Buy')]";
	String addresseslist = "//input[@name='address']";
	String deliverHereButton="//button[contains(text(),'Deliver Here')]";
	
	shopWebElements.getclickonshop().click();
	shopWebElements.getclickonClothing().click();
	Thread.sleep(3000);
	getList(clothinglist, 0);
	String popxositewindow=driver.getWindowHandle();
	shopWebElements.selectsizefromDropdown(1);
	shopWebElements.getClickonAddtoCart().click();
	shopWebElements.getclickCheckoutonCartPopup().click();
	Thread.sleep(2000);
	shopWebElements.getclickLoginafterCheckout().click();
	loginPFOMobj.continuefacebook().click();
	for (String facebookloginwindow : driver.getWindowHandles()) {
		driver.switchTo().window(facebookloginwindow);
	}
	//Login into popxo
	loginPFOMobj.enterEmail().sendKeys("contribute@popxo.com");
	loginPFOMobj.enterPassword().sendKeys("knight-crabby-syntax");
	loginPFOMobj.Loginwithfb().click();
	driver.switchTo().window(popxositewindow);
	Thread.sleep(2000);
	getList(addresseslist,0);
	getList(deliverHereButton,0);
	shopWebElements.getcontinueButtonOnOrderSummary().click();
	shopWebElements.getClickonOptionPayNowButton_CashOnDelivery().click();
	Thread.sleep(4000);
	if(driver.findElement(By.xpath("//button[contains(text(),'PAY NOW')]")).isDisplayed())
		shopWebElements.getClickonPayNowButton().click();
	else
		System.out.println("button not displayed");
	
	String successtext = shopWebElements.getSuccessText().getText();
	Assert.assertEquals(successtext, "Thank you for shopping with us!" , "Order has not been completed");

	
}


@Test(enabled=true)

public void chk() throws InterruptedException
{
	loginPFOMobj = new LoginPFOM(driver);
	System.setProperty("webdriver.chrome.driver", "/Users/umeshkaushik/Downloads/_Vandana/workspace/chromedriver");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.popxo.com/shop");
	String popxositewindow=driver.getWindowHandle();
	
	//Sign in button
	driver.findElement(By.xpath("(//a[text()='Sign In'])[2]")).click();
	//Login with fb
	loginPFOMobj = new LoginPFOM(driver);
	Thread.sleep(3000);
	loginPFOMobj.continuefacebook().click();
	for (String facebookloginwindow : driver.getWindowHandles()) {
		driver.switchTo().window(facebookloginwindow);
	}
	
	//Login into popxo
	loginPFOMobj.enterEmail().sendKeys("contribute@popxo.com");
	loginPFOMobj.enterPassword().sendKeys("knight-crabby-syntax");
	loginPFOMobj.Loginwithfb().click();
	driver.switchTo().window(popxositewindow);
	
	//Adding shop-token cookie
		Cookie name = new Cookie("shop-token", "plg02v06ovcm9iu75u0r4myolxwd7o7b");
		driver.manage().addCookie(name);
		Set<Cookie> cookiesList =  driver.manage().getCookies();
		for(Cookie getcookies :cookiesList) {
		    System.out.println(getcookies );
		}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='brown-link']")).click();
	Thread.sleep(6000);
	String cartitemcount= driver.findElement(By.xpath("//a[@class='brown-link header-link-active']/div")).getText();
	
	
	System.out.println("======="+cartitemcount);


}


@Test(enabled=true, priority=3)
public void clearCart() throws InterruptedException
{
	String cartItemsListRemove = "#cart-remove";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String clothinglist ="//a[contains(text(),'Buy')]";
	shopWebElements.getclickonshop().click();
	shopWebElements.getclickonClothing().click();
	Thread.sleep(3000);
	//Fetching the list of clothes
	getList(clothinglist, 0);
	shopWebElements.selectsizefromDropdown(1);
	shopWebElements.getClickonAddtoCart().click();
	shopWebElements.getClickonCartItem().click();
	Thread.sleep(2000);
	getListCss(cartItemsListRemove);
	String successText= driver.findElement(By.xpath("//div[text()='Your Cart is Empty']")).getText();
	Assert.assertEquals(successText, "Your Cart is Empty" , "Cart doesnt get empty");
}


@Test(enabled=true,priority=2)
public void AddCoupon() throws InterruptedException
{

	WebElement element;
	WebDriverWait wait = new WebDriverWait(driver, 50);
	String coupontext="//input[@value='POPXOFIRST']";
	String listofCoupons ="input[name=coupon]";
	String coupons= "//input[@name='coupon']";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String clothinglist ="//a[contains(text(),'Buy')]";
	shopWebElements.getclickonshop().click();
	shopWebElements.getclickonClothing().click();
	
	
	element = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(clothinglist)));
	boolean status = element.isDisplayed();
	if (status)
	{ System.out.println("===== cloths list is visible======");	
	getList(clothinglist, 0);	}
	else
	{ System.out.println("===== cloths list is not visible======");}
	
	//Fetching the list of clothes
	element = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(shopWebElements.clothsizeDropdownxpath)));
	shopWebElements.selectsizefromDropdown(3);
	 element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(shopWebElements.ClickonAddtoCartxpath)));
	shopWebElements.getClickonAddtoCart().click();
	element = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(shopWebElements.addedtoYourCartpopupxpath)));
	shopWebElements.getClickonCartItem().click();
	Thread.sleep(2000); 
	getList(coupons, 1);
	
	String exp = driver.findElement(By.xpath("//input[@value='POPXOFIRST']")).getAttribute("value");
	System.out.println(exp);
	Assert.assertEquals(exp , "POPXOFIRST" ,"POPXOFIRST coupon is not present");
	}


@Test(enabled=true,priority=1)
public void RemoveCoupon() throws InterruptedException
{
	
	String coupontext="//input[@value='POPXOFIRST']";
	String listofCoupons ="input[name=coupon]";
	String coupons= "//input[@name='coupon']";
	String removeCoupon ="#apply";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver, 50);
	String clothinglist ="//a[contains(text(),'Buy')]";
	shopWebElements.getclickonshop().click();
	shopWebElements.getclickonClothing().click();
	
	element = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(clothinglist)));
	boolean status = element.isDisplayed();
	if (status)
	{ System.out.println("===== cloths list is visible======");	
	getList(clothinglist, 0);	}
	else
	{ System.out.println("===== cloths list is not visible======");}
	
	//Fetching the list of clothes
	element = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(shopWebElements.clothsizeDropdownxpath)));
	shopWebElements.selectsizefromDropdown(3);
	 element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(shopWebElements.ClickonAddtoCartxpath)));
	shopWebElements.getClickonAddtoCart().click();
	element = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(shopWebElements.addedtoYourCartpopupxpath)));
	shopWebElements.getClickonCartItem().click();
	
	Thread.sleep(2000); 
	getList(coupons, 0);	
	Thread.sleep(3000);
	shopWebElements.getRemoveCoupon().click();
	Thread.sleep(2000);

	String CheckEmptyCouponPlaceHolder = driver.findElement(By.xpath("//input[@placeholder='Type coupon code here']")).getAttribute("value");
	Assert.assertEquals(CheckEmptyCouponPlaceHolder , "" , "Coupon has not been removed");
	}

}

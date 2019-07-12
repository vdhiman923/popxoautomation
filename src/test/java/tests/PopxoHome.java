package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objects.LoginPFOM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopxoHome 
{
	public WebDriver driver;
	LoginPFOM obj = new LoginPFOM(driver);
	
//-------------------BEFORE METHOD----------------------------
	@BeforeMethod
	public void before()
	{
		System.setProperty("webdriver.chrome.driver","/Users/vandana/eclipse-workspace/LearnSelenium/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);  
		driver.get("https://www.popxo.com/");
		//driver.manage().window().maximize();
		//obj.closeLanguagePopup().click();
	}
	
//-------------------AFTER METHOD----------------------------
	@AfterMethod
	public void after()
	{
		//driver.close();
	}
	
	
//-------------------FUNCTIONAL METHODS-----------------------
	
	@Test(enabled= false)
	public void langDropDown_eng()
	{	
		LoginPFOM obj = new LoginPFOM(driver);
		driver.findElement(By.xpath("//div[@class='close-btn-lang-popup sc-cIShpX fiLeqj']")).click();
		obj.lang_Drop_Down().click();
		obj.eng_Drop_Down().click();
		String english= "https://www.popxo.com/";
		Assert.assertEquals(english,driver.getCurrentUrl());
	}
	@Test(enabled=false)
	public void langDropDown_hindi()
	{	
		LoginPFOM obj = new LoginPFOM(driver);
		driver.findElement(By.xpath("//div[@class='close-btn-lang-popup sc-cIShpX fiLeqj']")).click();
		obj.lang_Drop_Down().click();
		obj.hindi_Drop_Down().click();
		
		String hindi="https://hindi.popxo.com/";
		Assert.assertEquals(hindi,driver.getCurrentUrl());

	}
	
	@Test(enabled=false)
	public void langDropDown_tamil()
	{	
		LoginPFOM obj = new LoginPFOM(driver);
		driver.findElement(By.xpath("//div[@class='close-btn-lang-popup sc-cIShpX fiLeqj']")).click();
		obj.lang_Drop_Down().click();
		obj.tamil_Drop_Down().click();
		
		String tamil="https://tamil.popxo.com/";
		Assert.assertEquals(tamil,driver.getCurrentUrl());
	}
	
	@Test(enabled=false)
	public void langDropDown_telugu()
	{	
		LoginPFOM obj = new LoginPFOM(driver);
		driver.findElement(By.xpath("//div[@class='close-btn-lang-popup sc-cIShpX fiLeqj']")).click();
		obj.lang_Drop_Down().click();
		obj.telugu_Drop_Down().click();
		String telugu="https://telugu.popxo.com/";
		Assert.assertEquals(telugu,driver.getCurrentUrl());
	}
	
	@Test(enabled=false)
	public void langDropDown_marathi()
	{	
		LoginPFOM obj = new LoginPFOM(driver);
		driver.findElement(By.xpath("//div[@class='close-btn-lang-popup sc-cIShpX fiLeqj']")).click();
		obj.lang_Drop_Down().click();
		obj.marathi_Drop_Down().click();
		String marathi="https://marathi.popxo.com/";
		Assert.assertEquals(marathi,driver.getCurrentUrl());
	}
	
	@Test(enabled=true)
	public void langDropDown_bangla()
	{	
		LoginPFOM obj = new LoginPFOM(driver);
		driver.findElement(By.xpath("//div[@class='close-btn-lang-popup sc-cIShpX fiLeqj']")).click();
		obj.lang_Drop_Down().click();
		obj.bangla_Drop_Down().click();
		String bangla="https://bangla.popxo.com/";
		Assert.assertEquals(bangla,driver.getCurrentUrl());
	}

 //Language popup clicks on each language

	@Test(enabled=false) 
	public void checkEnglish()
	{
		String english= "https://www.popxo.com/";
		driver.findElement(By.xpath("//div[@id='english']")).click();
		Assert.assertEquals(english,driver.getCurrentUrl());
	}
	
	@Test(enabled=false) 
	public void checkHindi()
	{ 
		String hindi="https://hindi.popxo.com/";
		driver.findElement(By.xpath("//div[@id='hindi']")).click();
		Assert.assertEquals(hindi,driver.getCurrentUrl());
	
	}

	@Test(enabled=false) 
	public void checkTamil()
	{
		String tamil="https://tamil.popxo.com/";
		driver.findElement(By.xpath("//div[@id='tamil']")).click();
		Assert.assertEquals(tamil,driver.getCurrentUrl());
	}

	@Test(enabled=false) 
	public void checkTelugu()
	{
		String telugu="https://telugu.popxo.com/";
		driver.findElement(By.xpath("//div[@id='telugu']")).click();
		Assert.assertEquals(telugu,driver.getCurrentUrl());
	}
	
	@Test(enabled=false) 
	public void checkMarathi()
	{
		String marathi="https://marathi.popxo.com/";
		driver.findElement(By.xpath("//div[@id='marathi']")).click();
		Assert.assertEquals(marathi,driver.getCurrentUrl());
	}
	
	@Test(enabled=false) 
	public void checkBangla()
	{
		String bangla="https://bangla.popxo.com/";
		driver.findElement(By.xpath("//div[@id='bangla']")).click();
		Assert.assertEquals(bangla,driver.getCurrentUrl());
	}

// -------------------HOME PAGE HYPERLINKS--------------------------------
	
	@Test(enabled=false)
	public void getFeed()
	{
		LoginPFOM obj = new LoginPFOM(driver);
		
		String Actual_Url="https://www.popxo.com/";
		obj.closeLanguagePopup();
		obj.click_My_Feed().click();
		String url=driver.getCurrentUrl();
		//System.out.println("URL="+driver.getCurrentUrl());
		Assert.assertEquals(Actual_Url, driver.getCurrentUrl());
		System.out.println("Url part has been executed-- feed Results are below:--");
		
	}
	
	@Test(enabled=false) 
	public void read()
	{
		LoginPFOM obj = new LoginPFOM(driver);
		
		String Actual_Url="https://www.popxo.com/read";
		obj.click_Read().isEnabled();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(Actual_Url, driver.getCurrentUrl());
		System.out.println("Url part has been executed-- read Results are below:--");

	}
	
	@Test(enabled=false) 
	public void watch()
	{
		LoginPFOM obj = new LoginPFOM(driver);
		String Actual_Url="https://www.popxo.com/watch";
		obj.click_Watch().click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(Actual_Url, driver.getCurrentUrl());
		System.out.println("Url part has been executed-- watch Results are below:--");

	}
	
	@Test(enabled=false) 	
	public void shop()
	{

		LoginPFOM obj = new LoginPFOM(driver);
		String Actual_Url="https://www.popxo.com/shop";
		obj.click_Shop().click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(Actual_Url, driver.getCurrentUrl());
		System.out.println("Url part has been executed-- shop Results are below:--");

	}
	
	@Test(enabled=false) 
	public void Hangout()
	{

		LoginPFOM obj = new LoginPFOM(driver);
		String Actual_Url="https://www.popxo.com/hangout";
		obj.click_Hangout().click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(Actual_Url, driver.getCurrentUrl());
		System.out.println("Url part has been executed-- Hangout Results are below:--");

	}
	
	@Test(enabled=false) 
	public void magazine()
	{

		LoginPFOM obj = new LoginPFOM(driver);
		String Actual_Url="https://www.popxo.com/magazine";
		obj.click_Magazines().click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(Actual_Url, driver.getCurrentUrl());
		System.out.println("Url part has been executed-- magazine results are below:--");

	}
	
}

package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart 
{
WebDriver driver;
String mobnum = "//div[contains(@class,'_39M2dM')]//input[@type='text']";
String password="//input[starts-with(@class,'_2zrpKA _3')]";
String login="//button[starts-with(@class,'_2AkmmA _1LctnI _7')]";

//Click on electronics
String clickelectronics= "//span[contains(text(),'Electronics')]";
//click on mobile covers
String mobilecases = "//a[contains(text(),'Mobile Cases')]";
//Clicking on first element  
String firstelement="//div[contains(@data-id,'ACC')]//a[@title='Flipkart SmartBuy Back Cover for Realme C2']";

String addtocart="//button[contains(@class,'_2AkmmA _2Npkh4 _2MWPVK')]";
String clickoncarticon="//span[contains(text(),'Cart')]";

String elementsincart= "//div[@class='gdUKd9' and contains(text(),'Remove')]";

public void login()
	{
	System.setProperty("webdriver.chrome.driver", "/Users/vandana/eclipse-workspace/LearnSelenium/chromedriver");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	String baseUrl = "https://www.flipkart.com";
	driver.manage().window().maximize();
	driver.get(baseUrl);
	driver.findElement(By.xpath(mobnum)).sendKeys("8800108869");
	driver.findElement(By.xpath(password)).sendKeys("Vandy@2018");
	driver.findElement(By.xpath(login)).click();
	}
	
public void remove()
{
	driver.findElement(By.xpath(clickoncarticon)).click();
	List<WebElement> cartitemslist = driver.findElements(By.xpath(elementsincart));
   System.out.println(cartitemslist.size());

    
}

@AfterMethod
public void close()
{
//driver.quit();	
}

	@Test(enabled=true)
	public void gotosubcategory() throws InterruptedException
	{
		login();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		driver.findElement(By.xpath(clickelectronics)).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath(mobilecases)).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath(firstelement)).click();
		//Thread.sleep(4000);
		Set<String> handle = driver.getWindowHandles();
		List list = new ArrayList(handle);
		String fwindow=  list.get(1).toString();
		driver.switchTo().window(fwindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath(addtocart)).click();
	}
	
	@Test(enabled=false)
	public void removeItem() throws InterruptedException
	{
		login();
		Thread.sleep(2000);
		driver.findElement(By.xpath(clickoncarticon)).click();
		List<WebElement> cartitemslist = driver.findElements(By.xpath(elementsincart));
	   System.out.println(cartitemslist.size());

	}

}

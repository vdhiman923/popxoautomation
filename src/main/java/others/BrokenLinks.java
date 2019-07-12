package others;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.awt.Window;
import java.io.IOException;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objects.LoginPFOM;

import org.openqa.selenium.JavascriptExecutor;

public class BrokenLinks 

{
	
	String url=  "https://www.popxo.com/shop/"; //"https://www.popxo.com"; "https://dev.luxeva.com/"
	public WebDriver driver ;
	Base baseObject;
	
	@BeforeMethod
	public void before()
	{
		//String url="https://www.popxo.com"; 
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver","/Users/vandana/eclipse-workspace/LearnSelenium/chromedriver");
		//driver = new ChromeDriver();
		
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);  
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void after()
	{
		//driver.close();
	}
	
	
	
	// Adding multiple items
	
	@Test(enabled = false)
	public void addItems() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[contains(text(),\"Clothing\")]")).click();

		List<WebElement> list1 =(List<WebElement>) baseObject.findList(driver);
		list1.get(0).click();
		System.out.println("Oth elem="+list1.get(0).isDisplayed());
		list1.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),\"Add to Cart\")]")).click();
		driver.navigate().back();
		driver.navigate().back();
		//driver.navigate().refresh();
		
		
		List<WebElement> list2 =(List<WebElement>) baseObject.findList(driver);
		Thread.sleep(3000);
			list2.get(1).click();
			System.out.println("1st elem="+list2.get(1).isDisplayed());
			list2.get(1).click();
			driver.findElement(By.xpath("//span[contains(text(),\"Add to Cart\")]")).click();
	}
		
	@Test(enabled= true)
	public void list1() throws IOException,MalformedURLException
	{
		
		List<WebElement> elemlist = driver.findElements(By.tagName("a"));
		System.out.println("total size of element of elemsize="+elemlist.size());
		
		List finallist = new ArrayList();
		for(WebElement element: elemlist)
		{
			
			if(element.getAttribute("href")!=null)
				finallist.add(element.getAttribute("href"));
		
		}
		System.out.println("total size of element finallist ="+finallist.size());
		System.out.println("Elements finallist="+finallist);
		
		
//---------------------Checking if the links are working or not--------------------------//
		
		
		finallist.addAll(elemlist);
		Iterator <String>  iteratorobj = finallist.iterator();
		//while(iteratorobj.hasNext())
		for(int i=0; i<finallist.size();i++)
		{
		String listurl= iteratorobj.next();
		URL urlobj = new URL(listurl);
		HttpURLConnection connection = (HttpURLConnection) urlobj.openConnection();
		//if(connection.getResponseCode()!=200)
		System.out.println("message="+i+" "+urlobj+"\t"+connection.getResponseMessage()+"\t"+connection.getResponseCode());
		}
		driver.close();
		}
	
//---------------------CANONICAL LINKS -------------------//
	
	
	@Test(enabled=false)
	public void canonical_links() throws InterruptedException
	{
		List <WebElement> listadd = null;
		LoginPFOM obj = new LoginPFOM(driver);
		
		obj.closeLanguagePopup().click();;
		obj.click_Read().click();
		Thread.sleep(1000);
		List<WebElement> element=driver.findElements(By.xpath("//div[@class='col-xs-12 col-sm-6 col-md-6']"));
		System.out.println("list size="+element.size());
		element.get(0).click();
		String storyUrl= driver.getCurrentUrl();
		System.out.println("Story url 1="+driver.getCurrentUrl());
		Thread.sleep(1000);
		String canonicalUrl=driver.findElement(By.xpath("//link[@rel='canonical']")).getAttribute("href");
		System.out.println("canonical url 1="+canonicalUrl);
		Assert.assertEquals(storyUrl,canonicalUrl);
		//Thread.sleep(1000);
	}
		
	@Test(enabled=false)
	public void canonical_links1() throws InterruptedException
	{
		List <WebElement> listadd = null;
		LoginPFOM obj = new LoginPFOM(driver);
		
		obj.closeLanguagePopup().click();
		obj.click_Read().click();
		Thread.sleep(1000);
		List<WebElement> element=driver.findElements(By.xpath("//div[@class='col-xs-12 col-sm-6 col-md-6']"));
		System.out.println("list size="+element.size());
		element.get(1).click();
		String storyUrl= driver.getCurrentUrl();
		System.out.println("Story url 2="+driver.getCurrentUrl());
		Thread.sleep(1000);
		String canonicalUrl=driver.findElement(By.xpath("//link[@rel='canonical']")).getAttribute("href");
		System.out.println("canonical url 2="+canonicalUrl);
		Assert.assertEquals(storyUrl,canonicalUrl);
		//Thread.sleep(1000);
	}	
	
	@Test(enabled=false)
	public void canonical_links2() throws InterruptedException
	{
		List <WebElement> listadd = null;
		LoginPFOM obj = new LoginPFOM(driver);
		
		obj.closeLanguagePopup().click();;
		obj.click_Read().click();
		Thread.sleep(1000);
		List<WebElement> element=driver.findElements(By.xpath("//div[@class='col-xs-12 col-sm-6 col-md-6']"));
		System.out.println("list size="+element.size());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		element.get(2).click();
		String storyUrl= driver.getCurrentUrl();
		System.out.println("Story url 3="+driver.getCurrentUrl());
		Thread.sleep(1500);
		String canonicalUrl=driver.findElement(By.xpath("//link[@rel='canonical']")).getAttribute("href");
		System.out.println("canonical url 3="+canonicalUrl);
		Assert.assertEquals(storyUrl,canonicalUrl);
		//Thread.sleep(1000);
	}
	
	@Test(enabled=false)
	public void canonical_links3() throws InterruptedException
	{
		List <WebElement> listadd = null;
		LoginPFOM obj = new LoginPFOM(driver);
		
		obj.closeLanguagePopup().click();;
		obj.click_Read().click();
		Thread.sleep(1000);
		List<WebElement> element=driver.findElements(By.xpath("//div[@class='col-xs-12 col-sm-6 col-md-6']"));
		System.out.println("list size="+element.size());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		element.get(3).click();
		String storyUrl= driver.getCurrentUrl();
		System.out.println("Story url 4="+driver.getCurrentUrl());
		Thread.sleep(1500);
		String canonicalUrl=driver.findElement(By.xpath("//link[@rel='canonical']")).getAttribute("href");
		System.out.println("canonical url 4="+canonicalUrl);
		Assert.assertEquals(storyUrl,canonicalUrl);
		//Thread.sleep(1000);
	}
	
	
	
}

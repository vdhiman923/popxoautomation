package tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import config.*;
import Utilities.*;
import base.driverClass;
import objects.CategoryPFOM;
import objects.LoginPFOM;
import others.Base;
import page.LoginPopxo;

public class CategoryTests extends driverClass {
	WebDriver driver;
	LoginPopxo login, login1;
	LoginPFOM lpfom;
	CategoryPFOM categ;

	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = driverMethod();
		categ = new CategoryPFOM(driver);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		String cancelbutton = "//button[@id='wzrk-cancel']";
		String visiblepopup = "//div[@class='wzrk-alert wiz-show-animate']";
		AlertandPopups.cleverTapNotif(driver, 40, visiblepopup, cancelbutton);
		ExcelUtil.setExcelFile();
		
	}

	 @AfterMethod
	public void close() {
		driver.quit();
	}

	/**
	 * click on categories(Fashion , lifestyle,...Entertainment)
	 */

	@Test(enabled = false, priority = 1)
	public void clickonFashiontest() throws InterruptedException {
		categ.getfashion().click();
		System.out.println(driver.getCurrentUrl());
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.popxo.com/fashion");
	}

	@Test(enabled = false, priority = 2)
	public void clickonBeautytest() throws InterruptedException {
		categ.getbeauty().click();
		System.out.println(driver.getCurrentUrl());

	}

	@Test(enabled = false, priority = 3)
	public void clickonLifestyletest() throws InterruptedException {
		categ.getlifestyle().click();
		System.out.println(driver.getCurrentUrl());

	}

	@Test(enabled = false, priority = 4)
	public void clickonWeddingtest() throws InterruptedException {

		categ.getwedding().click();
		System.out.println(driver.getCurrentUrl());

	}

	@Test(enabled = false, priority = 5)
	public void clickonWellnesstest() throws InterruptedException {

		categ.getwellness().click();
		System.out.println(driver.getCurrentUrl());

	}

	@Test(enabled = false, priority = 6)
	public void clickonEntertainmenttest() throws InterruptedException {

		categ.getentertainment().click();
		System.out.println(driver.getCurrentUrl());

	}

	// Handle language dropdown
	@Test(enabled = false)
	public void languagedropdown() {
		WebElement dropdownelem = driver
				.findElement(By.xpath("//div[@class='desktop-only']//div[@class='sc-kAzzGY gtmfUO']"));
		dropdownelem.click();
		Select langdropdown = new Select(dropdownelem);
		langdropdown.selectByVisibleText("हिन्दी");

	}

	// Open new tab in same window
	@Test(enabled = false)
	public void openNewTab() throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/vandana/eclipse-workspace/LearnSelenium/chromedriver");
		driver = new ChromeDriver();
		
		String baseUrl = "https://www.google.com";
		driver.get(baseUrl);
		
		//It will open new tab in the current window
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open('', ' ')");
		
		//Switching to the first tab
		Set<String> handle = driver.getWindowHandles();
		List list = new ArrayList(handle);
		String fwindow=  list.get(0).toString();
		driver.switchTo().window(fwindow);
		
	}

	/**
	 * 1.Fashion category tests
	 * @throws Exception 
	 * 
	 * @throws InterruptedException
	 */
	// Click on a single subcategory
	@Test(enabled = true )//,dataProvider = "Subcategorieslist", dataProviderClass = Dataprovider.class)
	public void clickon1subcategory1111() throws Exception 
	{
		
		Set<String> handle = driver.getWindowHandles();
		List list = new ArrayList(handle);
		String fwindow=  list.get(0).toString();
		driver.switchTo().window(fwindow);
		categ.getfashion().click();
		
		String val = ExcelUtil.getCellData(3,1);
		categ.clicksubcategoryFashion(val);
		System.out.println("val::"+val);
		String urlval = ExcelUtil.getCellData(3,2);
		System.out.println("urlval::"+urlval);
		System.out.println("current url="+driver.getCurrentUrl());

	Assert.assertEquals(driver.getCurrentUrl(), "https://www.popxo.com/"+urlval, "url is diff");
//	
 }
	
	// Fetching all subcategories of the fashion category.
	@Test(enabled = false)
	public void getFashionSubcategories() throws InterruptedException {
		categ.getfashion().click();
		List<WebElement> elem = categ.getsubcategoriesFashionlist();
		System.out.println("Fashion Subcategories:--");
		for (int i = 0; i < elem.size(); i++) {
			System.out.println(elem.get(i).getText());
		}
		System.out.println("Count of subcategories=" + elem.size());
	}
	/**
	 * 2.Beauty category-sub categories tests
	 * 
	 * @throws InterruptedException
	 */

	@Test(enabled = false)
	public void getBeautySubcategories() throws InterruptedException {
		categ.getbeauty().click();
		Thread.sleep(5000);
		List<WebElement> elem = driver.findElements(
				By.xpath("//ul[@class=\"sc-eTpRJs leua\"]//*[@class=\"sc-dxZgTM kDIWrp\"]//descendant::a"));
		System.out.println("Beauty Subcategories:--");
		for (int i = 0; i < elem.size(); i++) {
			System.out.println(elem.get(i).getText());
		}
	}

	/**
	 * 3.Lifestyle category - sub categories tests
	 * 
	 * @throws InterruptedException
	 */

	@Test(enabled = false)
	public void getLifestyleSubcategories() throws InterruptedException {
		categ.getlifestyle().click();
		Thread.sleep(5000);
		List<WebElement> elem = driver.findElements(
				By.xpath("//ul[@class=\"sc-eTpRJs leua\"]//*[@class=\"sc-dxZgTM kDIWrp\"]//descendant::a"));
		System.out.println("Lifestyle Subcategories:--");
		for (int i = 0; i < elem.size(); i++) {
			System.out.println(elem.get(i).getText());
		}
	}

	/**
	 * 4.Wedding category- sub categories tests
	 * 
	 * @throws InterruptedException
	 */

	@Test(enabled = false)
	public void getWeddingSubcategories() throws InterruptedException {
		categ.getwedding().click();
		Thread.sleep(5000);
		List<WebElement> elem = driver.findElements(
				By.xpath("//ul[@class=\"sc-eTpRJs leua\"]//*[@class=\"sc-dxZgTM kDIWrp\"]//descendant::a"));
		System.out.println("Wedding Subcategories:--");
		for (int i = 0; i < elem.size(); i++) {
			System.out.println(elem.get(i).getText());
		}
	}

	/**
	 * 5.Wellness category- sub categories tests
	 * 
	 * @throws InterruptedException
	 */

	@Test(enabled = false)
	public void getWellnessSubcategories() throws InterruptedException {
		categ.getwellness().click();
		Thread.sleep(5000);
		List<WebElement> elem = driver.findElements(
				By.xpath("//ul[@class=\"sc-eTpRJs leua\"]//*[@class=\"sc-dxZgTM kDIWrp\"]//descendant::a"));
		System.out.println("Wellness Subcategories:--");
		for (int i = 0; i < elem.size(); i++) {
			System.out.println(elem.get(i).getText());
		}
	}

	/**
	 * 6.Entertainment category- sub categories tests
	 * 
	 * @throws InterruptedException
	 */

	@Test(enabled = false)
	public void getEntertainmentSubcategories() throws InterruptedException {
		categ.getentertainment().click();
		Thread.sleep(5000);
		List<WebElement> elem = driver.findElements(
				By.xpath("//ul[@class=\"sc-eTpRJs leua\"]//*[@class=\"sc-dxZgTM kDIWrp\"]//descendant::a"));

		System.out.println("Entertainment Subcategories:--");
		for (int i = 0; i < elem.size(); i++) {
			System.out.println(elem.get(i).getText());
		}
	}
}

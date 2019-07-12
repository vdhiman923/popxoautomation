package others;

import java.awt.List;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeVerification
{
	String url="https://www.popxo.com"; 
	public WebDriver driver ;
	
	@BeforeMethod
	public void before()
	{
		String url="https://www.gaana.com"; 
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver","/Users/vandana/eclipse-workspace/LearnSelenium/chromedriver");
		//driver = new ChromeDriver();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);  
		driver.get(url);
		
	}
	
//	@Test(enabled=true)
//	public void time()
//	{
//		String msg=	driver.findElement(By.xpath("//div[@class=\"text-gray fs-16 w-600\"]")).getText();
//		System.out.println("time ="+msg);
//		//("dd-MMM-yy hh.mm.ss.S aa")
//		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm aa");
//		String formattedDate = dateFormat.format(new Date()).toString();
//		System.out.println(formattedDate);
//		//Date date = new Date();
//		//System.out.println("current timestamp="+dateFormat);
//		if (msg == formattedDate)
//			System.out.println("Pass");
//		else
//			System.out.println("fail");
//		driver.close();
//	}

	@Test(enabled=true)
	public void fetchLabels() throws InterruptedException
	{
		
//		java.util.List<WebElement> elem = driver.findElements(By.xpath("//ul[@class="clearfix carousel_ul artworkload"]"));
//		System.out.println(driver.findElement(By.xpath("//ul[@class=\"clearfix carousel_ul artworkload\"]")).getAttribute("title"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);				
		driver.findElement(By.xpath("//a[@class=\"popup-close\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);				
		driver.findElement(By.xpath("//a[@class=\"popup-close\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);				

		java.util.List<WebElement> elemlist = driver.findElements(By.xpath("//div[@class=\"card_layout\"]//ul[@class=\"clearfix carousel_ul artworkload\"]"));
		System.out.println("total size of element of elemsize="+elemlist.size());
		for(int i =0; i<elemlist.size(); i++)
		{
		System.out.println("i element title="+elemlist.get(i).getAttribute("title"));
		//elemlist.get(i).click();
		}
		
		//driver.close();
	}
}



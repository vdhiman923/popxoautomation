package others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuandSubmenu 
{

	public WebDriver driver ;
	@BeforeMethod
	public void before()
	{
		System.setProperty("webdriver.chrome.driver","/Users/vandana/eclipse-workspace/LearnSelenium/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.popxo.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void submenu() throws InterruptedException
	{
		WebDriver wait;
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Deny')]")).click();
		
		
		
		//Actions action = new Actions(driver);
		driver.findElement(By.xpath("//span[contains(text(),'Magazine')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Fashion Issue')]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//span[contains(text(),'Magazine')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Beauty Issue')]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[contains(text(),'Magazine')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Wedding Issue')]")).click();
		driver.navigate().back();
		
		
	}
}

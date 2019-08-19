package base;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class driverClass {
	
public static WebDriver driverMethod()
{
	
WebDriver driver;

System.setProperty("webdriver.chrome.driver", "/Users/umeshkaushik/Downloads/_Vandana/workspace/chromedriver");
ChromeOptions options = new ChromeOptions();
//options.addExtensions(new File("/Users/vandana/eclipse-workspace/POPXo/AdBlock_v3.48.0.crx"));
options.addArguments("--disable-notifications");
//options.addArguments("--no-sandbox");

//DesiredCapabilities capabilities = new DesiredCapabilities();
//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://dev4.popxo.com");
return  driver;

	
}
}

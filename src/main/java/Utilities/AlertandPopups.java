package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertandPopups {
	// Allow Notifications from clevertap
	@FindBy(xpath = "//div[@class='wzrk-alert wiz-show-animate']")
	static WebElement clevertap_popup_present;

	@FindBy(xpath = "//button[@id='wzrk-confirm']")
	static WebElement allow_clevertap_notif;

	//div[@class='wzrk-alert wiz-show-animate']" -1
	
	//button[@id='wzrk-cancel']-2
	public static void cleverTapNotif(WebDriver driver, int time , String path1, String path2) {

		// AlertandPopups.cleverTapNotif(driver);
		WebDriverWait wait = new WebDriverWait(driver, time);
		WebElement ele = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(path1)));

		boolean status = ele.isDisplayed();

		if (status) {
			System.out.println("===== popup is visible======");
			driver.findElement(By.xpath(path2)).click();
		} else {
			System.out.println("===== popup is not visible======");
		}
	}
}

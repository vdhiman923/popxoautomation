package others;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base
{

	public WebElement findList(WebDriver d)
	{
//		d.findElement(By.xpath("//span[contains(text(),\"Clothing\")]")).click();
		List<WebElement> list = d.findElements(By.xpath("//li[@class=\"item product product-item\"]"));
		System.out.println("list size ="+list.size());
		return (WebElement) list;
	
	}
	
	

}

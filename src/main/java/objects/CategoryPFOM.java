package objects;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.Dataprovider;

public class CategoryPFOM {

	WebDriver driver;
	
	public CategoryPFOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/**
	 * Category Carousal
	 */
	
	@FindBy(xpath="//*[@class='slick-slide slick-cloned']/div/div/div[@title]")
	WebElement categorycarousal;
	
	public WebElement getCategorycarousal(){return categorycarousal;}
	
	/**
	 * All categories(fashion, beauty, lifestyle etc) link
	 */

	@FindBy(xpath = "//div[@class='desktop-header']//a[@href='/fashion']")
	WebElement fashion;
	@FindBy(xpath = "//a[@class=\"sc-hZSUBg hdLojC\"][contains(text(),\"Beauty\")]")
	WebElement beauty;
	@FindBy(xpath = "//a[@class=\"sc-hZSUBg hdLojC\"][contains(text(),\"Lifestyle\")]")
	WebElement lifestyle;
	@FindBy(xpath = "//a[@class=\"sc-hZSUBg hdLojC\"][contains(text(),\"Wedding\")]")
	WebElement wedding;
	@FindBy(xpath = "//a[@class=\"sc-hZSUBg hdLojC\"][contains(text(),\"Wellness\")]")
	WebElement wellness;
	@FindBy(xpath = "//a[@class=\"sc-hZSUBg hdLojC\"][contains(text(),\"Entertainment\")]")
	WebElement entertainment;

	public WebElement getfashion() {
		return fashion;
	}

	public WebElement getbeauty() {
		return beauty;
	}

	public WebElement getlifestyle() {
		return lifestyle;
	}

	public WebElement getwedding() {
		return wedding;
	}

	public WebElement getwellness() {
		return wellness;
	}

	public WebElement getentertainment() {
		return entertainment;
	}

	/**
	 * 
	 * All subcategories of categories(fashion, beauty, lifestyle etc) link
	 */

	@FindAll(@FindBy(xpath = "//ul[@class='sc-cLQEGU cIXvVR']//*[@class='sc-gqPbQI cVOEjo']//descendant::a"))
	public List<WebElement> subcategoriesFashionlist;
	@FindBy(xpath = "//ul[@class='sc-eTpRJs leua']//*[@class='sc-dxZgTM kDIWrp']//descendant::a")
	WebElement subcategoriesBeautylist;
	@FindBy(xpath = "//ul[@class='sc-eTpRJs leua']//*[@class='sc-dxZgTM kDIWrp']//descendant::a")
	WebElement subcategoriesLifestylelist;
	@FindBy(xpath = "//ul[@class='sc-eTpRJs leua']//*[@class='sc-dxZgTM kDIWrp']//descendant::a")
	WebElement subcategoriesWeddinglist;
	@FindBy(xpath = "//ul[@class='sc-eTpRJs leua']//*[@class='sc-dxZgTM kDIWrp']//descendant::a")
	WebElement subcategoriesWellnesslist;
	@FindBy(xpath = "//ul[@class='sc-eTpRJs leua']//*[@class='sc-dxZgTM kDIWrp']//descendant::a")
	WebElement subcategoriesEntertainmentlist;

	public List<WebElement> getsubcategoriesFashionlist() {
		return subcategoriesFashionlist;
	}

	public WebElement getsubcategoriesBeautylist() {
		return subcategoriesBeautylist;
	}

	public WebElement getsubcategoriesLifestylelist() {
		return subcategoriesLifestylelist;
	}

	public WebElement getsubcategoriesWeddinglist() {
		return subcategoriesWeddinglist;
	}

	public WebElement getsubcategoriesWellnesslist() {
		return subcategoriesWellnesslist;
	}

	public WebElement getsubcategoriesEntertainmentlist() {
		return subcategoriesEntertainmentlist;
	}

	//@Test(dataProvider="Subcategorieslist", dataProviderClass= Dataprovider.class)
	public String clicksubcategoryFashion(String subcateg)
	{
		WebElement key;
		CategoryPFOM categ = new CategoryPFOM(driver);
		Set<WebElement> subcategoriesSet = new HashSet<WebElement>();
		for(WebElement x: categ.subcategoriesFashionlist )
		subcategoriesSet.add(x);
		Iterator itr = subcategoriesSet.iterator();
		while(itr.hasNext())
		{
			key = (WebElement) itr.next();
			System.out.println(key.getText());
			 if(key.getText().toString().equals(subcateg))
			{
			key.click();
			break;
		
			}
			 else
				 System.out.println("i am in else " +key.getText()+"  "+subcateg);
			
		}
		return(driver.getCurrentUrl());	
	}
	
	
	/**
	 * Category pages caraousal
	 */
	
	
	
}

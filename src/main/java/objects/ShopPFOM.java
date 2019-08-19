package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShopPFOM {
	WebDriver driver;

	public ShopPFOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[@id='leveloneheader'])[2]/div[1]/a[4]")
	WebElement clickonshop;

	public WebElement getclickonshop() {
		return clickonshop;
	}

	@FindBy(xpath = "//div[contains(text(),'Clothing')]")
	WebElement clickonClothing;

	public WebElement getclickonClothing() {
		return clickonClothing;
	}

	@FindBy(xpath = "//a[contains(text(),'Buy')]")
	WebElement buyProduct;

	public WebElement getbuyProduct() {
		return buyProduct;
	}

	
	public String ClickonAddtoCartxpath =  "//button[contains(text(),'ADD TO CART')]";
	@FindBy(xpath = "//button[contains(text(),'ADD TO CART')]")
	WebElement ClickonAddtoCart;

	public WebElement getClickonAddtoCart() {
		return ClickonAddtoCart;
	}

	
	public String addedtoYourCartpopupxpath = "//div[contains(text(),'JUST ADDED TO YOUR CART')]";
	@FindBy(xpath = "//div[contains(text(),'JUST ADDED TO YOUR CART')]")
	WebElement addedtoYourCartpopup;

	public WebElement getaddedtoYourCartpopup() {
		return addedtoYourCartpopup;
	}

	@FindBy(xpath = "//a[contains(text(),'CHECKOUT')]")
	WebElement clickCheckoutonCartPopup;

	public WebElement getclickCheckoutonCartPopup() {
		return clickCheckoutonCartPopup;
	}

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement clickLoginafterCheckout;

	public WebElement getclickLoginafterCheckout() {
		return clickLoginafterCheckout;
	}

	public String clothsizeDropdownxpath = "//*[@id='configurable-wrapper']/select";
	
	@FindBy(xpath = "//*[@id='configurable-wrapper']/select")
	public WebElement clothsizeDropdown;

	public WebElement getclothsizeDropdown() {
		return clothsizeDropdown;
	}


	@FindBy(xpath = "//input[@name='address']")
	WebElement allAddresses;

	public WebElement getAllAddresses() {
		return allAddresses;
	}

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement continueButtonOnOrderSummary;

	public WebElement getcontinueButtonOnOrderSummary() {
		return continueButtonOnOrderSummary;
	}

	@FindBy(xpath = "//input[@value='cashondelivery']")
	WebElement clickonOptionPayNowButton_CashOnDelivery;

	public WebElement getClickonOptionPayNowButton_CashOnDelivery()
	{
		return clickonOptionPayNowButton_CashOnDelivery;
	}

	@FindBy(xpath = "//input[@value='paytm']")
	WebElement clickonOptionPayNowButton_Paytm;

	public WebElement getClickonOptionPayNowButton_Paytm() {
		return clickonOptionPayNowButton_Paytm;
	}

	@FindBy(xpath = "//button[contains(text(),'PAY NOW')]")
	WebElement clickonPayNowButton;

	public WebElement getClickonPayNowButton() {
		return clickonPayNowButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Thank you for shopping with us!')]")
	WebElement successText;

	public WebElement getSuccessText() {
		return successText;
	}
	
	//Clicks on Cart icon 
	@FindBy(xpath = "//a[starts-with(@class,'brown-link')]")
	WebElement clickonCartItem;

	public WebElement getClickonCartItem() {
		return clickonCartItem;
	}
	
	//Remove items from cart
	@FindBy(css="#cart-remove")
	WebElement emptycart;

	public WebElement getEmptyCart() {
		return emptycart;
	}
	
	//Remove coupon 
	
	public String removeCouponxpath= "#apply";
	@FindBy(css="#apply")
	WebElement removeCoupon;
	
	public WebElement getRemoveCoupon() {
		return removeCoupon;
	}
	
//	@FindBy(xpath = "")
//	WebElement xyz;
//
//	public WebElement xyzmethod() {
//		return xyz;
//	}
	
	
	/**
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * Action
	 * methods
	 *
	 **/


    public void selectsizefromDropdown(int value) {
	Select selectsize = new Select(clothsizeDropdown);
	selectsize.selectByIndex(value);
	}
	
	public void addToCart()
	{
		
	}
}

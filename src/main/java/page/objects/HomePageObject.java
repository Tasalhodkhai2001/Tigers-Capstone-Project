package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class HomePageObject  extends Base{
   
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//span[text()='Currency']")
	private WebElement Currency;
	@FindBy(xpath ="//button[text()='£ Pound Sterling']")
	private WebElement sslectEuro;
	@FindBy(xpath ="//div[@id='cart']")
	private WebElement ChnageCurrancy;
	@FindBy(xpath ="//div[@id='cart']")
	private WebElement emptyshopingCart;
	@FindBy(xpath ="//p[text()='Your shopping cart is empty!']")
	private WebElement displayMessageofEmptycart;
	
	
	
	
	public void clickOnCurrency() {
		Utils.hoverOn(Currency);
	}
	public void clickOnEruo() {
		sslectEuro.click();
	}
	public void getCurrencyChange() {
	Utils.getTextFromUI(ChnageCurrancy);
	}
	public void clickOnEmptyShopingCart() {
		emptyshopingCart.click();
	}
	public void getDisplayMessageofEmptycart() {
Utils.getTextFromUI(displayMessageofEmptycart);
	}
	
}

package page.objects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class DesktopPageObject extends Base {
       
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement Desktops;
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktop;
	//===================================>>>
	@FindBy(tagName = "img")
	private List<WebElement> allItemsPresent;
	//Scenario two ========================>>>
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement addToCartHpLPLink;
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement sendQuantity;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartQuantity;
	@FindBy(xpath = "//button[@id='button-cart'")
	private WebElement AddToCartButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement iGotSuccesseMessage;
	//Scenario three=================================>>>>
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement clickCanonCameraLink;
	@FindBy(css = "select[id=input-option226]>option[value='15'")
	private WebElement selectRed;
	@FindBy(css = "//button[@id='button-cart' and @type='button']")
	private WebElement cameraAddToCartButt;
//	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]")
//	private WebElement cameraSuccessMessage;
	//===============================================>>>>
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement addCanonEosToCart;
	@FindBy(xpath = "//a[text()='Reviews (0)']")
	private WebElement reviewLink;
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement reviewerName;
	@FindBy(xpath = "	//textarea[@id='input-review']")
	private WebElement reviewTextArea;
	@FindBy(xpath = "//input[@type='radio' and @value='5']")
	private WebElement ratingOfReview;
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButton;
	@FindBy(xpath = "//form[@id='form-review']/div[2]")
	private WebElement ThnakYOUMessage;
	
	

	public void clickOnDesktop() {
		Utils.hoverOn(Desktops);
	}
	public void clickOnShowAllDesktop() {
		showAllDesktop.click();
	}
	//=============================================>>>
	public List<WebElement> desktopsItems() {
		List<WebElement> items = allItemsPresent;
		return items;
	}
	public void clickeAddToCartHPLP() {
		addToCartHpLPLink.click();
	}
	public void slectQuantity(int quantity) {
		sendQuantity.clear();
		String quant = Integer.toString(quantity);
		sendQuantity.sendKeys(quant);
	}
	public void addToCartHpLpQuantityOne() {
		addToCartQuantity.click();
	}
	public void clickAddToCartButton() {
		AddToCartButton.click();
	}
	public String  getSuccessMessage(String message) {
		String successM = iGotSuccesseMessage.getText();
		return successM;
	}
	//Scenario Third ==================================>
	
	public void clickOnCanonEOS5DCamera() {
		clickCanonCameraLink.click();
	}
	public void selectOnRedOption() {
		selectRed.click();
	}
	public void clickOnAddTOCartCanonEOS() {
		cameraAddToCartButt.click();
	}
//	public void getCameraSuccessMessage() {
//	 cameraSuccessMessage.getText();
//		
//	}
	//=======================================<><><>
	public void clickOnCanonEOSD() {
		addCanonEosToCart.click();
	}
	public void clickOnReviewLink() {
		reviewLink.click();
	}
	public void enterReviewerName(String name) {
		reviewerName.sendKeys(name);
	}
	public void enterYourReview(String Ropinion) {
		reviewTextArea.sendKeys(Ropinion);
	}
	public void clickRatingOfReview() {
		ratingOfReview.click();
	}
	public void clickOnContinueAfterRewview() {
		continueButton.click();
	}
     public void getThankYouMessage(String message) {
     ThnakYOUMessage.getText();
    	
    }
	
	
}

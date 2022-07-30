package page.objects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import core.Base;
import utilities.Utils;

public class LaptopNoteBooksPageObject extends Base {
	
public  LaptopNoteBooksPageObject() {
	PageFactory.initElements(driver, this);
}
      @FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
      private WebElement retailWebsite;
      @FindBy(xpath = " //a[text()='Laptops & Notebooks']")
      private WebElement LaptopNoteBooktab ;
      @FindBy(xpath = " //a[text()='Show All Laptops & Notebooks']")
      //First Scenario ===================================>
      private WebElement showAllLaptopNoteBooktab ;
      @FindBy(xpath = " //a[text()='MacBook']")
      private WebElement MacBookItem;
      @FindBy(xpath = "  //button[@id='button-cart']")
      private WebElement addtocartmacBook;
      @FindBy(xpath = "   //div[@id='product-product']/div[1]")
      private WebElement successMessageMacBook;
      @FindBy(xpath = " //div[@id='cart']")
      private WebElement see_1_tem_602_00showed;
      @FindBy(xpath = " //div[@id='cart']")
      private WebElement itemsOption;
      @FindBy(xpath = "//button[@type='button' and @title='Remove']")
      private WebElement RedXButton;
      @FindBy(xpath = "    //span[@id='cart-total']")
      private WebElement emptyItemsOptin;
    //Second Scenario ========================================>
      @FindBy(xpath = "//div[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[3]")
      private WebElement ComparisonIconOfMackBook;
      @FindBy(xpath = "//div[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[3]")
      private WebElement comparisonLinkMacAir;
      @FindBy(xpath = "  //h1[text()='Product Comparison']")
      private WebElement  ComparisonChart;
      //Third Scenario =======================================>>
      @FindBy(xpath = "//div[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
      private WebElement  SonyVoiAddWishList;
      @FindBy(xpath = " //a[text()='login']")
      private WebElement  getLoginMessage;
      //Forth Scenario =============================================>>
      
      @FindBy(xpath = "  //a[text()='MacBook Pro']")
      private WebElement  AddMacBookPRo;
      @FindBy(xpath = "//h2[text()='$2,000.00']")
      private WebElement  TextOfPriceTagMacBookPro;
      
      @FindBy(xpath = " //a[@id='compare-total']")
      private WebElement comparisonLink;
   
    
      public String userGetText() {
    	  String text = retailWebsite.getText();
    	  return text;
      }
      
      public void hoverOnLaptopNoteBooktab() {
    	 Utils.hoverOn(LaptopNoteBooktab); 
      }
      public void clickOnshowAllLaptopNoteBooktab() {
    	  showAllLaptopNoteBooktab.click();
      }
      
      public void clickOnMAcBook() {
    	  MacBookItem.click();
      }
      public void clickAddToCartBook() {
    	  addtocartmacBook.click();
      }
      public String getGuccessMessageForMacBook() {
    	String message = successMessageMacBook.getText();
    	  return message;
      }
      public String OneitemsInCart() {
    	 String items = see_1_tem_602_00showed.getText();
    	 return items;
      }
      public void clickOnitemsOptionButton() {
    	  itemsOption.click();
      }
      public void clickOnRedXButton() {
    	  RedXButton.click();
      }
      public String zeroItemsinOption() {
    	 String zero = emptyItemsOptin.getText();
    	 return zero;
      }
      public void clickOnComparisonIconOfMackBook() {
    	  ComparisonIconOfMackBook.click();
      }
      public void clickOnComparisonIconLinkMacAir() {
    	  comparisonLinkMacAir.click();
      }
      public void clickOnComparisonLink() {
    	  comparisonLink.click();
      }
      public void getComparisonChartText() {
    	  ComparisonChart.getText();
    	  
      }
      public void ADDToSonyVoiWishList() {
    	  SonyVoiAddWishList.click();
      }
      public void getLoginTextMessage() {
    	  getLoginMessage.getText();
      }
      public void clickOnMacBookPRO() {
    	  AddMacBookPRo.click();
      }
      public void getTextOfPriceTagMacBookPro() {
    	  TextOfPriceTagMacBookPro.getText();
      }

      }



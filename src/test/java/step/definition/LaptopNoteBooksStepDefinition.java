package step.definition;

import org.testng.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base{

	LaptopNoteBooksPageObject laptopnbkspageobject = new LaptopNoteBooksPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
	    String expectedText = "TEST ENVIRONMENT";
	    String actualText = laptopnbkspageobject.userGetText();
	Assert.assertEquals(expectedText,actualText);
	   logger.info("user got test environment");

	   
	   
	}
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopnbkspageobject.hoverOnLaptopNoteBooktab();
		logger.info("User Hover on laptopNBKS Page object");
	}

	@And("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopnbkspageobject.clickOnshowAllLaptopNoteBooktab();
		logger.info("user click on show All laptop notebookspage object");
	}

	@And("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopnbkspageobject.clickOnMAcBook();
		logger.info("user click on MacBook Item");
	}
   @And("User should see {int} tem\\(s){double} showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
	   laptopnbkspageobject.OneitemsInCart();
	   logger.info("user see one items in the option button ");
	}

	@And("User click on cart option")
	public void user_click_on_cart_option() {
		laptopnbkspageobject.clickOnitemsOptionButton();
		logger.info("user click on items option button "); 
	}

	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopnbkspageobject.clickOnRedXButton();
		logger.info("user click on Red X  option button ");
	}

	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		Utils.takeStepScreenShot();
		laptopnbkspageobject.zeroItemsinOption();
		logger.info("user see Zero items in the  option button ");
	}
	//Scenario Second ================================================>>
	@And("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopnbkspageobject.clickOnComparisonIconOfMackBook();
		logger.info("user click on product comparison icon on ‘MacBook ");
	}

	@And("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopnbkspageobject.clickOnComparisonIconLinkMacAir();
	}


	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopnbkspageobject.clickOnComparisonLink();
	}

	@Then("User should see Product Comparison Char")
	public void user_should_see_product_comparison_char() {
		Utils.takeStepScreenShot();
		laptopnbkspageobject.getComparisonChartText();
	}
	
	//Scenario Third ====================================>>
	@And("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
		laptopnbkspageobject.ADDToSonyVoiWishList();
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
		Utils.takeStepScreenShot();
		laptopnbkspageobject.getLoginTextMessage();
	}
	
	//Forth Scenario =====================================>>
	@And("User click on {string} item")
	public void user_click_on_item(String string) {
		laptopnbkspageobject.clickOnMacBookPRO();
	}
	@Then("User should see {string} price tag is present on UI")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		Utils.takeStepScreenShot();
		laptopnbkspageobject.getTextOfPriceTagMacBookPro();
	}




}

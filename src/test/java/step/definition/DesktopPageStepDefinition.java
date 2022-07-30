package step.definition;

import java.util.List;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.DesktopPageObject;
import utilities.Utils;


public class DesktopPageStepDefinition extends Base {
	
	DesktopPageObject desktoppageobj = new DesktopPageObject();
	

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktoppageobj.clickOnDesktop();
		logger.info("User Clicked On DeskTop Successfully");
	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktoppageobj.clickOnShowAllDesktop();
		logger.info("user clicked on Show all desktop successfully");
	  	}
	

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopElement = desktoppageobj.desktopsItems();
		for(WebElement element : desktopElement) {
			Assert.assertTrue(element.isDisplayed());
			Utils.takeStepScreenShot();
			logger.info(element.getAttribute("Title" + "is present"));
		
		}
		
	}
	@And("User click  ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktoppageobj.clickeAddToCartHPLP();
		logger.info("user add HP LP To cart successfully");
	}
	@And("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		desktoppageobj.slectQuantity(int1);
	}
	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktoppageobj.addToCartHpLpQuantityOne();
	}
	@Then("User should see a message Success: {string}")
	public void user_should_see_a_message_success(String string) {
		desktoppageobj.getSuccessMessage(string);
		logger.info("user got Successs Message");
	}
	@And("User click  ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktoppageobj.clickOnCanonEOS5DCamera();
		logger.info("user Add Canon Camera To cart succesfully");
	}

	@And("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		Utils.takeStepScreenShot();
		desktoppageobj.selectOnRedOption();
		logger.info("user select Red option Successfully");
		
	}
	
	// Scenario Forth ===============================>
	
	@And("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktoppageobj.clickOnCanonEOSD();
	logger.info("Canon ESD 5D addesd to cart");
	}

	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktoppageobj.clickOnReviewLink();
		logger.info("Clicked On review Link");
	}

	@And("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		desktoppageobj.enterReviewerName(data.get(0).get("yourname"));
		desktoppageobj.enterYourReview(data.get(0).get("yourReview"));
		desktoppageobj.clickRatingOfReview();
	}

	@And("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktoppageobj.clickOnContinueAfterRewview();
		logger.info("clikced on continue ");
	}
	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		Utils.takeStepScreenShot();
		desktoppageobj.getThankYouMessage(string);
		logger.info("got thanks  message");
	}






}

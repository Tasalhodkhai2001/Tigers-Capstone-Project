package step.definition;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base{

	HomePageObject  homepageoject = new HomePageObject();
	
	
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homepageoject.clickOnCurrency();
		logger.info("user click on currency");
	}

	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homepageoject.clickOnEruo();
		logger.info("User click on euro");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		Utils.takeStepScreenShot();
		homepageoject.getCurrencyChange();
		logger.info("currency change Successfully");
	}

	@And("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homepageoject.clickOnEmptyShopingCart();
		logger.info("User empty the shoping cart ");
	}

	@Then("{string} message should display")
	public void message_should_display(String string) {
		Utils.takeStepScreenShot();
		homepageoject.getDisplayMessageofEmptycart();
		logger.info("user got Display Message");
	}

}

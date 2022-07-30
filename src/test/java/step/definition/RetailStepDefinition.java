package step.definition;

import java.util.List;

import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.google.common.base.Objects;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;

public class RetailStepDefinition extends Base {

	RetailPageObject RetailPageObj = new RetailPageObject();

	@Given("User is on retail Website")
	public void User_is_on_retail_Website() {
		String expectedtext = "TEST ENVIRONMENT";
		String actualText = RetailPageObj.getTextEnvironment();
		Assert.assertEquals(expectedtext, actualText);
		logger.info("User in Retail Page Successfully");
	}

	@And("User click on MyAccount")
	public void User_click_on_MyAccount() {
		RetailPageObj.clickkOnMyAccount();
		logger.info("User clcik on My Account Successfully");
	}

	@When("User click on Login")
	public void User_click_on_Login() {
		RetailPageObj.UserClickOnLoginLink();
		logger.info("User Click Loginlink Successfully");
	}

	@And("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
		RetailPageObj.userEnterEmail(string);
		RetailPageObj.userEnterPassword(string2);
		logger.info("User enter email and password successfully");
	}
	@And("User click on Login button")
	public void user_click_on_login_button() {
		RetailPageObj.userClickonLoginButton();
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		RetailPageObj.getDasBoard();
		logger.info("Uesr Login into Dashboard Successfully");
	}

	@When("User click on {string} link")
	public void user_click_on_link(String string) {
		RetailPageObj.clickOnAffiliateLink();
		logger.info("User click on affiliate link successfully");
	}

	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable datatable) {
		List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
		RetailPageObj.enterCompanyName(data.get(0).get("company"));
		RetailPageObj.enterWebsiteName(data.get(0).get("website"));
		RetailPageObj.enterTaxId(data.get(0).get("taxID"));
		RetailPageObj.clickOnChequeRadioButton();
		RetailPageObj.chequePayeeNameTextField(data.get(0).get("chequePayeeName"));
		logger.info("User enter Above info successfully");
	}

	public void clickOnContinueButtonButt() {
		RetailPageObj.clickOnContinueButtonB();
		logger.info("clicked on continue successfully");
	}

	public void getSuccessMessageFrom() {
		RetailPageObj.getTextAccountCreatSuccessfull();
		logger.info("user got success message");
	}

	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		RetailPageObj.clickOnCheckBoxUs();
		logger.info("user click on about Us check box successfully");
	}

	@And("User click on Continue button")
	public void user_click_on_continue_button() {
		RetailPageObj.clickOnContinueButton();
		logger.info("usr click on continue button successfully");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
	 RetailPageObj.getSuccessMassage();
		logger.info("User Get Creat Account Successfully Message");
	}

	@When("User click on 'Edit your affiliate information'link")
	public void user_click_on_edit_your_affiliate_information_link() {
		RetailPageObj.clickOnEditAffilateAccountInformation();
		logger.info("User click on edit Affilate Account Successfully");
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		RetailPageObj.clickBankTransferRadioButton();
		logger.info("user click on bank transfer radio button successfully");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		RetailPageObj.enterBankName(data.get(0).get("bankName"));
		RetailPageObj.enterBankBarnchNumber(data.get(0).get("abaNumber"));
		RetailPageObj.enterSwiftCode(data.get(0).get("swiftCode"));
		RetailPageObj.enterAccountName(data.get(0).get("accountName"));
		RetailPageObj.enterAccountNumber(data.get(0).get("accountNumber"));
		logger.info("User Enter Bank Information Succesfully");
		
	}
	@When ("User click on Edit your account information link")
	public void  User_click_on_Edit_your_account_information_link() {
		RetailPageObj.clickOnEditYourAccountInfo();
		logger.info("User Click on Edit Account Information Successfully");
	}

	@And("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		RetailPageObj.enterFirstName(data.get(0).get("firstname"));
		RetailPageObj.enterLastName(data.get(0).get("lastName"));
		RetailPageObj.enterEmail(data.get(0).get("email"));
		RetailPageObj.enterTelephoneNumber(data.get(0).get("telephone"));
		logger.info("User Edit Above information Successfully");
	}

	@When("User click on continue button")
	public void user_click_on_continue_button1() {
		RetailPageObj.clickonContinueButton1();
		logger.info("user click on continue button successfully");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		RetailPageObj.getsuccesMessage();
		logger.info("got messsage sucessfully");
	}
	}



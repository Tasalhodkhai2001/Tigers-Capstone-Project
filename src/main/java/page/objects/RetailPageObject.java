package page.objects;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;


public class RetailPageObject extends Base {
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmentText;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement MyAccountLink;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginLink;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement enteEmail;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement enterPassword;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;
    @FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
    private WebElement dasboard;
    @FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAffiliateAccountLink;
    @FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyTextField;
    @FindBy(xpath = "//input[@id='input-website']")
	private WebElement webSiteTextField;
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxIdTextField;
	@FindBy(xpath = "//input[@type='radio' and @value='cheque']")
	private WebElement chequeRadioButton;
	@FindBy(id = "input-cheque")
	private WebElement chequePayeeName;
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement aboutUsCheckBox;
	@FindBy(xpath = "//input[@type='submit'and @class='btn btn-primary']")
	private WebElement continueButton;
	@FindBy(xpath = "//div[@id=\"account-account\"]/div[1]")
	private WebElement CreatAccountSuccessfully;
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffilateInformation;
	@FindBy(xpath = "//input[@name='payment' and @value='bank']")
	private WebElement transferBankRadioButton;
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankName;
	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement BranchNumber;
	@FindBy(xpath ="//input[@id='input-bank-swift-code']")
	private WebElement swiftCode;
	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement accountName;
	@FindBy(xpath ="//input[@id='input-bank-account-number']")
	private WebElement accountNumber;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement buttonContinue;
	@FindBy(xpath = "//i[@class='fa fa-check-circle']")
	private WebElement SuccessMeassage;
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInfo;
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameTextField;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameTextField;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emaiTextField;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephoneTextField;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement contnueButton;
	@FindBy(xpath = "//div[@id='account-account']/div[1]")
	private WebElement succesMessage;
	
	
	public String getTextEnvironment() {
	String text= Utils.getTextFromUI(testEnvironmentText);
		return text;
	}

	public void clickkOnMyAccount() {
		MyAccountLink.click();
	}

	public void UserClickOnLoginLink() {
		loginLink.click();
	}

	public void userEnterEmail(String email) {
		enteEmail.sendKeys(email);
	}

	public void userEnterPassword(String password) {
		enterPassword.sendKeys(password);
	}

	public void userClickonLoginButton() {
		loginButton.click();
	}
	public String getDasBoard() {
		Utils.takeStepScreenShot();
		String text1 = dasboard.getText();
		return text1;
	}
	public void clickOnAffiliateLink() {
		registerForAffiliateAccountLink.click();
	}
	public void enterCompanyName(String compName) {
		companyTextField.sendKeys(compName);
	}
	public void enterWebsiteName(String WebsiteName) {
		webSiteTextField.sendKeys(WebsiteName);
	}
	public void enterTaxId(String taxID) {
		taxIdTextField.sendKeys(taxID);
	}
	public void clickOnChequeRadioButton() {
	    Utils.clickOnRadioButton(chequeRadioButton);
	}
	public void chequePayeeNameTextField(String ChequePayee) {
		chequePayeeName.sendKeys(ChequePayee);
	}
	
	public void clickOnCheckBoxUs() {
		Utils.clickOnRadioButton(aboutUsCheckBox);
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}
	public void getTextAccountCreatSuccessfull() {
		 CreatAccountSuccessfully.getText();
		 Utils.takeStepScreenShot();
		logger.info("get Text Account creat Successfully ");
	
	}
	public void clickOnEditAffilateAccountInformation() {
		editAffilateInformation.click();
	}
	public void clickBankTransferRadioButton() {
		Utils.clickOnRadioButton(transferBankRadioButton);
	}
	public void enterBankName(String bankName1) {
		bankName.clear();
		bankName.sendKeys(bankName1);
	}
	public void enterBankBarnchNumber(String number) {
		BranchNumber.clear();
		BranchNumber.sendKeys(number);
	}
	public void enterSwiftCode(String swiftCodenumber) {
		swiftCode.clear();
		swiftCode.sendKeys(swiftCodenumber);
	}
	public void enterAccountName(String AccountN) {
		accountName.clear();
		accountName.sendKeys(AccountN);
	}
	public void enterAccountNumber(String AccountN) {
		accountNumber.clear();
		accountNumber.sendKeys(AccountN);
	}
	public void clickOnContinueButtonB() {
		buttonContinue.click();
	}
	public void  getSuccessMassage() {
		Utils.takeStepScreenShot();
		SuccessMeassage.getText();
		
	}
	public void clickOnEditYourAccountInfo() {
		editYourAccountInfo.click();
		logger.info("user clicked on edit account information");
	}
	public void enterFirstName(String fName) {
		firstNameTextField.clear();
		firstNameTextField.sendKeys(fName);
	}
	public void enterLastName(String LName) {
		lastNameTextField.clear();
		lastNameTextField.sendKeys(LName);
	}
	public void enterEmail(String email) {
		emaiTextField.clear();
		emaiTextField.sendKeys(email);
	}
	public void enterTelephoneNumber(String phNumber) {
		telephoneTextField.clear();
		telephoneTextField.sendKeys(phNumber);
	}
	public void clickonContinueButton1() {
		contnueButton.click();
	}
	public void getsuccesMessage() {
		Utils.takeStepScreenShot();
		succesMessage.getText();
	}
}
	
	


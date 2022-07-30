@Smoke @ReataiPage
Feature: login to retail

  Background: 
    Given User is on retail Website
    And User click on MyAccount
    When User click on Login
    And User enter username 'Samikhan88@gmail.com' and password '102030'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

 
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on 'Register for an Affiliate Account' link
    And User fill affiliate form with below information
      | company  | website  | taxID  | paymentMethod | chequePayeeName |
      | OldNavey | Airforce | 5MH096 | Cheque        | AfghanPay       |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message


  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on 'Edit your affiliate information'link
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName      | abaNumber | swiftCode    | accountName | accountNumber    |
      | BankOfAmerica |  10203060 | 454545686848 | Checking    | 1231324458796452 |
    And User click on Continue button
    Then User should see a success message

  
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstname | lastName | email                    | telephone |
      | Ali       | Akbar    | AfghanMuslih99@gmail.com | 785469875 |
    And User click on continue button
    Then User should see a message 'Success: Your account has been successfully updated'

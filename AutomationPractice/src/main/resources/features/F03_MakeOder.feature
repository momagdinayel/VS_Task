@Runner
Feature: Make Order || User can make orders

  Background: Authenticated user login
    Given user navigate to home page
    And user click sign_in
    When user enter valid mail"k8893@gmail.com" and valid Password"Qwert6613"
    And And user clicks sign button
    Then user Authenticated successfully

  Scenario: user can make order with certain product
    When user select subcategory blouses from category women
    And select the resulted product
    And click addCart and proceed to checkout
    And follow the checkout procedures accept terms and proceed
    And select bank_wire and confirm the order
    Then navigate to order history page to validate order was placed


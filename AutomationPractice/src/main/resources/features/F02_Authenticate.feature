@Runner
Feature: Authentication || user could Login to the site

  Scenario: user could Authenticate entering valid data

    Given user navigate to home page
    And user click sign_in
    When user enter valid mail"k8893@gmail.com" and valid Password"Qwert6613"
    And And user clicks sign button
    Then user Authenticated successfully
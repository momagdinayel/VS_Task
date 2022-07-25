@Runner
Feature: Registration || user could register to the site

  Scenario: user could register entering valid data

    Given user navigate to home page
    And user click sign_in
    When user enter new email"m16023@gmail.com" and click create
    And user enter title"Mrs" Firstname"Nour" Lastname"Magdi" Email"m16023@gmail.com" Password"Qwert6613" day"6" month"6" year"1998" AdreFname"Mohamed" AdreLname"Magdi" Company"vodafone" Address"12A" city"cairo" state"Georgia" postalcode"12833" country"United States" Mobilephone"01283726495" AliasAddress"MyaddressAli"
    And user clicks register button
    Then user"Nour" registered successfully
Feature: Test saucedemo page

  Background:
    Given Open the Chrome and visit Saucedemo

  Scenario: Test login form with valid credentials
    Given I insert a valid username
    Given I insert a valid password
    When I click on the Login button
    When I click on the menu button
    Then I should be able to login successfully
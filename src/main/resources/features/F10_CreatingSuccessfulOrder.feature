Feature: Test the whole process of complete an order

  Background:
    Given the user opened browser and navigates to the login page to add an item
    And the user logged in
    And after searching the logged user selected an item and put it in his shopping cart

    Scenario: the logged user could be complete his order with his valid data
      When he completes his payment method

      Then the payment method of order has done
      And close the final page of browser

Feature: I want to be able make a successful booking

  As a Register user
  I want to be able to make a successful booking

  Background:
    Given I am about to enter a text search term

  @BookingAsRegUser
  Scenario: Make a booking as a registered user
    When I enter 2 characters into the search field
    And I pick the first autocomplete suggestion shown
    Then I should be taken to the search criteria screen
    When I decide to submit my search
    Then I should be taken to the search results screen
    When I choose to see the details of a hotel
    Then I should be taken to the hotel details screen
    And I should be able to request to see available rooms
    Then I should be taken to the hotel room list screen
    When I add a room
    And I choose to book
    Then I should be taken to the contact details screen
    When I continue my booking by logging in
    And I choose leisure as the reason for my booking
    And I choose to continue booking with these contact details
    Then I should be taken to the card details screen
    When I choose a card for the first time
    And I have entered card number, holder's name, expiry date and CVC number
    And I choose to complete my booking
    Then I should be taken to the booking confirmation screen

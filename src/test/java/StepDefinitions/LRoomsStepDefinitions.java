package StepDefinitions;

import ScreenObjects.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

public class LRoomsStepDefinitions
{

    public static AppiumDriver driver;

    OnboardingViewScreen OnboardingView;
    SearchViewScreen SearchView;
    SearchCriteriaViewScreen SearchCriteriaView;
    SearchResultViewScreen SearchResultView;
    HotelDetailsViewScreen HotelDetailsView;
    HotelRoomListViewScreen HotelRoomListView;
    ContactDetailsViewScreen ContactDetailsView;
    CardDetailsViewScreen CardDetailsView;
    BookingConfirmationViewScreen BookingConfirmationView;


    @Given("^I am about to enter a text search term$")
    public void i_am_about_to_enter_a_text_search_term() throws Throwable
    {
        OnboardingView = new OnboardingViewScreen(driver);
        OnboardingView.NavigateToApp();
        SearchView = OnboardingView.NavigateToSearchView();
    }

    @When("^I enter (\\d+) characters into the search field$")
    public void i_enter_characters_into_the_search_field(int arg1) throws Throwable
    {
        SearchView.EnterCharactersIntoSearchField("lo");
    }

    @When("^I pick the first autocomplete suggestion shown$")
    public void i_pick_the_first_autocomplete_suggestion_shown() throws Throwable
    {
       SearchCriteriaView =  SearchView.NavigateToSearchCriteriaView();
    }

    @Then("^I should be taken to the search criteria screen$")
    public void i_should_be_taken_to_the_search_criteria_screen() throws Throwable
    {
       SearchCriteriaView.SearchCriteriaViewIsDisplayed();
    }

    @When("^I decide to submit my search$")
    public void i_decide_to_submit_my_search() throws Throwable
    {
        SearchResultView = SearchCriteriaView.NavigateToSearchResultView();
    }

    @Then("^I should be taken to the search results screen$")
    public void i_should_be_taken_to_the_search_results_screen() throws Throwable
    {
        SearchResultView.SearchResultsScreenIsDisplayed();
    }

    @When("^I choose to see the details of a hotel$")
    public void i_choose_to_see_the_details_of_a_hotel() throws Throwable {
        HotelDetailsView = SearchResultView.NavigateHotelDetailsView();
    }

    //Check that user is on the Hotel Details Screen
    @Then("^I should be taken to the hotel details screen$")
    public void i_should_be_taken_to_the_hotel_details_screen() throws Throwable
    {
        HotelDetailsView.HotelDetailsViewIsDisplayed();
    }


    @Then("^I should be able to request to see available rooms$")
    public void i_should_be_able_to_request_to_see_available_rooms() throws Throwable
    {
        HotelRoomListView = HotelDetailsView.NavigateToHotelRoomListView();
    }

    //Check that user is on the Hotel Room List  Screen
    @Then("^I should be taken to the hotel room list screen$")
    public void i_should_be_taken_to_the_hotel_room_list_screen() throws Throwable
    {
        HotelRoomListView.HotelRoomListViewIsDisplayed();
    }

    @When("^I add a room$")
    public void i_add_a_room() throws Throwable
    {
        HotelRoomListView.HotelRoomIsAdded();
    }

    @When("^I choose to book$")
    public void i_choose_to_book() throws Throwable
    {
        ContactDetailsView = HotelRoomListView.NavigateToContactDetailsView();
    }

    //Check that user is on the Contact Details Screen
    @Then("^I should be taken to the contact details screen$")
    public void i_should_be_taken_to_the_contact_details_screen() throws Throwable
    {
        ContactDetailsView.ContactDetailsViewIsDisplayed();
    }

    @When("^I continue my booking by logging in$")
    public void i_continue_my_booking_by_logging_in() throws Throwable
    {
        ContactDetailsView.ExpandLogin();
        ContactDetailsView.EnterEmail("testing@laterooms.com");
        ContactDetailsView.EnterPassword("testing1");
        ContactDetailsView.ClickLogIn();
    }

    @When("^I choose leisure as the reason for my booking$")
    public void i_choose_leisure_as_the_reason_for_my_booking() throws Throwable
    {
        ContactDetailsView.ChooseLeisureOption();
    }

    @When("^I choose to continue booking with these contact details$")
    public void i_choose_to_continue_booking_with_these_contact_details() throws Throwable
    {
        CardDetailsView = ContactDetailsView.NavigateToCardDetailsView();
    }


    @Then("^I should be taken to the card details screen$")
    public void i_should_be_taken_to_the_card_details_screen() throws Throwable
    {
        CardDetailsView.ContactDetailsViewIsDisplayed();
    }

    @When("^I choose a card for the first time$")
    public void i_choose_a_card_for_the_first_time() throws Throwable
    {
        CardDetailsView.ChooseFirstTimePaymentCard("Mastercard");
    }

    @When("^I have entered card number, holder's name, expiry date and CVC number$")
    public void i_have_entered_card_number_holder_s_name_expiry_date_and_CVC_number() throws Throwable
    {
        CardDetailsView.EnterCardNumber("4406080400000000");
        CardDetailsView.EnterExpiryDate("0119");
        CardDetailsView.EnterCardSecurityNumber("111");

    }

    @When("^I choose to complete my booking$")
    public void i_choose_to_complete_my_booking() throws Throwable
    {
        BookingConfirmationView = CardDetailsView.NavigateToBookingConfirmationView();
    }

    //Check that user is on the Booking Confirmation Screen
    @Then("^I should be taken to the booking confirmation screen$")
    public void i_should_be_taken_to_the_booking_confirmation_screen() throws Throwable
    {
        BookingConfirmationView.BookingConfirmationViewIsDisplayed();
    }


    @When("^I enter valid contact and guest details$")
    public void i_enter_valid_contact_and_guest_details() throws Throwable
    {
        ContactDetailsView.EnterGuestTitle("Miss");
        ContactDetailsView.EnterGuestFirstName("Rob");
        ContactDetailsView.EnterGuestSurname("Jon");
        ContactDetailsView.EnterGuestEmail("rob@gmail.com");
        ContactDetailsView.EnterGuestPhoneNo("07963828282");
    }


    @Then("^I have entered a valid billing address$")
    public void i_have_entered_a_valid_billing_address() throws Throwable
    {
        CardDetailsView.EnterCardAddressCountry("United Kingdom");
        CardDetailsView.EnterCardAddress1("12 Dull St");
        CardDetailsView.EnterCardAddressCity("London");
        CardDetailsView.EnterCardAddressPostcode("SE1 8PL");

    }


}

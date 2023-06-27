package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Screen.BookOnlineClassScreen;

public class BookOnlineClassSteps {
    @Steps
    BookOnlineClassScreen bookOnlineClassScreen;

    @Given("user was login")
    public void userWasLogin() {
        bookOnlineClassScreen.onLoginScreen();
        bookOnlineClassScreen.clickEmailField();
        bookOnlineClassScreen.inputEmail("din@gmail.com");
        bookOnlineClassScreen.clickPasswordField();
        bookOnlineClassScreen.inputPassword("Din@gmail.com1");
        bookOnlineClassScreen.clickLoginButton();
    }

    @And("user on homeScreen")
    public void userOnHomeScreen() {
        bookOnlineClassScreen.onHomeScreen();
    }

    @And("user click menu explore")
    public void userClickMenuExplore() {
        bookOnlineClassScreen.clickExploreMenu();
    }

    @And("user click permission location")
    public void userClickPermissionLocation() {
        bookOnlineClassScreen.clickLocationPermission();
    }

    @And("user on exploreScreen")
    public void userOnExploreScreen() {
        bookOnlineClassScreen.onExploreScreen();
    }

    @When("user input online class")
    public void userInputOnlineClass() {
        bookOnlineClassScreen.clickSearchOnlineClassGym();
        bookOnlineClassScreen.clickSearchOnlineClass();
        bookOnlineClassScreen.inputOnlineClassSearch("online");
        bookOnlineClassScreen.clickPilates();
    }

    @And("user click online class book button")
    public void userClickOnlineClassBookButton() {
        bookOnlineClassScreen.clickOnlineClassBookButton();
    }

    @And("user select online class package")
    public void userSelectOnlineClassPackage() {
        bookOnlineClassScreen.selectPackage();
    }

    @And("user click button booking now")
    public void userClickButtonBookingNow() {
        bookOnlineClassScreen.clickBookingNowButton();
    }

    @And("user click payment method button")
    public void userClickPaymentMethodButton() {
        bookOnlineClassScreen.clickSelectPaymentMethodButton();
    }

    @And("user select payments method")
    public void userSelectPaymentsMethod() {
        bookOnlineClassScreen.selectPaymentMethod();
    }

    @And("user click button select")
    public void userClickButtonSelect() {
        bookOnlineClassScreen.clickSelectButton();
    }

    @And("user click button continue to payment")
    public void userClickButtonContinueToPayment() {
        bookOnlineClassScreen.clickContinueToPaymentButton();
    }

    @And("user click Pay Now button")
    public void userClickPayNowButton() {
        bookOnlineClassScreen.clickPayNowButton();
    }

    @And("user input card number field")
    public void userInputCardNumberField() {
        bookOnlineClassScreen.clickCardNumberField();
        bookOnlineClassScreen.inputCardNumber("4811 1111 1111 1114");
    }

    @And("user input validity period field")
    public void userInputValidityPeriodField() {
        bookOnlineClassScreen.clickValidityPeriodField();
        bookOnlineClassScreen.inputValidityPeriod("2/2025");
    }

    @And("user input cvv field")
    public void userInputCvvField() {
        bookOnlineClassScreen.clickCvvField();
        bookOnlineClassScreen.inputCvv("123");
    }

    @And("user click {string} again button")
    public void userClickAgainButton(String arg0) {
        bookOnlineClassScreen.clickPayNowAgainButton();
    }

    @Then("user see successful to payment pop up")
    public void userSeeSuccessfulToPaymentPopUp() {
        bookOnlineClassScreen.seeSuccessfullyPaymentPopUp();
    }
}

package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Screen.BookOfflineScreen;

public class BookOfflineClassSteps {

    @Steps
    BookOfflineScreen bookOfflineScreen;

    @Given("user is login")
    public void userIsLogin() {
        bookOfflineScreen.onLoginScreen();
        bookOfflineScreen.clickEmailField();
        bookOfflineScreen.inputEmail("din@gmail.com");
        bookOfflineScreen.clickPasswordField();
        bookOfflineScreen.inputPassword("Din@gmail.com1");
        bookOfflineScreen.clickLoginButton();
    }

    @And("user on home screen")
    public void userOnHomeScreen() {
        bookOfflineScreen.onHomeScreen();
    }

    @And("user click explore menu")
    public void userClickExploreMenu() {
        bookOfflineScreen.clickExploreMenu();
    }

    @And("user on explore screen")
    public void userOnExploreScreen() {
        bookOfflineScreen.onExploreScreen();
    }

    @When("user input location")
    public void userInputLocation() {
        bookOfflineScreen.clickEnterYourLocationField();
        bookOfflineScreen.clickSearchGymLocationField();
        bookOfflineScreen.inputSearchGymLocation("medan");
        bookOfflineScreen.clickLocationResult();
    }

    @And("user select session")
    public void userSelectSession() {
        bookOfflineScreen.selectSession();
    }

    @And("user click offline class book button")
    public void userClickOfflineClassBookButton() {
        bookOfflineScreen.clickOfflineClassBookButton();
    }

    @And("user select package")
    public void userSelectPackage() {
        bookOfflineScreen.selectPackage();
    }

    @And("user click booking now button")
    public void userClickBookingNowButton() {
        bookOfflineScreen.clickBookingNowButton();
    }

    @And("user click select payment method button")
    public void userClickSelectPaymentMethodButton() {
        bookOfflineScreen.clickSelectPaymentMethodButton();
    }

    @And("user select payment method")
    public void userSelectPaymentMethod() {
        bookOfflineScreen.selectPaymentMethod();
    }

    @And("user click select button")
    public void userClickSelectButton() {
        bookOfflineScreen.clickSelectButton();
    }

    @And("user click continue to payment button")
    public void userClickContinueToPaymentButton() {
        bookOfflineScreen.clickContinueToPaymentButton();
    }

    @And("user click pay now button")
    public void userClickPayNowButton() {
        bookOfflineScreen.clickPayNowButton();
    }

    @And("user input card number")
    public void userInputCardNumber() {
        bookOfflineScreen.clickCardNumberField();
        bookOfflineScreen.inputCardNumber("4811 1111 1111 1114");
    }

    @And("user input validity period")
    public void userInputValidityPeriod() {
        bookOfflineScreen.clickValidityPeriodField();
        bookOfflineScreen.inputValidityPeriod("2/2025");
    }

    @And("user input cvv")
    public void userInputCvv() {
        bookOfflineScreen.clickCvvField();
        bookOfflineScreen.inputCvv("123");
    }

    @And("user click {string} button")
    public void userClickButton(String arg0) {
        bookOfflineScreen.clickPayNowAgainButton();
    }

    @Then("user see successfully payment pop up")
    public void userSeeSuccessfullyPaymentPopUp() {
        bookOfflineScreen.seeSuccessfullyPaymentPopUp();
    }

    @And("user input offline class")
    public void userInputOfflineClass() {
        bookOfflineScreen.clickSearchOfflineClass();
        bookOfflineScreen.clickOfflineClassSearchField();
        bookOfflineScreen.inputSearchOfflineClass("pilates");
        bookOfflineScreen.clickPilatesOfflineResult();
    }

    @And("user click location permission")
    public void userClickLocationPermission() {
        bookOfflineScreen.clickLocationPermission();
    }
}

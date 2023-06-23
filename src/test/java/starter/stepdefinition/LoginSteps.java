package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Screen.LoginScreen;

public class LoginSteps {

    @Steps
    LoginScreen loginScreen;

    @Given("user on dashboard for login")
    public void userOnDashboardForLogin() {
        loginScreen.OnDashboard();
    }

    @When("user input email")
    public void userInputValidEmail_() {
        loginScreen.ClickEmail();
        loginScreen.InputEmail("seokjin@gmail.com");
    }

    @And("user input password")
    public void userInputInvalidPassword_() {
        loginScreen.ClickPassword();
        loginScreen.InputPassword("Altera123!");
    }


    @And("user click login")
    public void userClickLoginButton_() {
        loginScreen.ClickLogin();
    }

    @Then("user can see hompege")
    public void userCanSeeHompege() {
        loginScreen.onHomepage();
    }

    //------------------------------------------------login with input valid email and invalid password-------------------------------
    @Given("user on login screen")
    public void userOnLoginScreen() {
        loginScreen.OnDashboard();
    }

    @When("user input valid email")
    public void userInputValidEmail() {
        loginScreen.ClickEmail();
        loginScreen.InputEmail("seokjin@gmail.com");
    }

    @And("user input invalid password")
    public void userInputInvalidPassword() {
        loginScreen.ClickPassword();
        loginScreen.InputPassword("test123");
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginScreen.ClickLoginButtonDisable();
    }

    @Then("user see error message password {string}")
    public void userSeeErrorMessagePassword(String arg0) {
        loginScreen.errorMessageEmailorpasswordisincorrect_();
    }

    @When("user input invalid email")
    public void userInputInvalidEmail() {
        loginScreen.ClickEmail();
        loginScreen.InputEmail("zaldier@gmail.com");
    }

    @And("user input valid password")
    public void userInputValidPassword() {
        loginScreen.ClickPassword();
        loginScreen.InputPassword("Altera123!");
    }


    @When("user input empty email")
    public void userInputEmptyEmail() {
        loginScreen.ClickEmail();
        loginScreen.InputEmail("");
    }


    @And("user input empty password")
    public void userInputEmptyPassword() {
        loginScreen.ClickPassword();
        loginScreen.InputPassword("");
    }

    @Then("Then user could see error message {string}")
    public void thenUserCouldSeeErrorMessage(String arg0) {
        loginScreen.errormessageTheField_();
    }
}
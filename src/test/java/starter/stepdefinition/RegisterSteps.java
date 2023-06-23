package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Screen.Register;

public class RegisterSteps {
    @Steps
    Register register;
    @Given("user on the login screen")
    public void userOnTheLoginScreen() {
        register.OnScreen();
    }

    @And("user click {string}")
    public void userClick(String arg0) {
        register.ClickSignUp();
    }

    @When("user input username")
    public void userInputValidUsername() {
        register.ClickUsername();
        register.inputName("zaldirizald");
    }

    @And("user input email for register")
    public void userInputValidEmailForRegister_() {
        register.ClickEmail();
        register.inputEmailForRegister("zaldirizald14@gmail.com");
    }

    @And("user input password for register")
    public void userInputValidPasswordForRegister_() {
        register.ClickPassword();
        register.inputPasswordForRegister("Kuntoaji14!");
    }

    @And("user input confirm password")
    public void userInputValidConfirmPassword_() {
        register.ClickConfirmPassword();
        register.inputConfirmPassword("Kuntoaji14!");

    }

    @And("user click Sign Up Button")
    public void userClickSignUpButton() {
        register.Scrollview();
        register.tapRegisterButton();

    }

    @Then("user view {string}")
    public void userView(String arg0) {
        register.viewRegistrationSuccess();
    }
//==============================================================================
    @When("user input valid name")
    public void userInputValidName() {
        register.ClickUsername();
        register.inputName("zaldirizald");
    }

    @And("user input empty email for register")
    public void userInputEmptyEmailForRegister() {
        register.ClickEmail();
        register.inputEmailForRegister("");
    }

    @And("user input valid password for_register")
    public void userInputValidPasswordFor_register() {
        register.ClickPassword();
        register.inputPasswordForRegister("Kuntoaji14!");
    }

    @And("user input valid confirm_password")
    public void userInputValidConfirm_password() {
        register.ClickConfirmPassword();
        register.inputConfirmPassword("Kuntoaji14!");
    }

    @And("user click register button")
    public void userClickRegisterButton() {
        register.Scrollview();
        register.tapRegisterButton();
    }

    @Then("user see {string} error message")
    public void userSeeErrorMessage(String arg0) {
        register.errorMessageEmail();
    }

    @When("user input empty name")
    public void userInputEmptyName() {
        register.ClickUsername();
        register.inputName("");
    }

    @And("user input valid email for register")
    public void userInputValidEmailForRegister() {
        register.ClickEmail();
        register.inputEmailForRegister("zaldirizald14@gmail.com");
    }

    @And("user input valid password for register")
    public void userInputValidPasswordForRegister() {
        register.ClickPassword();
        register.inputPasswordForRegister("Kuntoaji14!");
    }

    @And("user input valid confirm password")
    public void userInputValidConfirmPassword() {
        register.ClickConfirmPassword();
        register.inputConfirmPassword("Kuntoaji14!");
    }

    @Then("user view {string} error message")
    public void userViewErrorMessage(String arg0) {
        register.errorMessage_();
    }


    @And("user input empty password for register")
    public void userInputEmptyPasswordForRegister() {
        register.ClickPassword();
        register.inputPasswordForRegister("");
    }

    @Then("user can see {string} error message")
    public void userCanSeeErrorMessage(String arg0) {
        register.errorMessagePassword();
    }

    @And("user input empty confirm password")
    public void userInputEmptyConfirmPassword() {
        register.ClickConfirmPassword();
        register.inputConfirmPassword("");
    }

    @Then("user can view {string} error message")
    public void userCanViewErrorMessage(String arg0) {
        register.errorMessageDoesNotMatch();
    }

    @And("user input invalid confirm password")
    public void userInputInvalidConfirmPassword() {
        register.ClickConfirmPassword();
        register.inputConfirmPassword("Kuntoaji15!");
    }

    @When("user input name {int} characters")
    public void userInputNameCharacters(int arg0) {
        register.ClickUsername();
        register.inputName("ab");
    }

    @When("user input name numberic")
    public void userInputNameNumberic() {
        register.ClickUsername();
        register.inputName("123");
    }

    @Then("user view Enter Full Name error message")
    public void userViewEnterFullNameErrorMessage() {
        register.errorMessageUsername();
    }

    @Then("user view Username must be alphabetical only error message")
    public void userViewUsernameMustBeAlphabeticalOnlyErrorMessage() {
        register.errorMessageNumberic();
    }
}

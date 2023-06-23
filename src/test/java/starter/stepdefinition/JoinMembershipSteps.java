package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Screen.JoinMembershipScreen;

public class JoinMembershipSteps {


    @Steps
    JoinMembershipScreen joinMembershipScreen;
    @Given("user on Choose Gender Page")
    public void userOnChooseGenderPage() {
        joinMembershipScreen.OnScreen();
        joinMembershipScreen.ClickSignUp();
        joinMembershipScreen.ClickUsername();
        joinMembershipScreen.inputName("zaldirizald");
        joinMembershipScreen.ClickEmail();
        joinMembershipScreen.inputEmailForRegister("zaldirizald14@gmail.com");
        joinMembershipScreen.ClickPassword();
        joinMembershipScreen.inputPasswordForRegister("Kuntoaji14!");
        joinMembershipScreen.ClickConfirmPassword();
        joinMembershipScreen.inputConfirmPassword("Kuntoaji14!");
        joinMembershipScreen.Scrollview();
        joinMembershipScreen.tapRegisterButton();


    }

    @And("user Choose Gender Male")
    public void userChooseGenderMale() {
        joinMembershipScreen.ClickFieldOTP();
        joinMembershipScreen.InputOTP("6969");
        joinMembershipScreen.VerifyButton();
        joinMembershipScreen.GenderMale_();

    }

    @And("User click continue")
    public void userClickContinue() {
        joinMembershipScreen.clickCOntinue();
    }

    @When("user input your Height")
    public void userInputYourHeight() {
        joinMembershipScreen.ClickInputHeght();
        joinMembershipScreen.InputHeight_("170");
    }

    @And("user input your weight")
    public void userInputYourWeight() {
        joinMembershipScreen.ClickInputWeght();
        joinMembershipScreen.Inputweight_("55");
    }

    @And("user input Goal Weight")
    public void userInputGoalWeight() {
        joinMembershipScreen.ClickInputWeghtGoal();
        joinMembershipScreen.InputGoalweight_("50");
    }

    @And("user choose Traning Level Beginner")
    public void userChooseTraningLevelBeginner() {
        joinMembershipScreen.Beginner();
    }

    @And("User choose unlimited access")
    public void userChooseUnlimitedAccess() {
        joinMembershipScreen.Month();
    }

    @And("User Choose Payment Methode Gopay")
    public void userChoosePaymentMethodeGopay() {
        joinMembershipScreen.ClickGopay();
    }

    @And("User click select payment")
    public void userClickSelectPayment() {
        joinMembershipScreen.ClickSelect();
    }

    @And("User click select pay")
    public void userClickSelectPay() {
        joinMembershipScreen.ClickPayButton();
    }

    @Then("user view {string} done")
    public void userViewDone(String arg0) {
        joinMembershipScreen.Message_Success();
    }

    @And("User click continue Traning Level Beginner")
    public void userClickContinueTraningLevelBeginner() {
        joinMembershipScreen.ClickContinueLevel();
    }
}

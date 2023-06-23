package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Screen.TrainingScreen;

public class TrainingSteps {
    @Steps
    TrainingScreen trainingScreen;
    @Given("user on Gofit Homepage")
    public void userOnGofitHomepage() {
        trainingScreen.OnDashboard();
        trainingScreen.ClickEmail();
        trainingScreen.InputEmail("din@gmail.com");
        trainingScreen.ClickPassword();
        trainingScreen.InputPassword("Din@gmail.com1");
        trainingScreen.ClickLogin();
    }
    @When("user click Traning in homepage")
    public void userClickTraningInHomepage() {
        trainingScreen.ClickTraining();

    }

    @And("user click Best Home Workout in {string}")
    public void userClickBestHomeWorkoutIn(String arg0) {
        trainingScreen.ClickBestHome();
    }

    @And("user click Fat Burning")
    public void userClickFatBurning() {
        trainingScreen.ClickFatBurning();
    }

    @And("user click Start")
    public void userClickStart() {
        trainingScreen.ClickStart();
    }

    @And("user click next")
    public void userClickNext() {
        trainingScreen.ClickNext();
    }

    @And("user click skip")
    public void userClickSkip() {
        trainingScreen.ClickSkip();
    }

    @And("user click finish")
    public void userClickFinish() {
        trainingScreen.ClickFinish();
    }

    @And("user click rated training")
    public void userClickRatedTraining() {
        trainingScreen.ClickRate();
    }

    @Then("User click Done")
    public void userClickDone() {
        trainingScreen.ClickDone();
    }


}

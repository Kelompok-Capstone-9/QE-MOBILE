package starter.Screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class TrainingScreen extends BasePageObject {
    private By emailFiled() {
        return AppiumBy.xpath("//android.widget.EditText[@index='2']");
    }
    //(//android.view.View[@content-desc="Login"]/following-sibling::android.widget.EditText)[1]

    private By passwordField() {
        return AppiumBy.xpath("//android.widget.EditText[@index='3']");
    }

    private By loginButton() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }


    private By TrainingButton() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Training\"]");
    }


    private By BestHome() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Best Home Workout\n" +
                "5 Workouts\"]");
    }
    private By Fatburning() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Fat Burning\n" +
                "3 minutes\n" +
                "Beginner\"]");
    }
    private By StartButton() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Start\"]");
    }
    private By NextButton() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Next\"]");
    }
    private By SkipButton() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Skip\"]");
    }
    private By FinishButton() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Finish\"]");
    }
    private By Rate() {
        return AppiumBy.xpath("//android.widget.RadioButton[@index=16]");
    }
    private By DoneButton() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Done\"]");
    }

    @Step
    public void OnDashboard() {
        Assert.assertTrue(waitUntilVisible(loginButton()).isDisplayed());
    }

    @Step
    public void ClickEmail() {
        onClick(emailFiled());
    }

    @Step
    public void InputEmail(String email) {
        onType(emailFiled(), email);
    }

    @Step
    public void ClickPassword() {
        onClick(passwordField());
    }

    @Step
    public void InputPassword(String password) {
        onType(passwordField(), password);
    }

    @Step
    public void ClickLogin() {
        onClick(loginButton());
    }

    @Step
    public void ClickTraining() {
        onClick(TrainingButton());
    }

    @Step
    public void ClickBestHome() {
        onClick(BestHome());
    }
    @Step
    public void ClickFatBurning() {
        onClick(Fatburning());
    }
    @Step
    public void ClickStart() {
        onClick(StartButton());
    }
    @Step
    public void ClickNext() {
        onClick(NextButton());
    }
    @Step
    public void ClickSkip() {
        onClick(SkipButton());
    }
    @Step
    public void ClickFinish() {
        onClick(FinishButton());
    }
    @Step
    public void ClickRate() {
        onClick(Rate());
    }
    @Step
    public void ClickDone() {
        onClick(DoneButton());
    }
}

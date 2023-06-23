package starter.Screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class ArticlesScreen extends BasePageObject {
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


    private By viewall() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"View all\"]");
    }


    private By Mobile() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"MOBILE\"]");
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
    public void ClickViewAll() {
        onClick(viewall());
    }

    @Step
    public void ClickMobileArticles() {
        onClick(Mobile());
    }
}

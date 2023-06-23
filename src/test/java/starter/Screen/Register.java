package starter.Screen;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.But;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class Register extends BasePageObject {
    private By SignUpButton() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Sign Up\"]");
    }

    private By Username() {
        return AppiumBy.xpath("//android.widget.EditText[@index='2']");
    }

    private By emailFields() {
        return AppiumBy.xpath("//android.widget.EditText[@index='3']");
    }

    private By passwordFields() {
        return AppiumBy.xpath("//android.widget.EditText[@index='4']");
    }

    private By confirmPasswordField() {
        return AppiumBy.xpath("//android.widget.EditText[@index='5']");
    }

    private By registerButton() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Sign Up\"]");
    }
    private By registrationSuccess() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Email Verification\"]");
    }
    private By errorMessageEmail_() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Email address is Required\"]");
    }
    private By errorMessagePassword_() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Password is required\"]");
    }
    private By errorMessagePasswordNotMacth_() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"The password confirmation does not match\"]");
    }
    private By errorMessageUserName_() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Username cannot be blank\"]");
    }
    private By errorMessage() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Username must be between 3-25 characters\"]");
    }
    private By errorMessageAlphanumberic() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Username must be alphabetical only\"]");
    }
    public By Scroll () {
        return AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().index(6))");
    }





    @Step
    public void OnScreen(){
        Assert.assertTrue(waitUntilVisible(SignUpButton()).isDisplayed());
    }

    @Step
    public void ClickSignUp(){
        onClick(SignUpButton());
    }
    @Step
    public void inputName(String name){
        onType(Username(), name);
    }
    @Step
    public void inputEmailForRegister(String emails){
        onType(emailFields(),emails);
    }

    @Step
    public void inputPasswordForRegister(String passwords){
        onType(passwordFields(),passwords);
    }

    @Step
    public void inputConfirmPassword(String confirmPassword){
        onType(confirmPasswordField(), confirmPassword);
    }

    @Step
    public void tapRegisterButton(){
        onClick(registerButton());
    }

    @Step
    public String viewRegistrationSuccess(){
        return waitUntilVisible(registrationSuccess()).getText();
    }
    @Step
    public String errorMessageEmail(){
        return waitUntilVisible(errorMessageEmail_()).getText();
    }
    @Step
    public String errorMessagePassword(){
        return waitUntilVisible(errorMessagePassword_()).getText();
    }

    @Step
    public String errorMessageDoesNotMatch(){
        return waitUntilVisible(errorMessagePasswordNotMacth_()).getText();
    }
    @Step
    public String errorMessageUsername(){
        return waitUntilVisible(errorMessageUserName_()).getText();
    }
    @Step
    public String errorMessage_(){
        return waitUntilVisible(errorMessage()).getText();
    }
    @Step
    public String errorMessageNumberic(){
        return waitUntilVisible(errorMessageAlphanumberic()).getText();
    }
    @Step
    public void ClickUsername(){
        onClick(Username());
    }
    @Step
    public void ClickEmail(){
        onClick(emailFields());
    }
    @Step
    public void ClickPassword(){
        onClick(passwordFields());
    }
    @Step
    public void ClickConfirmPassword(){
        onClick(confirmPasswordField());

    }
    @Step
    public void Scrollview(){
        onClick(Scroll());

    }

    }


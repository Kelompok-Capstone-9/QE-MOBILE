package starter.Screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class JoinMembershipScreen extends BasePageObject {
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
    public By Scroll () {
        return AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().index(6))");
    }
    private By ButtonVerifycation() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Verify & Process\"]");
    }

    private By OTPfield() {
        return AppiumBy.xpath("//android.widget.EditText[@index='4']");
    }

    private By GenderMale() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Male\"]");
    }

    private By GenderFemale() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Female\"]");
    }

    private By ContinueButton() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Continue\"]");
    }

    private By InputHeight() {
        return AppiumBy.xpath("//android.widget.EditText[@index='3']");
    }

    private By InputWeight() {
        return AppiumBy.xpath("//android.widget.EditText[@index='3']");
    }

    private By Goal_weight() {
        return AppiumBy.xpath("//android.widget.EditText[@index='3']");
    }

    private By ChooseLevelBeginner() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Beginner\n" +
                "I want to start training\"]");
    }

    private By ChooseLevelIntermediate() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Intermediate\n" +
                "I train 3 - 5 times a week\"]");
    }

    private By ChooseLevelAdvance() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Advanced\n" +
                "I train more than 5 times a week\"]");
    }

    private By Permonth() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Rp 99.000\n" +
                "per month\n" +
                "1 Month\"]");
    }

    private By Per3Month() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Rp 199.000\n" +
                "per 3 months\n" +
                "3 Month\"]");
    }

    private By PerYears() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Rp 699.000\n" +
                "per year\n" +
                "1 Year\"]");
    }

    private By Gopay() {
        return AppiumBy.xpath("//android.widget.RadioButton[@bounds='[0,366][168,534]']");
    }

    private By Creditcard() {
        return AppiumBy.xpath("//android.widget.RadioButton[@bounds='[0,677][168,845]']");
    }

    private By ShoppePay() {
        return AppiumBy.xpath("//android.widget.RadioButton[@bounds='[0,989][168,1157]']");
    }

    private By PayButton() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Pay\"]");
    }

    private By CancelPayment() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Change payment\"]");
    }

    private By CancelOrder() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Cancel Order\"]");
    }

    private By MessageSucces() {
        return AppiumBy.xpath("//android.view.View[@index='1']");
    }
    private By SelecButton() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Select\"]");
    }
    private By Click_OTPfield() {
        return AppiumBy.xpath("//android.widget.EditText[@index='4']");
    }
    private By Click_Continue() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Continue\"]");
    }
    @Step
    public void ClickContinueLevel(){
        onClick(Click_Continue());
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
    public void VerifyButton() {
        onClick(ButtonVerifycation());
    }

    @Step
    public void InputOTP(String otp) {
        onType(OTPfield(), otp);
    }

    @Step
    public void GenderMale_() {
        onClick(GenderMale());
    }

    @Step
    public void GenderFemale_() {
        onClick(GenderFemale());
    }

    @Step
    public void clickCOntinue() {
        onClick(ContinueButton());
    }

    @Step
    public void InputHeight_(String height) {
        onType(InputHeight(), height);
    }

    @Step
    public void Inputweight_(String weight) {
        onType(InputWeight(), weight);
    }

    @Step
    public void InputGoalweight_(String Goalweight) {
        onType(Goal_weight(), Goalweight);
    }

    @Step
    public void Beginner() {
        onClick(ChooseLevelBeginner());
    }

    @Step
    public void Advance() {
        onClick(ChooseLevelAdvance());
    }

    @Step
    public void Intermedate() {
        onClick(ChooseLevelIntermediate());
    }

    @Step
    public void Month() {
        onClick(Permonth());
    }

    @Step
    public void treeMonth() {
        onClick(Per3Month());
    }

    @Step
    public void year() {
        onClick(PerYears());
    }

    @Step
    public void ClickGopay() {
        onClick(Gopay());
    }

    @Step
    public void ClickCreditCard() {
        onClick(Creditcard());
    }

    @Step
    public void ClickShoppePay() {
        onClick(ShoppePay());
    }

    @Step
    public void ClickPayButton() {
        onClick(PayButton());
    }
    @Step
    public void ClickCancelPayment() {
        onClick(CancelPayment());
    }
    @Step
    public void ClickCancelOrder() {
        onClick(CancelOrder());
    }
    @Step
    public void Message_Success() {
        onClick(MessageSucces());
    }
    @Step
    public void ClickSelect() {
        onClick(SelecButton());
    }
    @Step
    public void ClickFieldOTP(){
        onClick(Click_OTPfield());
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
    @Step
    public void ClickInputWeght(){
        onClick(InputWeight());

    }
    @Step
    public void ClickInputHeght(){
        onClick(InputHeight());

    }
    @Step
    public void ClickInputWeghtGoal(){
        onClick(Goal_weight());

    }




}







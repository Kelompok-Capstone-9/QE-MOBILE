package starter.Screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class BookOfflineScreen extends BasePageObject {
    private By emailFiled() {
        return AppiumBy.xpath("//android.widget.EditText[@index='2']");
    }

    private By passwordField() {
        return AppiumBy.xpath("//android.widget.EditText[@index='3']");
    }

    private By loginButton() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    private By goFitTitle(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"GoFit\"]");
    }

    private By exploreMenu(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Explore\"]");
    }

    private By exploreTitle(){
        return AppiumBy.xpath("(//android.view.View[@content-desc='Explore'])[1]");
    }

    private By offlineClassBookButton(){
        return AppiumBy.xpath("(//android.view.View[@content-desc=\"Book\"])[2]");
    }

    private By packageSelect(){
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"79.000\n" +
                "/monthly\"]");
    }

    private By bookingNowButton(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Booking Now !\"]");
    }

    private By paymentMethodSelectButton(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Select payment\"]");
    }

    private By creditCardPaymentMethod(){
        return AppiumBy.xpath("(//*[contains(@class,'RadioButton')])[2]");
    }

    private By selectButton(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Select\"]");
    }

    private By continueToPaymentButton(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Continue to payment\"]");
    }

    private By payNowButton(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Pay Now\"]");
    }

    private By cardNumberField(){
        return AppiumBy.xpath("(//*[contains(@class,'EditText')])[1]");
    }

    private By validityPeriodField(){
        return AppiumBy.xpath("(//*[contains(@class,'EditText')])[2]");
    }

    private By cvvField(){
        return AppiumBy.xpath("(//*[contains(@class,'EditText')])[3]");
    }

    private By buttonPayNow(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Pay Now\"]");
    }

    private By successfullyPaymentPopUp(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Payment Successful!\n" +
                "Hooray! You have completed your payment.\n" +
                "Amount Paid!\n" +
                "Rp. 79.000\n" +
                "Go to details\"]");
    }

    private By session(){
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Siang\n" +
                "12PM - 5PM\"]");
    }

    private By enterYourLocationField(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Your location\n" +
                "Enter your location\"]");
    }

    private By searchGymLocationField(){
        return AppiumBy.xpath("//android.widget.EditText[@index='1']");
    }

    private By locationResult(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Jl. Zaenal Arifin\n" +
                "Medan\"]");
    }

    @Step
    public void onLoginScreen() {
        Assert.assertTrue(waitUntilVisible(loginButton()).isDisplayed());
    }

    @Step
    public void clickEmailField() {
        onClick(emailFiled());
    }

    @Step
    public void inputEmail(String email) {
        onType(emailFiled(), email);
    }

    @Step
    public void clickPasswordField() {
        onClick(passwordField());
    }

    @Step
    public void inputPassword(String password) {
        onType(passwordField(), password);
    }

    @Step
    public void clickLoginButton() {
        onClick(loginButton());
    }

    @Step
    public void onHomeScreen(){
        Assert.assertTrue(waitUntilVisible(goFitTitle()).isDisplayed());
    }

    @Step
    public void clickExploreMenu(){
        onClick(exploreMenu());
    }

    @Step
    public void onExploreScreen(){
        Assert.assertTrue(waitUntilVisible(exploreTitle()).isDisplayed());
    }

    @Step
    public void clickOfflineClassBookButton(){
        onClick(offlineClassBookButton());
    }

    @Step
    public void selectPackage(){
        onClick(packageSelect());
    }

    @Step
    public void clickBookingNowButton(){
        onClick(bookingNowButton());
    }

    @Step
    public void clickSelectPaymentMethodButton(){
        onClick(paymentMethodSelectButton());
    }

    @Step
    public void selectPaymentMethod(){
        onClick(creditCardPaymentMethod());
    }

    @Step
    public void clickSelectButton(){
        onClick(selectButton());
    }

    @Step
    public void clickContinueToPaymentButton(){
        onClick(continueToPaymentButton());
    }

    @Step
    public void clickPayNowButton(){
        onClick(payNowButton());
    }

    @Step
    public void clickCardNumberField(){
        onClick(cardNumberField());
    }

    @Step
    public void inputCardNumber(String cardNumber){
        onType(cardNumberField(), cardNumber);
    }

    @Step
    public void clickValidityPeriodField(){
        onClick(validityPeriodField());
    }

    @Step
    public void inputValidityPeriod(String validityPeriod){
        onType(validityPeriodField(), validityPeriod);
    }

    @Step
    public void clickCvvField(){
        onClick(cvvField());
    }

    @Step
    public void inputCvv(String cvv){
        onType(cvvField(), cvv);
        driver.getAndroidDriver().hideKeyboard();
    }

    @Step
    public void clickPayNowAgainButton(){
        onClick(buttonPayNow());
    }

    @Step
    public void seeSuccessfullyPaymentPopUp(){
        Assert.assertTrue(waitUntilVisible(successfullyPaymentPopUp()).isDisplayed());
    }

    @Step
    public void selectSession(){
        onClick(session());
    }

    @Step
    public void clickEnterYourLocationField(){
        onClick(enterYourLocationField());
    }

    @Step
    public void clickSearchGymLocationField(){
        onClick(searchGymLocationField());
    }

    @Step
    public void inputSearchGymLocation(String location){
        onType(searchGymLocationField(), location);
    }

    @Step
    public void clickLocationResult() {
        onClick(locationResult());
    }
}

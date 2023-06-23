package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Screen.ArticlesScreen;

public class ArticlesSteps {
    @Steps
    ArticlesScreen articlesScreen;
    @Given("user on {string}")
    public void userOn(String arg0) {
        articlesScreen.OnDashboard();
        articlesScreen.ClickEmail();
        articlesScreen.InputEmail("din@gmail.com");
        articlesScreen.ClickPassword();
        articlesScreen.InputPassword("Din@gmail.com1");
        articlesScreen.ClickLogin();
    }

    @When("user click {string} in homepage")
    public void userClickInHomepage(String arg0) {
        articlesScreen.ClickViewAll();
    }

    @Then("user can see all articles")
    public void userCanSeeAllArticles() {
        System.out.println("user can see all articles");
    }

    @And("user click {string} articles")
    public void userClickArticles(String arg0) {
        articlesScreen.ClickMobileArticles();
    }

    @Then("user can detail articles")
    public void userCanDetailArticles() {
        System.out.println("user can detail articles");
    }
}

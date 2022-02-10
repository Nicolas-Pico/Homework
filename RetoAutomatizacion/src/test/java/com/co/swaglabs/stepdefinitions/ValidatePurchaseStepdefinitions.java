package com.co.swaglabs.stepdefinitions;

import com.co.swaglabs.questions.ValidateMessageFinalQuestions;
import com.co.swaglabs.tasks.ValidatePurchaseTasks;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidatePurchaseStepdefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void serThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Andrey");
    }

    @Given("^User is on the home page$")
    public void userIsOnTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("^User wants to buy several products$")
    public void userWantsToBuySeveralProducts() {
        theActorInTheSpotlight().attemptsTo(ValidatePurchaseTasks.validateTask());
    }

    @Then("^User sees (.*)$")
    public void userSeesTHANKYOUFORYOURORDER(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessageFinalQuestions.match(), Matchers.is(Matchers.equalTo(message))));
    }
}

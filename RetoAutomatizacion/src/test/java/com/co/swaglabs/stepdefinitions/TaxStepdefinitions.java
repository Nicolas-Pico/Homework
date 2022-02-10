package com.co.swaglabs.stepdefinitions;

import com.co.swaglabs.questions.ValidateMessageTaxQuestions;
import com.co.swaglabs.tasks.TaxTasks;
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

public class TaxStepdefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void serThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("William");
    }

    @Given("^William is on the home page$")
    public void williamIsOnTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("^William wants to buy products$")
    public void williamWantsToBuyProducts() {
        theActorInTheSpotlight().attemptsTo(TaxTasks.taxTask());
    }

    @Then("^William sees its a message (.*)$")
    public void williamSeesItsAMessageTax$(String tax) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessageTaxQuestions.match(), Matchers.is(Matchers.equalTo(tax))));
    }
}

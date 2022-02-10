package com.co.swaglabs.stepdefinitions;

import com.co.swaglabs.questions.ValidateMessageTotalPriceQuestions;
import com.co.swaglabs.tasks.TotalPriceTasks;
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

public class TotalPriceStepdefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void serThestege(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Sara");
    }

    @Given("^Sara is on the home page$")
    public void saraIsOnTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("^Sara wants to buy products$")
    public void saraWantsToBuyProducts() {
        theActorInTheSpotlight().attemptsTo(TotalPriceTasks.totaltask());
    }

    @Then("^Sara sees its a message (.*)$")
    public void saraSeesItsAMessageTotal$(String total) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessageTotalPriceQuestions.match(), Matchers.is(Matchers.equalTo(total))));
    }
}

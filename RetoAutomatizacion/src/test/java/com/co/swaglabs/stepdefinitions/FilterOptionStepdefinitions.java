package com.co.swaglabs.stepdefinitions;

import com.co.swaglabs.questions.ValidateMessagePriceQuestion;
import com.co.swaglabs.tasks.FilterOptionTasks;
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

public class FilterOptionStepdefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void serThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Jorge");
    }

    @Given("^Jorge is on the home page$")
    public void jorgeIsOnTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("^Jorge wants validate filter options$")
    public void jorgeWantsValidateFilterOptions() {
        theActorInTheSpotlight().attemptsTo(FilterOptionTasks.filtertask());
    }

    @Then("^Jorge sees the item with the highest price first (.*)$")
    public void jorgeSeesTheItemWithTheHighestPriceFirst(String number) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessagePriceQuestion.match(), Matchers.is(Matchers.equalTo(number))));
    }
}

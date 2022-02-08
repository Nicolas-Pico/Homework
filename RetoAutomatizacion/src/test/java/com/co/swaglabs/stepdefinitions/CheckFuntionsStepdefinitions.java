package com.co.swaglabs.stepdefinitions;

import com.co.swaglabs.questions.ValidateMessageQuestions;
import com.co.swaglabs.tasks.CheckFuntionsTasks;
import com.co.swaglabs.tasks.ShoppingCartTasks;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CheckFuntionsStepdefinitions {

    @Before
    public void serThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Andrey");
    }

    @Given("^Andrey is on the SWAGLABS page$")
    public void andreyIsOnTheSWAGLABSPage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("^Andrey wants to check that page is working$")
    public void andreyWantsToCheckThatPageIsWorking() {
        theActorInTheSpotlight().attemptsTo(CheckFuntionsTasks.funtionsTask());
    }

    @Then("^user cheks that the page works well$")
    public void userCheksThatThePageWorksWell() {

    }
}

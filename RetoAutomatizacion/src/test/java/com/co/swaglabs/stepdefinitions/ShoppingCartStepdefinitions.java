package com.co.swaglabs.stepdefinitions;

import com.co.swaglabs.questions.ValidateMessageQuestions;
import com.co.swaglabs.tasks.ShoppingCartTasks;
/*import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;*/
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

public class ShoppingCartStepdefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void serThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Andrey");
    }

    @Given("^Andrey is on the home page$")
    public void andreyIsOnTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("^Andrey wants to buy products$")
    public void andreyWantsToBuyProducts() {
        theActorInTheSpotlight().attemptsTo(ShoppingCartTasks.cartTask());
    }

    @Then("^user sees its a message (.*)$")
    public void userSeesItsAMessage(String letter) { OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessageQuestions.match(), Matchers.is(Matchers.equalTo(letter))));
    }
}

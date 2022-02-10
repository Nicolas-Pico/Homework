package com.co.swaglabs.stepdefinitions;

import com.co.swaglabs.questions.ValidateMessageFinalQuestions;
import com.co.swaglabs.questions.ValidateMessageUserLockedQuestions;
import com.co.swaglabs.questions.ValidateMessageUserProblemQuestion;
import com.co.swaglabs.tasks.UsersTask;
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

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UsersStepdefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void serThestage(){
    OnStage.setTheStage(new OnlineCast());
    OnStage.theActorCalled("Nicolas");
    }

    @Given("^Nicolas is on the home page$")
    public void nicolasIsOnTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }


    @When("^Nicolas enter the following data$")
    public void nicolasEnterTheFollowingData(Map<String, String> mapVariable) {
        theActorInTheSpotlight().attemptsTo(UsersTask.userTask(mapVariable));
    }

    @Then("^Nicolas sees its a message$")
    public void nicolasSeesItsAMessage(Map<String, String> mapVariable) {
        if(mapVariable.get("Username").contains("standard_user")){
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessageFinalQuestions.match(), Matchers.is(Matchers.equalTo(mapVariable.get("Message")))));
        }else{
            if(mapVariable.get("Username").contains("locked_out_user")){
                OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessageUserLockedQuestions.match(), Matchers.is(Matchers.equalTo(mapVariable.get("Message")))));
            }else{
                if(mapVariable.get("Username").contains("problem_user")){
                    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessageUserProblemQuestion.match(), Matchers.is(Matchers.equalTo(mapVariable.get("Message")))));
                }else{
                    if(mapVariable.get("Username").contains("problem_user")){
                        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessageFinalQuestions.match(), Matchers.is(Matchers.equalTo(mapVariable.get("Message")))));
                    }
                }
            }
        }
    }
}

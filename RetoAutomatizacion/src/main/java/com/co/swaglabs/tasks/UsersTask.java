package com.co.swaglabs.tasks;

import com.co.swaglabs.interactions.UserStandardInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UsersTask implements Task {

    private final Map<String, String> mapVariable;

    public UsersTask(Map<String, String> mapVariable) {
        this.mapVariable = mapVariable;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                UserStandardInteractions.standardInteraction(mapVariable)
        );
    }
    public static UsersTask userTask(Map<String, String> mapVariable){
        return instrumented(UsersTask.class, mapVariable);
    }
}

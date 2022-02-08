package com.co.swaglabs.tasks;

import com.co.swaglabs.interactions.FuntionsInteractions;
import com.co.swaglabs.interactions.LoginInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class CheckFuntionsTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LoginInteractions.cartInteraction(),
                FuntionsInteractions.checkInteraction()
        );
    }
    public static CheckFuntionsTasks funtionsTask(){
        return Tasks.instrumented(CheckFuntionsTasks.class);
    }
}

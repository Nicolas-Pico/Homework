package com.co.swaglabs.tasks;

import com.co.swaglabs.interactions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ValidatePurchaseTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LoginInteractions.cartInteraction(),
                JacketInteractions.jacketInteraction(),
                OnesieInteractions.OnesieInteration(),
                TshirtInteractions.tshirtInteraction(),
                CartInteractions.shopp()
        );
    }
    public static ValidatePurchaseTasks validateTask(){
        return Tasks.instrumented(ValidatePurchaseTasks.class);
    }
}

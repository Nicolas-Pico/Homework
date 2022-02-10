package com.co.swaglabs.tasks;

import com.co.swaglabs.interactions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class TaxTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LoginInteractions.cartInteraction(),
                OnesieInteractions.OnesieInteration(),
                TshirtInteractions.tshirtInteraction(),
                CartInteractions2.shoppingCart()
        );
    }
    public static TaxTasks taxTask(){
        return Tasks.instrumented(TaxTasks.class);
    }
}

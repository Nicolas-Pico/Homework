package com.co.swaglabs.tasks;

import com.co.swaglabs.interactions.BagInteractions;
import com.co.swaglabs.interactions.LoginInteractions;
import com.co.swaglabs.interactions.ShirtInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ShoppingCartTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               LoginInteractions.cartInteraction(),
               BagInteractions.bagInteraction(),
               ShirtInteractions.shirtInteraction()
       );
    }
    public static ShoppingCartTasks cartTask(){
        return Tasks.instrumented(ShoppingCartTasks.class);
    }
}

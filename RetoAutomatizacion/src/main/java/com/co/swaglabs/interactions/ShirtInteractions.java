package com.co.swaglabs.interactions;

import com.co.swaglabs.userinterfaces.ShirtUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.swaglabs.userinterfaces.ShirtUserInterfaces.*;

public class ShirtInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SHIRT),
                Click.on(BTN_ADDTOCART1),
                Click.on(BTN_CART)
        );
    }
    public static ShirtInteractions shirtInteraction(){
        return Tasks.instrumented(ShirtInteractions.class);
    }
}

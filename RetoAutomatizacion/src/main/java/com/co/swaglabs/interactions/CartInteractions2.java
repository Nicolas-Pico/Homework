package com.co.swaglabs.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.swaglabs.userinterfaces.CartUserInterfaces.*;

public class CartInteractions2 implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CART),
                Click.on(BTN_CHECKOUT),
                Enter.keyValues("Andrey").into(BTN_FIRSTNAME),
                Enter.keyValues("Daza").into(BTN_LASTNAME),
                Enter.keyValues("123456").into(BTN_POSTCODE),
                Click.on(BTN_CONTINUE)
        );
    }
    public static CartInteractions2 shoppingCart() {
        return Tasks.instrumented(CartInteractions2.class);
    }
}


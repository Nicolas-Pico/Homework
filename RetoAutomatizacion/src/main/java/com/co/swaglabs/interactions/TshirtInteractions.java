package com.co.swaglabs.interactions;

import com.co.swaglabs.userinterfaces.TshirtUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.swaglabs.userinterfaces.TshirtUserInterfaces.*;

public class TshirtInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_TSHIRT),
                Click.on(BTN_ADDTOCART4),
                Click.on(BTN_BACKTOPRODUCT4)
        );
    }
    public static TshirtInteractions tshirtInteraction(){
        return Tasks.instrumented(TshirtInteractions.class);
    }
}

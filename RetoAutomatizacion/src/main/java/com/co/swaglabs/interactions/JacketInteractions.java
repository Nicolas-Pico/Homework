package com.co.swaglabs.interactions;

import com.co.swaglabs.userinterfaces.JacketUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.swaglabs.userinterfaces.JacketUserInterfaces.*;

public class JacketInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_JACKET),
                Click.on(BTN_ADDTOCART2),
                Click.on(BTN_BACKTOPRODUCTS2)
        );
    }
    public static JacketInteractions jacketInteraction(){
        return Tasks.instrumented(JacketInteractions.class);
    }
}

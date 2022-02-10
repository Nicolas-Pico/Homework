package com.co.swaglabs.interactions;

import com.co.swaglabs.userinterfaces.OnesieUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.swaglabs.userinterfaces.OnesieUserInterfaces.*;

public class OnesieInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ONESIE),
                Click.on(BTN_ADDTOCART3),
                Click.on(BTN_BACKTOPRODUCTS3)
        );
    }
    public static OnesieInteractions OnesieInteration(){
        return Tasks.instrumented(OnesieInteractions.class);
    }
}

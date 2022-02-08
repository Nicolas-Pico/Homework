package com.co.swaglabs.interactions;

import com.co.swaglabs.userinterfaces.BagUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.swaglabs.userinterfaces.BagUserInterfaces.*;

public class BagInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BAG),
                Click.on(BTN_ADDTOCART),
                Click.on(BTN_BACKTOPRODUCTS)
        );
    }
    public static BagInteractions bagInteraction(){
        return Tasks.instrumented(BagInteractions.class);
    }
}

package com.co.swaglabs.interactions;

import com.co.swaglabs.userinterfaces.FuntionsUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.swaglabs.userinterfaces.FuntionsUserInterfaces.*;

public class FuntionsInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BAG1),
                Click.on(BTN_BACKTOPRODUCTS1),
                Click.on(BTN_LED),
                Click.on(BTN_BACKTOPRODUCTS2),
                Click.on(BTN_SHIRT1),
                Click.on(BTN_BACKTOPRODUCTS3),
                Click.on(BTN_JACKET),
                Click.on(BTN_BACKTOPRODUCTS4),
                Click.on(BTN_ONESIE),
                Click.on(BTN_BACKTOPRODUCTS5),
                Click.on(BTN_TSHIRT),
                Click.on(BTN_BACKTOPRODUCTS6),
                Click.on(BTN_SELECT),
                Click.on(BTN_OPTION1),
                Click.on(BTN_SELECT),
                Click.on(BTN_OPTION2),
                Click.on(BTN_SELECT),
                Click.on(BTN_OPTION3),
                Click.on(BTN_SELECT),
                Click.on(BTN_OPTION4),
                Click.on(BTN_CART1),
                Click.on(BTN_CONTINUESHOPPING)
        );
    }
    public static FuntionsInteractions checkInteraction(){
        return Tasks.instrumented(FuntionsInteractions.class);
    }
}

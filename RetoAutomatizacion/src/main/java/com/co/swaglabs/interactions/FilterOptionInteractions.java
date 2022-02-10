package com.co.swaglabs.interactions;

import com.co.swaglabs.userinterfaces.FilterOptionUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.swaglabs.userinterfaces.FilterOptionUserInterfaces.*;

public class FilterOptionInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_FILTER),
                Click.on(BTN_SELECT_ZA),
                Click.on(BTN_FILTER),
                Click.on(BTN_SELECT_AZ),
                Click.on(BTN_FILTER),
                Click.on(BTN_SELECT_LH),
                Click.on(BTN_FILTER),
                Click.on(BTN_SELECT_HL)
        );
    }
    public static FilterOptionInteractions optionInteraction(){
        return Tasks.instrumented(FilterOptionInteractions.class);
    }
}

package com.co.swaglabs.interactions;

import com.co.swaglabs.userinterfaces.FuntionsUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.swaglabs.userinterfaces.FuntionsUserInterfaces.*;
import static com.co.swaglabs.userinterfaces.LoginUserInterfaces.*;

public class FuntionsInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CART1),
                Click.on(BTN_MENU),
                Click.on(BTN_ALLITEMS),
                Click.on(BTN_ADDBAG),
                Click.on(BTN_ADDLED),
                Click.on(BTN_ADDSHIRT),
                Click.on(BTN_ADDJACKET),
                Click.on(BTN_MENU),
                Click.on(BTN_RESETAPPSTATE),
                Click.on(BTN_LOGOUT),
                Enter.keyValues("standard_user").into(TXT_USERNAME),
                Enter.keyValues("secret_sauce").into(TXT_PASSWORD),
                Click.on(BTN_LOGGIN),
                Click.on(BTN_MENU),
                Click.on(BTN_ABOUT)
        );
    }
    public static FuntionsInteractions checkInteraction(){
        return Tasks.instrumented(FuntionsInteractions.class);
    }
}

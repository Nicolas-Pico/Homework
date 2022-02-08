package com.co.swaglabs.interactions;

import com.co.swaglabs.userinterfaces.BagUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.swaglabs.userinterfaces.BagUserInterfaces.*;
import static com.co.swaglabs.userinterfaces.LoginUserInterfaces.*;

public class LoginInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues("standard_user").into(TXT_USERNAME),
                Enter.keyValues("secret_sauce").into(TXT_PASSWORD),
                Click.on(BTN_LOGGIN)
        );
    }
    public static LoginInteractions cartInteraction(){
        return Tasks.instrumented(LoginInteractions.class);
    }
}

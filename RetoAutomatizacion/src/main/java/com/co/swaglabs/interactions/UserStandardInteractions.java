package com.co.swaglabs.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.co.swaglabs.userinterfaces.BagUserInterfaces.*;
import static com.co.swaglabs.userinterfaces.CartUserInterfaces.*;
import static com.co.swaglabs.userinterfaces.LoginUserInterfaces.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserStandardInteractions implements Interaction {

    private final Map<String, String> mapVariable;

    public UserStandardInteractions(Map<String, String> mapVariable) {
        this.mapVariable = mapVariable;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(mapVariable.get("Username").contains("standard_user")){
            actor.attemptsTo(
                    Enter.theValue(mapVariable.get("Username")).into(TXT_USERNAME),
                    Enter.theValue(mapVariable.get("Password")).into(TXT_PASSWORD),
                    Click.on(BTN_LOGGIN),
                    Click.on(BTN_ADDTOCART),
                    Click.on(BTN_CART),
                    Click.on(BTN_CHECKOUT),
                    Enter.theValue(mapVariable.get("Firstname")).into(BTN_FIRSTNAME),
                    Enter.theValue(mapVariable.get("Lastname")).into(BTN_LASTNAME),
                    Enter.theValue(mapVariable.get("Postalcode")).into(BTN_POSTCODE),
                    Click.on(BTN_CONTINUE),
                    Click.on(BTN_FINISH)
            );
        }else{
            if(mapVariable.get("Username").contains("locked_out_user")){
                actor.attemptsTo(
                        Enter.theValue(mapVariable.get("Username")).into(TXT_USERNAME),
                        Enter.theValue(mapVariable.get("Password")).into(TXT_PASSWORD),
                        Click.on(BTN_LOGGIN)
                );
            }else{
                if(mapVariable.get("Username").contains("problem_user")){
                    actor.attemptsTo(
                            Enter.theValue(mapVariable.get("Username")).into(TXT_USERNAME),
                            Enter.theValue(mapVariable.get("Password")).into(TXT_PASSWORD),
                            Click.on(BTN_LOGGIN),
                            Click.on(BTN_ADDTOCART),
                            Click.on(BTN_CART),
                            Click.on(BTN_CHECKOUT),
                            Enter.theValue(mapVariable.get("Firstname")).into(BTN_FIRSTNAME),
                            Enter.theValue(mapVariable.get("Lastname")).into(BTN_LASTNAME),
                            Enter.theValue(mapVariable.get("Postalcode")).into(BTN_POSTCODE),
                            Click.on(BTN_CONTINUE)
                    );
                }else{
                    if(mapVariable.get("Username").contains("performance_glitch_user")){
                        actor.attemptsTo(
                                Enter.theValue(mapVariable.get("Username")).into(TXT_USERNAME),
                                Enter.theValue(mapVariable.get("Password")).into(TXT_PASSWORD),
                                Click.on(BTN_LOGGIN),
                                Click.on(BTN_ADDTOCART),
                                Click.on(BTN_CART),
                                Click.on(BTN_CHECKOUT),
                                Enter.theValue(mapVariable.get("Firstname")).into(BTN_FIRSTNAME),
                                Enter.theValue(mapVariable.get("Lastname")).into(BTN_LASTNAME),
                                Enter.theValue(mapVariable.get("Postalcode")).into(BTN_POSTCODE),
                                Click.on(BTN_CONTINUE),
                                Click.on(BTN_FINISH)
                        );
                    }
                }
            }
        }
    }
    public static UserStandardInteractions standardInteraction(Map<String, String> mapVariable){
        return instrumented(UserStandardInteractions.class, mapVariable);
    }
}


package com.co.swaglabs.tasks;

import com.co.swaglabs.interactions.BagInteractions;
import com.co.swaglabs.interactions.CartInteractions2;
import com.co.swaglabs.interactions.JacketInteractions;
import com.co.swaglabs.interactions.LoginInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.swaglabs.userinterfaces.ValidationMessagesUserInterfaces.*;

public class TotalPriceTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LoginInteractions.cartInteraction(),
                JacketInteractions.jacketInteraction(),
                BagInteractions.bagInteraction(),
                CartInteractions2.shoppingCart(),
                Scroll.to(LBL_VERIFICATION_MESSAGE_TOTAL)
        );
    }
    public static TotalPriceTasks totaltask(){
        return Tasks.instrumented(TotalPriceTasks.class);
    }
}

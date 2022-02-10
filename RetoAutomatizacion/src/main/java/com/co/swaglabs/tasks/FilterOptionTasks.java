package com.co.swaglabs.tasks;

import com.co.swaglabs.interactions.FilterOptionInteractions;
import com.co.swaglabs.interactions.LoginInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FilterOptionTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LoginInteractions.cartInteraction(),
                FilterOptionInteractions.optionInteraction()
        );
    }
    public static FilterOptionTasks filtertask(){
        return Tasks.instrumented(FilterOptionTasks.class);
    }
}

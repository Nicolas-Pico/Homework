package com.co.swaglabs.questions;

import com.co.swaglabs.userinterfaces.ShirtUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateMessageQuestions implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ShirtUserInterfaces.LBL_VERIFICATION_MESSAGE).viewedBy(actor).asString();
    }
    public static ValidateMessageQuestions match() {
        return new ValidateMessageQuestions();
    }
}




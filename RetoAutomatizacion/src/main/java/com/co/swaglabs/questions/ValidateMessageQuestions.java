package com.co.swaglabs.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.swaglabs.userinterfaces.ValidationMessagesUserInterfaces.*;

public class ValidateMessageQuestions implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_VERIFICATION_MESSAGE).viewedBy(actor).asString();
    }
    public static ValidateMessageQuestions match() {
        return new ValidateMessageQuestions();
    }
}




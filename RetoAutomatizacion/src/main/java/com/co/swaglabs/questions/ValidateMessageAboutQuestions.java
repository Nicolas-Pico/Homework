package com.co.swaglabs.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.swaglabs.userinterfaces.ValidationMessagesUserInterfaces.*;

public class ValidateMessageAboutQuestions implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_VERIFICATION_MESSAGE_ABOUT).viewedBy(actor).asString();
    }
    public static ValidateMessageAboutQuestions match() {
        return new ValidateMessageAboutQuestions();
    }
}




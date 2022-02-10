package com.co.swaglabs.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.swaglabs.userinterfaces.ValidationMessagesUserInterfaces.*;


public class ValidateMessagePriceQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_VERIFICATION_MESSAGE_PRICE).viewedBy(actor).asString();
    }
    public static ValidateMessagePriceQuestion match(){
        return new ValidateMessagePriceQuestion();
    }
}

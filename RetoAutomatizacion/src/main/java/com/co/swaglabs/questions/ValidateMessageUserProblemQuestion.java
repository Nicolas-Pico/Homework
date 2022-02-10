package com.co.swaglabs.questions;

import com.co.swaglabs.userinterfaces.ValidationMessagesUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.swaglabs.userinterfaces.ValidationMessagesUserInterfaces.*;

public class ValidateMessageUserProblemQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_VERIFICATION_MESSAGE_ERROR).viewedBy(actor).asString();
    }
    public static ValidateMessageUserProblemQuestion match(){
        return new ValidateMessageUserProblemQuestion();
    }
}

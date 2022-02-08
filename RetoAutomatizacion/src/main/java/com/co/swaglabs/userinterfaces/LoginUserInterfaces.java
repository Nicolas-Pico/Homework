package com.co.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUserInterfaces {
    public static final Target TXT_USERNAME = Target.the("Enter Username").located(By.id("user-name"));
    public static final Target TXT_PASSWORD = Target.the("Enter Password").located(By.id("password"));
    public static final Target BTN_LOGGIN = Target.the("Click Button Login").located(By.id("login-button"));
}

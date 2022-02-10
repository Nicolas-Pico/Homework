package com.co.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartUserInterfaces {
    public static final Target BTN_CART = Target.the("Click Cart").located(By.id("shopping_cart_container"));
    public static final Target BTN_CHECKOUT = Target.the("Click Checkout").located(By.id("checkout"));
    public static final Target BTN_FIRSTNAME = Target.the("Click Firstname").located(By.id("first-name"));
    public static final Target BTN_LASTNAME = Target.the("Click Lastname").located(By.id("last-name"));
    public static final Target BTN_POSTCODE = Target.the("Click Postcode").located(By.id("postal-code"));
    public static final Target BTN_CONTINUE = Target.the("Click Continue").located(By.id("continue"));
    public static final Target BTN_FINISH = Target.the("Click Finish").located(By.id("finish"));
}

package com.co.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TshirtUserInterfaces {
    public static final Target BTN_TSHIRT = Target.the("Click Tshirt").located(By.id("item_3_title_link"));
    public static final Target BTN_ADDTOCART4 = Target.the("Click Add To Cart").located(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
    public static final Target BTN_BACKTOPRODUCT4 = Target.the("Click Back To Product").located(By.id("back-to-products"));
}

package com.co.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class JacketUserInterfaces {
    public static final Target BTN_JACKET = Target.the("Click Jacket").located(By.id("item_5_title_link"));
    public static final Target BTN_ADDTOCART2 = Target.the("Click Add To Cart").located(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    public static final Target BTN_BACKTOPRODUCTS2 = Target.the("Click Button Back Products").located(By.id("back-to-products"));
}

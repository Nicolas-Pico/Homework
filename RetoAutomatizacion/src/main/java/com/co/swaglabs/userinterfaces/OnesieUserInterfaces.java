package com.co.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OnesieUserInterfaces {
    public static final Target BTN_ONESIE = Target.the("Click Onesie").located(By.id("item_2_title_link"));
    public static final Target BTN_ADDTOCART3 = Target.the("Click Add To Cart").located(By.id("add-to-cart-sauce-labs-onesie"));
    public static final Target BTN_BACKTOPRODUCTS3 = Target.the("Click Back To Products").located(By.id("back-to-products"));

}

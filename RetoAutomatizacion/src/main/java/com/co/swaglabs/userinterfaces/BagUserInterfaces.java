package com.co.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BagUserInterfaces {
    public static final Target BTN_BAG = Target.the("Click Bag").located(By.id("item_4_title_link"));
    public static final Target BTN_ADDTOCART = Target.the("Click Add To Cart").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target BTN_BACKTOPRODUCTS = Target.the("Click Button Back Products").located(By.id("back-to-products"));
}

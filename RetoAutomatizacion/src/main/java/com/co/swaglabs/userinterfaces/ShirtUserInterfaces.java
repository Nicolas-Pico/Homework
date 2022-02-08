package com.co.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShirtUserInterfaces {
    public static final Target BTN_SHIRT = Target.the("Click Shirt").located(By.id("item_1_title_link"));
    public static final Target BTN_ADDTOCART1 = Target.the("Click Add To Cart").located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    public static final Target BTN_CART = Target.the("Click Cart").located(By.id("shopping_cart_container"));
    public static final Target LBL_VERIFICATION_MESSAGE = Target.the("Verification message").located(By.xpath("//span[@class=\"title\"]"));
}

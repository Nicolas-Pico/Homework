package com.co.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FuntionsUserInterfaces {
    public static final Target BTN_CART1 = Target.the("Click Cart").located(By.id("shopping_cart_container"));
    public static final Target BTN_MENU = Target.the("Click Menu").located(By.id("react-burger-menu-btn"));
    public static final Target BTN_ALLITEMS = Target.the("Click All Items").located(By.id("inventory_sidebar_link"));
    public static final Target BTN_ABOUT = Target.the("Click About").located(By.id("about_sidebar_link"));
    public static final Target BTN_RESETAPPSTATE = Target.the("Click Reset App State").located(By.id("reset_sidebar_link"));
    public static final Target BTN_ADDBAG = Target.the("Click Add Bag").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target BTN_ADDLED = Target.the("Click Add Led").located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target BTN_ADDSHIRT = Target.the("Click Add Shirt").located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    public static final Target BTN_ADDJACKET = Target.the("Click Add Jacket").located(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    public static final Target BTN_LOGOUT = Target.the("Click Logout").located(By.id("logout_sidebar_link"));
}



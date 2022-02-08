package com.co.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FuntionsUserInterfaces {
    public static final Target BTN_BAG1 = Target.the("Click Bag").located(By.id("item_4_title_link"));
    public static final Target BTN_BACKTOPRODUCTS1 = Target.the("Click Button Back Products").located(By.id("back-to-products"));
    public static final Target BTN_LED = Target.the("Click Led").located(By.id("item_0_title_link"));
    public static final Target BTN_BACKTOPRODUCTS2 = Target.the("Click Button Back Products").located(By.id("back-to-products"));
    public static final Target BTN_SHIRT1 = Target.the("Click Shirt").located(By.id("item_1_title_link"));
    public static final Target BTN_BACKTOPRODUCTS3 = Target.the("Click Button Back Products").located(By.id("back-to-products"));
    public static final Target BTN_JACKET = Target.the("Click Jacket").located(By.id("item_5_title_link"));
    public static final Target BTN_BACKTOPRODUCTS4 = Target.the("Click Button Back Products").located(By.id("back-to-products"));
    public static final Target BTN_ONESIE = Target.the("Click Onesie").located(By.id("item_2_title_link"));
    public static final Target BTN_BACKTOPRODUCTS5 = Target.the("Click Button Back Products").located(By.id("back-to-products"));
    public static final Target BTN_TSHIRT = Target.the("Click Tshirt").located(By.id("item_3_title_link"));
    public static final Target BTN_BACKTOPRODUCTS6 = Target.the("Click Button Back Products").located(By.id("back-to-products"));
    public static final Target BTN_SELECT = Target.the("Click Button Select").located(By.xpath("//select[@class=\"product_sort_container\"]"));
    public static final Target BTN_OPTION1 = Target.the("Click Button Option1").located(By.xpath("//option[@value=\"az\"]"));
    public static final Target BTN_OPTION2 = Target.the("Click Button Option2").located(By.xpath("//option[@value=\"za\"]"));
    public static final Target BTN_OPTION3 = Target.the("Click Button Option3").located(By.xpath("//option[@value=\"lohi\"]"));
    public static final Target BTN_OPTION4 = Target.the("Click Button Option4").located(By.xpath("//option[@value=\"hilo\"]"));
    public static final Target BTN_CART1 = Target.the("Click Cart").located(By.id("shopping_cart_container"));
    public static final Target BTN_CONTINUESHOPPING = Target.the("Click Continue Shopping").located(By.id("continue-shopping"));

}

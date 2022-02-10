package com.co.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FilterOptionUserInterfaces {
    public static final Target BTN_FILTER = Target.the("Click Option Filter").located(By.xpath("//select[@class=\"product_sort_container\"]"));
    public static final Target BTN_SELECT_AZ = Target.the("Click Option Filter AZ").located(By.xpath("//option[@value=\"az\"]"));
    public static final Target BTN_SELECT_ZA = Target.the("Click Option Filter ZA").located(By.xpath("//option[@value=\"za\"]"));
    public static final Target BTN_SELECT_LH = Target.the("Click Option Filter Low Price").located(By.xpath("//option[@value=\"lohi\"]"));
    public static final Target BTN_SELECT_HL = Target.the("Click Option Filter High Price").located(By.xpath("//option[@value=\"hilo\"]"));
}

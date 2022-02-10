package com.co.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidationMessagesUserInterfaces {
    public static final Target LBL_VERIFICATION_MESSAGE_FINAL= Target.the("Verification Message Final").located(By.xpath("//h2[@class=\"complete-header\"]"));
    public static final Target LBL_VERIFICATION_MESSAGE_PRICE = Target.the("Verificacion Price").located(By.xpath("//div[@class=\"inventory_item_price\"]"));
    public static final Target LBL_VERIFICATION_MESSAGE_ABOUT = Target.the("Verificacion Message About").located(By.xpath("//h1[@class=\"supertitle \"]"));
    public static final Target LBL_VERIFICATION_MESSAGE = Target.the("Verification message").located(By.xpath("//span[@class=\"title\"]"));
    public static final Target LBL_VERIFICATION_MESSAGE_TAX = Target.the("Verification Message Tax").located(By.xpath("//div[@class=\"summary_tax_label\"]"));
    public static final Target LBL_VERIFICATION_MESSAGE_TOTAL= Target.the("Verification Message Total").located(By.xpath("//div[@class=\"summary_total_label\"]"));
    public static final Target LBL_VERIFICATION_MESSAGE_EPIC= Target.the("Verification Message Epic").located(By.xpath("//h3[@data-test=\"error\"]"));
    public static final Target LBL_VERIFICATION_MESSAGE_ERROR= Target.the("Verification Message Error").located(By.xpath("//h3[@data-test=\"error\"]"));
}

package com.co.swaglabs.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ShoppingCart.feature",
        glue = "com.co.swaglabs.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ShoppingCartRunner {
}

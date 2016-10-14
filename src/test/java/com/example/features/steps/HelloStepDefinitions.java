package com.example.features.steps;

import com.example.features.steps.serenity.HelloSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

/**
 * Created by icanon on 13/10/16.
 */
public class HelloStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    @Steps
    private HelloSteps helloSteps;

    @Given("^I have loaded hello page$")
    public void load_main_page() {
        helloSteps.openHelloPage();
    }

    @Then("I should see '(.*)' world somewhere")
    public void check_hello_at_page(final String salute) {
        helloSteps.should_see_this_text(salute);
    }
}

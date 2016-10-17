package com.example.features.steps.statichello;

import com.example.pages.HelloPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by icanon on 14/10/16.
 */
public class HelloSteps {

    HelloPage helloPage;

    @Step
    public void openHelloPage() {
        helloPage.open();
    }

    @Step
    public void should_see_this_text(final String text) {
        assertThat(text.equals(helloPage.look_for_salute()));
    }
}

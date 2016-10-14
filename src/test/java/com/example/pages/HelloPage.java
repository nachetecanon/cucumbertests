package com.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by icanon on 14/10/16.
 */
@DefaultUrl("http://localhost:9090/prueba/hello")
public class HelloPage extends PageObject {

    @FindBy(id = "salute")
    WebElement helloTag;

    public String look_for_salute() {
        return helloTag.getText();
    }
}

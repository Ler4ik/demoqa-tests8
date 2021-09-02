package com.kharlova.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest(){
        String permanentAddress = "another street 2";

        open("/text-box");
        $("#userName").setValue("Lera");
        $("#userEmail").setValue("valvalsan@gmail.com");
        $("#currentAddress").setValue("some street 1");
        $("#permanentAddress").setValue(permanentAddress);
        $("#submit").click();

        $("#output #name").shouldHave(text("Lera"));
        $("#output #email").shouldHave(text("valvalsan@gmail.com"));
        $("#output #currentAddress").shouldHave(text("some street 1"));
        $("#output #permanentAddress").shouldHave(text(permanentAddress));

    }
}

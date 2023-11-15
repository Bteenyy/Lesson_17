package page;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    public MainPage openPage() {
        open("");
        $(".products-slider-block__title").shouldHave(text("Scalable Products"));
        return this;
    }
}

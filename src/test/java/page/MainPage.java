package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    SelenideElement blockTitle = $(".products-slider-block__title"),
            navigationList = $(".navigation__list"),
            searchForm = $(".searchform_input"),
            progressbar = $(".progressbar-items"),
            slider = $("#products-slider");


    public MainPage mainPageOpen() {
        open("");
        blockTitle.shouldHave(text("Scalable Products"));
        return this;
    }

    public MainPage navigationHeaderPut(String header) {
        navigationList.shouldHave(text(header));
        return this;
    }

    public MainPage searchBarPut(String value) {
        searchForm.setValue(value).pressEnter();
        return this;
    }

    public MainPage progressChoose(String value) {
        progressbar.$(byText(value)).click();
        return this;
    }

    public MainPage resultSliderCheck(String result) {
        slider.shouldHave(text(result));
        return this;
    }
}

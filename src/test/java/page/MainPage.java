package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    SelenideElement blockTitle = $(".products-slider-block__title"),
            navigationList = $(".navigation__list"),
    searchForm=$(".searchform_input");


    public MainPage openPage() {
        open("");
        blockTitle.shouldHave(text("Scalable Products"));
        return this;
    }

    public MainPage navigationHeader(String header) {
        navigationList.shouldHave(text(header));
        return this;
    }
    public MainPage putSearchBar(String word) {
       searchForm.setValue(word).pressEnter();
        return this;
    }

}
package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    SelenideElement blockTitle = $(".products-slider-block__title"),
            navigationList = $(".navigation__list"),
            newsPage = $(".container").$(byText("Blog"));

    public MainPage openPage() {
        open("");
        blockTitle.shouldHave(text("Scalable Products"));
        return this;
    }

    public MainPage navigationHeader(String header) {
        navigationList.shouldHave(text(header));
        return this;
    }

    public MainPage openNewsPage() {
        newsPage.click();
        $(".news-content").shouldHave(text("Our Blog"));
        return this;
    }

}

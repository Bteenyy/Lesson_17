package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class NewsPage {
    SelenideElement newsCategory = $(".news-category-row"),
            newsPage = $(".container").$(byText("Blog"));
    ;

    public NewsPage openNewsPage() {
        newsPage.click();
        $(".news-content").shouldHave(text("Our Blog"));
        return this;
    }

    public NewsPage blogCategory(String category) {
        newsCategory.shouldHave(text(category));
        return this;
    }

}

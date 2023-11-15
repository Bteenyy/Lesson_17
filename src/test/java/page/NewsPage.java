package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class NewsPage {
    SelenideElement newsCategory = $(".news-category-row");

    public NewsPage blogCategory(String category) {
        newsCategory.shouldHave(text(category));
        return this;
    }

}

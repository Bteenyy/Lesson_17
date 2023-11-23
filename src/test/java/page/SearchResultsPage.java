package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultsPage {
    SelenideElement title = $(".entry-title");

    public SearchResultsPage resultCheck(String result) {
        title.shouldHave(Condition.text(result));
        return this;
    }
}

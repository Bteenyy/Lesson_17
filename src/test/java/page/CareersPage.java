package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CareersPage {
    SelenideElement careersPage = $(".container").$(byText("Careers")),
            jobsContent = $(".jobs-content__roles");

    public CareersPage careersPageOpen() {
        careersPage.click();
        $("#preview-block").shouldHave(text("Careers at Scalable Solutions"));
        return this;
    }

    public CareersPage careersCategoryCheck(String category) {
        jobsContent.shouldHave(text(category));
        return this;
    }
}
package test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import page.CareersPage;
import page.MainPage;
import page.NewsPage;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.$;

public class ScalableSolutionsTest extends TestBase {
    MainPage mainPage = new MainPage();
    NewsPage newsPage = new NewsPage();
    CareersPage careersPage=new CareersPage();

    @ValueSource(strings = {"Products and Services", "Sectors", "Blog", "Team", "Careers"})
    @ParameterizedTest(name = "В навигационном панели присутствует элемент {0} для запроса {0}")
    void byOneValueTest(String header) {
        mainPage.openPage()
                .navigationHeader(header);
    }

    @ValueSource(strings = {"All", "Blog", "Industry Reports", "Media", "Product News"})
    @ParameterizedTest(name = "В навигационном панели присутствует элемент {0} для запроса {0}")
    void OpenNewsPage(String category) {
        mainPage.openPage();
        newsPage.openNewsPage()
                .blogCategory(category);
    }

   // @ValueSource(strings = {"All", "Design", "Development/QA", "Managerial", "System support"})
   // @ParameterizedTest(name = "В навигационном панели присутствует элемент {0} для запроса {0}")
    @Test
    void OpenCareersPage() {
       mainPage.openPage();
       careersPage.openCareersPage();
    }

}

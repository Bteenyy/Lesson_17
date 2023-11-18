package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import page.CareersPage;
import page.MainPage;
import page.NewsPage;

import static com.codeborne.selenide.Selenide.$;

public class ScalableSolutionsTest extends TestBase {
    MainPage mainPage = new MainPage();
    NewsPage newsPage = new NewsPage();
    CareersPage careersPage = new CareersPage();

    @Test
    void searchBar()
    {
        mainPage.openPage()
                .putSearchBar();

    }
    @ValueSource(strings = {"Products and Services", "Sectors", "Blog", "Team", "Careers"})
    @ParameterizedTest(name = "В навигационном панели присутствует элемент {0} для запроса {0}")
    void mainPageTest(String header) {
        mainPage.openPage()
                .navigationHeader(header);
    }

    @ValueSource(strings = {"All", "Blog", "Industry Reports", "Media", "Product News"})
    @ParameterizedTest(name = "В навигационном панели присутствует элемент {0} для запроса {0}")
    void newsPageTest(String category) {
        mainPage.openPage();
        newsPage.openNewsPage()
                .blogCategory(category);
    }

    @ValueSource(strings = {"All", "Design", "Development/QA", "Managerial", "System support"})
    @ParameterizedTest(name = "В навигационном панели вкладки Careers присутствует {0} для запроса {0}")
    void careersPageTest(String category) {
        mainPage.openPage();
        careersPage.openCareersPage()
                .careersCategory(category);
    }

}

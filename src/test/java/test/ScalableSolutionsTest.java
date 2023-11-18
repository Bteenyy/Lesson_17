package test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import page.CareersPage;
import page.MainPage;
import page.NewsPage;
import page.SearchResultsPage;

public class ScalableSolutionsTest extends TestBase {
    MainPage mainPage = new MainPage();
    NewsPage newsPage = new NewsPage();
    CareersPage careersPage = new CareersPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @CsvSource(value = {
            "Scalable Exchange Platform, Our exchange tech is the industry flagship with speed and",
            "Scalable Custodial Wallet, User-friendly, secure, with your brand at the forefront.",
            "Scalable Custody, The custody module provides the highest",
            "Scalable Liquidity, Brokers, instant exchanges, retail traders,"
    })
    @ParameterizedTest(name = "В слайде присутствует {1} для выбора заголовка {0}")
    void progressSlider(String value, String result) {
        mainPage.openPage()
                .chooseProgress(value)
                .resultSlider(result);
    }

    @CsvSource(value = {
            "Privacy Policy, Privacy Policy",
            "Blog, Top 5 Things to Know about Scalable Solutions",
            "Careers, Leadership Team"
    })
    @ParameterizedTest(name = "В поисковой выдаче присутствует {1} для запроса {0}")
    void searchBar(String value, String result) {
        mainPage.openPage()
                .putSearchBar(value);
        searchResultsPage.checkResult(result);
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

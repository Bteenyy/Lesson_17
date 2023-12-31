package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import page.CareersPage;
import page.MainPage;
import page.NewsPage;
import page.SearchResultsPage;

import static io.qameta.allure.Allure.step;

@Tag("Scalablesolutions")
public class ScalableSolutionsTest extends TestBase {
    MainPage mainPage = new MainPage();
    NewsPage newsPage = new NewsPage();
    CareersPage careersPage = new CareersPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @CsvSource(value = {
            "Scalable Exchange Platform, Our exchange tech is the industry flagship with speed and",
            "Scalable Custodial Wallet, User-friendly, secure, with your brand at the forefront.",
    })

    @ParameterizedTest(name = "В слайде присутствует {1} для выбора заголовка {0}")
    void progressSlider(String value, String result) {
        step("Open page", () -> {
            mainPage.mainPageOpen();
        });
        step("Put value", () -> {
            mainPage.progressChoose(value);
        });
        step("Check result", () -> {
            mainPage.resultSliderCheck(result);
        });
    }

    @CsvSource(value = {
            "Privacy Policy, Privacy Policy",
            "Blog, Top 5 Things to Know about Scalable Solutions",
    })
    @ParameterizedTest(name = "В поисковой выдаче присутствует {1} для запроса {0}")
    void searchBar(String value, String result) {
        step("Open page", () -> {
            mainPage.mainPageOpen();
        });
        step("Put value", () -> {
            mainPage.searchBarPut(value);
        });
        step("Check result", () -> {
            searchResultsPage.resultCheck(result);
        });


    }

    @ValueSource(strings = {"Products and Services", "Sectors", "Blog"})
    @ParameterizedTest(name = "В навигационном панели присутствует элемент {0} для запроса {0}")
    void mainPageTest(String header) {
        step("Open page", () -> {
            mainPage.mainPageOpen();
        });
        step("Check element", () -> {
            mainPage.navigationHeaderPut(header);
        });

    }

    @ValueSource(strings = {"All", "Blog", "Industry Reports"})
    @ParameterizedTest(name = "В навигационном панели присутствует элемент {0} для запроса {0}")
    void newsPageTest(String category) {
        step("Open page", () -> {
            mainPage.mainPageOpen();
        });
        step("Open news page", () -> {
            newsPage.newsPageOpen();
        });
        step("Check element", () -> {
            newsPage.blogCategoryPut(category);
        });


    }

    @ValueSource(strings = {"All", "Design", "Development/QA"})
    @ParameterizedTest(name = "В навигационном панели вкладки Careers присутствует {0} для запроса {0}")
    void careersPageTest(String category) {
        step("Open page", () -> {
            mainPage.mainPageOpen();
        });
        step("Open careers page", () -> {
            careersPage.careersPageOpen();
        });
        step("Check element", () -> {
            careersPage.careersCategoryCheck(category);
        });


    }

}

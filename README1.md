
# <a href="https://rt-solar.ru/start/"><img src="images/logo.png" width="55" height="55"/></a> Проект по автоматизации тестирования для «Ростелеком-Солар»

## :technologist: Технологии и инструменты

<p  align="center">

<a href="https://www.jetbrains.com/idea/"><img width="5%" title="IntelliJ IDEA" src="media/logo/Idea.svg"></a>
<a href="https://www.java.com/"><img width="5%" title="Java" src="media/logo/Java.svg"></a>
<a href="https://selenoid.autotests.cloud/"><img width="5%" title="Selenoid" src="media/logo/Selenoid.svg"></a>
<a href="https://selenide.org/"><img width="5%" title="Selenide" src="media/logo/Selenide.svg"></a>
<a href="https://gradle.org/"><img width="5%" title="Gradle" src="media/logo/Gradle.svg"></a>
<a href="https://junit.org/junit5/"><img width="5%" title="Junit5" src="media/logo/Junit5.svg"></a>
<a href="https://github.com/"><img width="5%" title="GitHub" src="media/logo/GitHub.svg"></a>
<a href="https://allurereport.org/"><img width="5%" title="Allure Report" src="media/logo/Allure.svg"></a>
<a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="media/logo/Allure_TO.svg"></a>
<a href="https://www.jenkins.io/"><img width="5%" title="Jenkins" src="media/logo/Jenkins_logo.svg"></a>
<a href="https://www.atlassian.com/ru/software/jira"><img width="5%" title="Jira" src="media/logo/Jira.svg"></a>
<a href="https://web.telegram.org/"><img width="5%" title="Telegram" src="media/logo/Telegram.svg"></a>
</p>


## :heavy_check_mark: Список проверок, реализованных в автотестах

- [x] Проверка кликабельности кнопки "Подать заявку"
- [x] Проверка полей формы для отклика на стажировку
- [x] Проверка управляющих элементов формы
- [x] Проверка заголовков на главной странице
- [x] Проверка наличия логотипа на главной странице
- [x] Для проверки рездела FAQ и футтера страницы применены параметризованные тесты
- [x] Имеются интеграции с Jira и Allure TestOps



## :heavy_check_mark: Список проверок, реализованных в ручных тестах

- [x] Проверка ссылок на главной странице
- [x] Проверка работы кнопки "Обратная связь"

## :rocket: Запуск тестов

###  :rocket: Локальный запуск :
```bash
./gradlew test
```

###  :rocket: Удаленный запуск (в Jenkins):
<p align="center">
<img title="Jenkins" src="media/video/Jenkins.jpg">
</p>

1. Открыть <a target="_blank" href="https://jenkins.autotests.cloud/job/IMak_Project/">проект</a>
2. Нажать **Build with Parameters**
3. Результат запуска сборки можно посмотреть в отчёте Allure

## :triangular_flag_on_post: Allure отчеты:

### <img src="media/logo/Allure.svg" width="25" height="25"  alt="Allure"/>Отчет в Allure</a> <a target="_blank" href="https://jenkins.autotests.cloud/job/017-aolshanskaya-hw_14/12/allure/"> report</a>

#### :black_small_square: Основной отчет
<p align="center">
<img title="Allure Report Dashboards" src="media/video/AllureReport.jpg">
</p>

#### :black_small_square: Тесты
<p align="center">
<img title="Allure Report Tests" src="media/video/AllureReportTests.jpg">
</p>

### <img src="media/logo/Allure_TO.svg" width="25" height="25"  alt="Allure TestOps"/>Отчет в Allure</a> <a target="_blank" href="https://allure.autotests.cloud/jobrun/19967"> TestOps</a>

#### :black_small_square: Основной отчет
<p align="center">
<img title="Allure TestOps Dashboards" src="media/video/AllureTestOps.jpg">
</p>

#### :black_small_square: Тесты
<p align="center">
<img title="Allure TestOps Tests" src="media/video/AllureTestOpsCase.jpg">
</p>

#### :black_small_square: Пример ручных тестов
<p align="center">
  <img title="Allure TestOps manual tests" src="media/video/AllureTestOpsManualCase.jpg">
</p>

## <img src="media/logo/Telegram.svg" width="25" height="25"  alt="Telegram"/>Telegram уведомления</a>

<p align="center">
<img title="Allure Overview Dashboard" src="media/video/telegramBot.jpg">
</p>

## <img src="media/logo/Jira.svg" width="25" height="25" alt="Jira"/>Atlassian Jira интеграция</a>
<p align="center">
  <img title="Allure TestOps overview" src="images/Jira.jpg">
</p>

##  <img src="media/logo/Selenoid.svg" width="25" height="25" alt="Selenoid"/>Selenoid видеозапись тестов</a>
### Видеозапись прохождения тестов

<p align="center">

  <img title="Selenoid video" src="images/c38c13b0e38b770d29d7c4a3db1aea5a.gif">

</p>
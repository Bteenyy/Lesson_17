# Проект по автоматизации тестовых сценариев для сайта компании [Scalable](https://scalablesolutions.io/)
## Содержание:

- [Используемый стек](#computer-используемый-стек)
- [Запуск автотестов](#arrow_forward-запуск-автотестов)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Пример Allure-отчета](#-пример-allure-отчета)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testOps)
- [Интеграция с Jira](#-интеграция-с-jira)
- [Уведомления в Telegram](#-уведомления-в-telegram)
- [Видео примера запуска тестов в Selenoid](#-видео-примера-запуска-теста-в-selenoid)
- 
## Используемый стек

<p  align="center">
<a href="https://www.jetbrains.com/idea/"><img width="5%" title="IntelliJ IDEA" src="media/Idea.svg"></a>
<a href="https://www.java.com/"><img width="5%" title="Java" src="media/Java.svg"></a>
<a href="https://selenoid.autotests.cloud/"><img width="5%" title="Selenoid" src="media/Selenoid.svg"></a>
<a href="https://selenide.org/"><img width="5%" title="Selenide" src="media/Selenide.svg"></a>
<a href="https://gradle.org/"><img width="5%" title="Gradle" src="media/Gradle.svg"></a>
<a href="https://junit.org/junit5/"><img width="5%" title="Junit5" src="media/Junit5.svg"></a>
<a href="https://github.com/"><img width="5%" title="GitHub" src="media/GitHub.svg"></a>
<a href="https://allurereport.org/"><img width="5%" title="Allure Report" src="media/Allure.svg"></a>
<a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="media/Allure_TO.svg"></a>
<a href="https://www.jenkins.io/"><img width="5%" title="Jenkins" src="media/Jenkins.svg"></a>
<a href="https://www.atlassian.com/ru/software/jira"><img width="5%" title="Jira" src="media/Jira.svg"></a>
<a href="https://web.telegram.org/"><img width="5%" title="Telegram" src="media/Telegram.svg"></a>
</p>

- Тесты в данном проекте написаны на языке `Java` с использованием фреймворка для тестирования `Selenide`.
- Cборщик - `Gradle`. 
- `JUnit 5` задействован в качестве фреймворка модульного тестирования.
- При прогоне тестов для запуска браузеров используется `Selenoid`.
- Для удаленного запуска реализована джоба в `Jenkins` с формированием `Allure-отчета` и отправкой результатов в `Telegram` при помощи бота.
- Так же реализована интеграция с `Allure TestOps` и  `Jira`

Содержание Allure-отчета:
* Шаги теста;
* Скриншот страницы на последнем шаге;
* Page Source;
* Логи браузерной консоли;
* Видео выполнения автотеста.

## Запуск автотестов

### Запуск тестов из терминала
```
gradle clean test
```
При выполнении данной команды в терминале IDE тесты запустятся удаленно в <code>Selenoid</code>.
## <img width="5%" title="Jenkins" src="media/Jenkins.svg"> Удаленный запуск (в Jenkins):
<p align="center">
<img title="Jenkins Build" src="media/jenkins.png">
</p>

- Открыть [Проект](https://jenkins.autotests.cloud/job/Lesson_17/)
- Нажать **Build with Parameters**
- Результат запуска сборки можно посмотреть в отчёте Allure

## <img width="4%" style="vertical-align:middle" title="Allure Report" src="media/Allure.svg"> Пример Allure-отчета

<p align="center">
<img title="Allure Overview" src="media/allure_report.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Allure TestOps" src="media/logo/AllureTestOps.svg"> Интеграция с Allure TestOps

На *Dashboard* в <code>Allure TestOps</code> видна статистика количества тестов: сколько из них добавлены и проходятся вручную, сколько автоматизированы. Новые тесты, а так же результаты прогона приходят по интеграции при каждом запуске сборки.

<p align="center">
<img title="Allure TestOps DashBoard" src="media/screens/AllureTestOps.png">
</p>

### Результат выполнения автотеста

<p align="center">
<img title="Test Results in Alure TestOps" src="media/screens/allurResults.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Jira" src="media/logo/Jira.svg"> Интеграция с Jira

Реализована интеграция <code>Allure TestOps</code> с <code>Jira</code>, в тикете отображается, какие тест-кейсы были написаны в рамках задачи и результат их прогона.

<p align="center">
<img title="Jira Task" src="media/screens/Jira.png">
</p>

### <img width="4%" style="vertical-align:middle" title="Telegram" src="media/Telegram.svg"> Уведомление от Telegram бота

После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов.

<p align="center">
<img width="70%" title="Telegram Notifications" src="media/Telegram_report.png">
</p>

### <img width="4%" style="vertical-align:middle" title="Selenoid" src="media/Selenoid.svg"> Видео примера запуска тестов в Selenoid

В отчетах Allure для каждого теста прикреплен не только скриншот, но и видео прохождения теста
<p align="center">
  <img title="Selenoid Video" src="media/Video_report.gif">
</p>

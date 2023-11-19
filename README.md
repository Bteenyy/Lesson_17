# Проект по автоматизации тестовых сценариев для сайта компании [Scalable](https://scalablesolutions.io/)
## Содержание:

- [Используемый стек](#computer-используемый-стек)
- [Запуск автотестов](#arrow_forward-запуск-автотестов)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Пример Allure-отчета](#-пример-allure-отчета)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testOps)
- [Уведомления в Telegram](#-уведомления-в-telegram)
- [Видео примера запуска тестов в Selenoid](#-видео-примера-запуска-теста-в-selenoid)
- 
## Используемый стек

<p  align="center">
<a href="https://www.jetbrains.com/idea/"><img width="5%" title="IntelliJ IDEA" src="media/Icons/Idea.svg"></a>
<a href="https://www.java.com/"><img width="5%" title="Java" src="media/Icons/Java.svg"></a>
<a href="https://selenoid.autotests.cloud/"><img width="5%" title="Selenoid" src="media/Icons/Selenoid.svg"></a>
<a href="https://selenide.org/"><img width="5%" title="Selenide" src="media/Icons/Selenide.svg"></a>
<a href="https://gradle.org/"><img width="5%" title="Gradle" src="media/Icons/Gradle.svg"></a>
<a href="https://junit.org/junit5/"><img width="5%" title="Junit5" src="media/Icons/Junit5.svg"></a>
<a href="https://github.com/"><img width="5%" title="GitHub" src="media/Icons/GitHub.svg"></a>
<a href="https://allurereport.org/"><img width="5%" title="Allure Report" src="media/Icons/Allure.svg"></a>
<a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="media/Icons/Allure_TO.svg"></a>
<a href="https://www.jenkins.io/"><img width="5%" title="Jenkins" src="media/Icons/Jenkins.svg"></a>
<a href="https://web.telegram.org/"><img width="5%" title="Telegram" src="media/Icons/Telegram.svg"></a>
</p>

- Тесты в данном проекте написаны на языке `Java` с использованием фреймворка для тестирования `Selenide`.
- Cборщик - `Gradle`. 
- `JUnit 5` задействован в качестве фреймворка модульного тестирования.
- При прогоне тестов для запуска браузеров используется `Selenoid`.
- Для удаленного запуска реализована джоба в `Jenkins` с формированием `Allure-отчета` и отправкой результатов в `Telegram` при помощи бота.
- Так же реализована интеграция с `Allure TestOps`

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
## <img width="5%" title="Jenkins" src="media/Icons/Jenkins.svg"> Удаленный запуск (в Jenkins):
<p align="center">
<img title="Jenkins Build" src="media/Screen/Jenkins.png">
</p>

- Открыть [Проект](https://jenkins.autotests.cloud/job/Lesson_17/)
- Нажать **Build with Parameters**
- Результат запуска сборки можно посмотреть в отчёте Allure

## <img width="4%" style="vertical-align:middle" title="Allure Report" src="media/Icons/Allure.svg"> Пример Allure-отчета

<p align="center">
<img title="Allure Overview" src="media/Screen/Allure_report.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Allure TestOps" src="media/Icons/Allure_TO.svg"> Интеграция с Allure TestOps

Выполнена интеграция сборки Jenkins с Allure TestOps. Результат выполнения автотестов отображается в Allure TestOps
<p align="center">
<img title="Allure TestOps DashBoard" src="media/Screen/Allure_TO.png">
</p>




### <img width="4%" style="vertical-align:middle" title="Telegram" src="media/Icons/Telegram.svg"> Уведомление от Telegram бота

После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов.

<p align="center">
<img width="70%" title="Telegram Notifications" src="media/Screen/Telegram_report.png">
</p>

### <img width="4%" style="vertical-align:middle" title="Selenoid" src="media/Icons/Selenoid.svg"> Видео примера запуска тестов в Selenoid

В отчетах Allure для каждого теста прикреплен не только скриншот, но и видео прохождения теста
<p align="center">
  <img title="Selenoid Video" src="media/Screen/Video_report.gif">
</p>

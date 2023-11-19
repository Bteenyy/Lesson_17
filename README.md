# Проект по автоматизации тестовых сценариев для проекта [Scalable](https://scalablesolutions.io/)
##  Содержание:

- [Использованный стек технологий](#computer-использованный-стек-технологий)
- [Запуск тестов из терминала](#arrow_forward-запуск-тестов-из-терминала)
- [Сборка в Jenkins](#сборка-в-jenkins)
- [Пример Allure-отчета](#пример-allure-отчета)
- [Уведомления в Telegram с использованием бота](#уведомления-в-telegram-с-использованием-бота)
- [Видео примера запуска тестов в Selenoid](#-видео-примера-запуска-теста-в-selenoid)

## :computer: Использованный стек технологий

<p align="center">
<a href="https://www.jetbrains.com/ru-ru/idea/"><img width="6%" title="IntelliJ IDEA" src="media/Icons/Idea.svg" alt="Intelij_IDEA"></a>
<a href="https://www.java.com/"><img width="6%" title="Java" src="media/Icons/Java.svg" alt="Java"></a>
<a href="https://selenide.org/"><img width="6%" title="Selenide" src="media/Icons/Selenide.svg" alt="Selenide"></a>
<a href="https://aerokube.com/selenoid/latest/"><img width="6%" title="Selenoid" src="media/Icons/Selenoid.svg" alt="Selenoid"></a>
<a href="https://allurereport.org/"><img width="6%" title="Allure Report" src="media/Icons/Allure.svg" alt="Allure_Report"></a>
<a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="media/Icons/Allure_TO.svg" alt="AllureTestOps"></a>
<a href="https://gradle.org/"><img width="6%" title="Gradle" src="media/Icons/Gradle.svg" alt="Gradle"></a>
<a href="https://junit.org/junit5/docs/current/user-guide/"><img width="6%" title="JUnit5" src="media/Icons/Junit5.svg" alt="JUnit5"></a>
<a href="https://github.com/"><img width="6%" title="GitHub" src="media/Icons/GitHub.svg" alt="GitHub"></a>
<a href="https://www.jenkins.io/"><img width="6%" title="Jenkins" src="media/Icons/Jenkins.svg" alt="Jenkins"></a>
<a href="https://web.telegram.org/"><img width="6%" title="Telegram" src="media/Icons/Telegram.svg" alt="Telegram"></a>
<a href="https://www.atlassian.com/ru/software/jira"><img width="5%" title="Jira" src="media/Icons/Jira.svg" alt="Jira"></a>
</p>

- В данном проекте автотесты написаны на языке <code>Java</code> с использованием фреймворка для тестирования Selenide.
- В качестве сборщика был использован - <code>Gradle</code>.
- Использованы фреймворки <code>JUnit 5</code> и <code>Selenide</code>.
- При прогоне тестов браузер запускается в <code>Selenoid</code>.
- Для удаленного запуска реализована джоба в <code>Jenkins</code> с формированием Allure-отчета и отправкой результатов в <code>Telegram</code> при помощи бота.
- Осуществлена интеграция с <code>Allure TestOps</code>.

Содержание Allure-отчета:
* Шаги теста;
* Скриншот страницы на последнем шаге;
* Page Source;
* Логи браузерной консоли;
* Видео выполнения автотеста.

## :arrow_forward: Запуск автотестов

### Запуск тестов из терминала
```
gradle clean test
```
### Запуск тестов на удаленном браузере
```
gradle clean test -Denv=main
```
При необходимости также можно переопределить параметры запуска

```
clean 
${TASK}
-DbrowserName=${browserName}
-DbrowserVersion=${browserVersion}
-DbrowserSize=${browserSize}
-DselenoidAddress=${selenoidAddress}
```

### Параметры сборки
* <code>selenoidAddress</code> – адрес удаленного сервера, на котором будут запускаться тесты.
* <code>browserName</code> – браузер, в котором будут выполняться тесты. По-умолчанию - <code>chrome</code>.
* <code>browserVersion</code> – версия браузера, в которой будут выполняться тесты. По-умолчанию - <code>100.0</code>.
* <code>browserSize</code> – размер окна браузера, в котором будут выполняться тесты. По-умолчанию - <code>1920x1080</code>.

## <img src="media/Icons/Jenkins.svg" title="Jenkins" width="4%"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Lesson_17/)
<p align="center">
<img title="Jenkins Build" src="media/Screen/Jenkins.png">
</p>

## <img src="media/Icons/Allure.svg" title="Allure Report" width="4%"/> Пример [Allure-отчета](https://jenkins.autotests.cloud/job/Lesson_17/12/allure/)
### Overview

<p align="center">
<img title="Allure Overview" src="media/Screen/Allure_report.png">
</p>

### Результат выполнения теста

<p align="center">
<img title="Test Results in Alure" src="media/Screen/Allure_result.png">
</p>

## <img src="media/Icons/Allure_TO.svg" title="Allure TestOps" width="4%"/> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/3755/dashboards)

Выполнена интеграция сборки <code>Jenkins</code> с <code>Allure TestOps</code>.
Результат выполнения автотестов отображается в <code>Allure TestOps</code>


<p align="center">
<img title="Allure TestOps DashBoard" src="media/Screen/Allure_TO.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Telegram" src="media/Icons/Telegram.svg"> Уведомления в Telegram с использованием бота

После завершения сборки, бот созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с результатом.

<p align="center">
<img width="70%" title="Telegram Notifications" src="media/Screen/Telegram_report.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Selenoid" src="media/Icons/Selenoid.svg">Видео примера запуска тестов в Selenoid

К каждому тесту в отчете прилагается видео прогона.
<p align="center">
  <img title="Selenoid Video" src="/media/Screen/Video_report.gif">
</p>
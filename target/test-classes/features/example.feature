@complete
Feature: Example feature

  Scenario: Log in  Yandex
    Given I go to https://www.yandex.ru/
    When I type login riddler1391 and password 1234Qwer
    Then I should go to home page


  Scenario: search yandex
    Given I go to https://www.yandex.ru/
    When I type word asdasd
    Then I press "Find" and close browser

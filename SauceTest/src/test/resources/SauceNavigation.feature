Feature: Login functionallity

    Scenario Outline: Positive login test
        Given Open page
        When Enter username "<username>"
        And Enter password "<password>"
        And Push login button
        Then Verify new page URL contains "<link>"

        Examples:
            | username      | password     | link                                    |
            | standard_user | secret_sauce | https://www.saucedemo.com/inventory.html|

    Scenario Outline: Negative username login test
        Given Open page
        When Enter bad username "<badUsername>"
        And Enter password "<password>"
        And Push login button
        Then Verify error message text is "<text>"

        Examples:
            | badUsername   | password     | text                                                        |
            | incorrectUser | secret_sauce | Username and password do not match any user in this service |

    Scenario Outline: Negative password login test
        Given Open page
        When Enter username "<username>"
        And Enter bad password "<badPassword>"
        And Push login button
        Then Verify error message text is "<text>"

        Examples:
            | username      | badPassword | text                                                        |
            | standard_user | badPassword | Username and password do not match any user in this service |
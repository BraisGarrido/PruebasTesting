Feature: Login functionality

    Scenario Outline: Positive login test
        Given Open page
        When I enter the username "<username>"
        And I enter the password "<password>"
        And I push submit button
        Then Verify new page URL contains "<link>"
        And Verify new page contains expected text "<text>"

        Examples:
            | username | password    | link                                               | text                         |
            | student  | Password123 | practicetestautomation.com/logged-in-successfully/ | You successfully logged in | 

    Scenario Outline: Negative username test
        Given Open page
        When I enter the bad username "<badUsername>"
        And I enter the password "<password>"
        And I push submit button
        And Verify error message text is "<text>"

        Examples:
            | badUsername   | password    | text                      |
            | incorrectUser | Password123 | Your username is invalid! |
        
    
    Scenario Outline: Negative password test
        Given Open page
        When I enter the username "<username>"
        And I enter the bad password "<badPassword>"
        And I push submit button
        And Verify error message text is "<text>"

        Examples:
            | username | badPassword       | text                      |
            | student  | incorrectPassword | Your password is invalid! |
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

    # Scenario: Negative username test
    #     Given Open page
    #     When Type username incorrectUser into username field
    #     And Type password Password123 into password field
    #     And Push submit button
    #     Then Verify error message is displayed
    #     And Verify error message text is "Your username is invalid!"
    
    # Scenario: Negative password test
    #     Given Open page
    #     When Type username student into username field
    #     And Type password incorrectPassword into password field
    #     And Push submit button
    #     Then Verify error message is displayed
    #     And Verify error message text is "Your password is invalid!"
Feature: Login funcionality

    Scenario Outline: Positive login test
        Given Open page
        When I enter the username "<username>"
        And I enter the password "<password>"
        #And Puh submit button
        #Then Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        #And Verify new page contains expected text(successfully logged in)
        #Then Verify button Log out is displayed on the new page

        Examples:
            | username | password    |
            | student  | Password123 | 
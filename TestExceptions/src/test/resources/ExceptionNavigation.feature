Feature: Test exceptions
    Control and know the exceptions that cucumber generates

    Scenario: Fail_NoSuchElementException
        Given Open page
        When Click add button
        Then Verify row 2 input field is displayed

    # Scenario: ElementNotInteractableException
    #     Given Open page
    #     When Click add button
    #     And Wait for second row to load
    #     Then Type text into the second input field
    #     When Push save button using locator By.name("Save")
    #     Then Verify text saved

    # Scenario: InvalidElementStateException
    #     Given Open page
    #     When Clear input field
    #     And Type text into the input field
    #     Then Verify text changed

    # Scenario: StaleElementReferenceException
    #     Given Open page
    #     When Find the instructions text element
    #     And Push add button
    #     Then Verify instruction text element is no longer displayed

    # Scenario: TimeoutException
    #     Given Open page
    #     When Click add button
    #     And Wait for 3 seconds for the second input field to be displayed
    #     Then Verify second input is displayed
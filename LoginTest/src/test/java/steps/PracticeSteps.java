package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import pages.HomePage;

public class PracticeSteps {
    HomePage landingPage = new HomePage();

    @Given(value = "Open page")
    public void iNavigateToPractice() {
        landingPage.navigateToPractice();
    }

    @When(value = "I enter the username {string}")
    public void iEnterTheUsername(String username) {
        landingPage.enterUsername(username);
    }

    @When(value = "I enter the password {string}")
    public void iEnterThePassword(String password) {
        landingPage.enterPassword(password);
    }

    @And(value = "I push submit button")
    public void navigationSubmit() {
        landingPage.clickSubmit();
    }

    @Then(value = "Verify new page URL contains {string}")
    public void verifyUrl(String expectedUrl) {
        String currentUrl = landingPage.getCurrentUrl();
        assertTrue("The current URL does not contain the expected text",
                    currentUrl.contains(expectedUrl));
    }

    @And(value = "Verify new page contains expected text {string}")
    public void expectedText(String expectedText) {
        assertTrue("The expected text is not present on the page",
                    landingPage.textPresent(expectedText));
    }

    @When(value = "I enter the bad username {string}")
    public void iEnterBadUsername(String username) {
        landingPage.enterUsername(username);
    }

    @And(value = "Verify error message text is {string}")
    public void expectedErrorText(String expectedText) {
        assertTrue("The error text is not present on the page",
                    landingPage.textPresent(expectedText));
    }

    @And(value = "I enter the bad password {string}")
    public void enterBadPassword(String password) {
        landingPage.enterPassword(password);
    }
}

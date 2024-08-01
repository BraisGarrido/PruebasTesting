package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import pages.HomePage;

public class SauceSteps {
    HomePage homePage = new HomePage();

    @Given("Open page")
    public void openPage() {
        homePage.navigateToSauce();
    }

    @When("Enter username {string}")
    public void enterUsername(String username) {
        homePage.enterUsername(username);
    }

    @And("Enter password {string}")
    public void enterPassword(String password) {
        homePage.enterPassword(password);
    }

    @And("Push login button")
    public void pushLoginButton() {
        homePage.clickLogin();
    }

    @Then("Verify new page URL contains {string}")
    public void verifyNewPageUrl(String expectedUrl) {
        String currentUrl = homePage.getCurrentUrl();
        assertTrue("The current URL does not contain the expected url",
                    currentUrl.contains(expectedUrl));
    }

    @When("Enter bad username {string}")
    public void enterBadUsername(String username) {
        homePage.enterUsername(username);
    }

    @Then("Verify error message text is {string}")
    public void verifyErrorMessageText(String text) {
        homePage.textPresent(text);
    }

    @And("Enter bad password {string}")
    public void enterBadPassword(String password) {
        homePage.enterPassword(password);
    }
}

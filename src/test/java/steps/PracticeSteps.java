package steps;

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
}

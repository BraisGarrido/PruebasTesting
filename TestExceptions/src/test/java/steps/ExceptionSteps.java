package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class ExceptionSteps {
    HomePage homePage = new HomePage();

    @Given("Open page")
    public void openPage() {
        homePage.navigateToPractice();
    }

    @When("Click add button")
    public void clickAddButton() {
        homePage.clickAdd();
    }

    @Then("Verify row 2 input field is displayed")
    public void secondRow() {
        homePage.isSecondRowPresent();
    }
}

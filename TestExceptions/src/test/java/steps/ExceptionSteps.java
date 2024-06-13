package steps;

import io.cucumber.java.en.Given;
import pages.HomePage;

public class ExceptionSteps {
    HomePage homePage = new HomePage();

    @Given("Open page")
    public void openPage() {
        homePage.navigateToPractice();
    }
}

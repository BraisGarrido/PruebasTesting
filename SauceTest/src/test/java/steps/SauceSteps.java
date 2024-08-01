package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import pages.HomePage;

public class SauceSteps {
    HomePage homePage = new HomePage();

    @Given("Abrir web")
    public void openPage() {
        homePage.navigateToSauce();
    }

    @When("Introducir usuario {string}")
    public void enterUsername(String username) {
        homePage.enterUsername(username);
    }

    @And("Introducir contrasena {string}")
    public void enterPassword(String password) {
        homePage.enterPassword(password);
    }

    @And("Pulsar boton login")
    public void pushLoginButton() {
        homePage.clickLogin();
    }

    @Then("Verificar link nueva ventana {string}")
    public void verifyNewPageUrl(String expectedUrl) {
        String currentUrl = homePage.getCurrentUrl();
        assertTrue("La URL actual no es la deseada",
                    currentUrl.contains(expectedUrl));
    }

    @When("Introducir mal usuario {string}")
    public void enterBadUsername(String username) {
        homePage.enterUsername(username);
    }

    @Then("Verificar mensaje de error {string}")
    public void verifyErrorMessageText(String text) {
        homePage.textPresent(text);
    }

    @And("Introducir mal contrasena {string}")
    public void enterBadPassword(String password) {
        homePage.enterPassword(password);
    }

    @When("Usuario agrega un producto al carrito")
    public void addToCart() {
        homePage.clickCart();
    }
}

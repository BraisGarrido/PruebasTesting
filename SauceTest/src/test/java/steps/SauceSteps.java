package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;

public class SauceSteps {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("Abrir web")
    public void openPage() {
        loginPage.navigateToSauce();
    }

    @When("Introducir usuario {string}")
    public void enterUsername(String username) {
        loginPage.enterUsername(username);
    }

    @And("Introducir contrasena {string}")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("Pulsar boton login")
    public void pushLoginButton() {
        loginPage.clickLogin();
    }

    @Then("Verificar link nueva ventana {string}")
    public void verifyNewPageUrl(String expectedUrl) {
        String currentUrl = loginPage.getCurrentUrl();
        assertTrue("La URL actual no es la deseada",
                    currentUrl.contains(expectedUrl));
    }

    @When("Introducir mal usuario {string}")
    public void enterBadUsername(String username) {
        loginPage.enterUsername(username);
    }

    @Then("Verificar mensaje de error {string}")
    public void verifyErrorMessageText(String text) {
        loginPage.textPresent(text);
    }

    @And("Introducir mal contrasena {string}")
    public void enterBadPassword(String password) {
        loginPage.enterPassword(password);
    }

    @When("Usuario agrega un producto al carrito")
    public void addToCart() {
        homePage.clickAddToCart();
    }

    @Then("Carrito aparece texto {string}")
    public void showProduct(String cartBadge) {
        String actualBadge = homePage.getCartBadge();
        assertEquals(cartBadge, actualBadge);
    }
}

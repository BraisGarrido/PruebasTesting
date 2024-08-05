package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import pages.Checkout;
import pages.HomePage;
import pages.LoginPage;

public class SauceSteps {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    Checkout checkout = new Checkout();

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
        homePage.clickSauceBack();
    }

    @Then("Muestra el {string} correcto de productos")
    public void showProduct(String cartBadge) {
        String actualBadge = homePage.getCartBadge();
        assertEquals(cartBadge, actualBadge);
    }

    @And("El usuario elimina todos los productos del carrito")
    public void deleteProduct() {
        homePage.clickSauceBack();
    }

    @And("Agregar Bike Light")
    public void addBikeLight() {
        homePage.clickSauceBike();
    }

    @And("Agregar Bolt T-Shirt")
    public void addBolt() {
        homePage.clickSauceBolt();
    }

    @And("Eliminar BackPack")
    public void deleteBackPack() {
        homePage.deleteSauceBack();
    }

    @And("Eliminar Bike")
    public void deleteBike() {
        homePage.deleteBike();
    }

    @And("Eliminar Bolt")
    public void deleteBolt() {
        homePage.deleteBolt();
    }

    @Then("El carrito esta vacio")
    public void isCartEmpty() {
        homePage.isCartEmpty();
    }

    @And("Entrar en el carrito")
    public void cartEnter() {
        homePage.cartEnter();
    }

    @And("Pulsar checkout")
    public void checkout() {
        homePage.checkout();
    }

    @And("Introducir nombre {string}")
    public void enterName(String name) {
        checkout.enterName(name);
    }

    @And("Introducir apellido {string}")
    public void enterLastName(String lastName) {
        checkout.enterLastNAme(lastName);
    }

    @And("Introducir codigo postal {string}")
    public void enterZip(String zip) {
        checkout.enterZip(zip);
    }

    @And("Pulsar en continue")
    public void pushContinue() {
        checkout.pushContinue();
    }

    @And("Pulsar finish")
    public void pushFinish() {
        checkout.pushFinish();
    }
}

package pages;

public class HomePage extends BasePage {

    private String linkSauceBack = "//button[@id='add-to-cart-sauce-labs-backpack']";
    private String linkBike = "//button[@id='add-to-cart-sauce-labs-bike-light']";
    private String linkBolt = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']";

    private String linkDelSauceBack = "//button[@id='remove-sauce-labs-backpack']";
    private String linkDelBike = "//button[@id='remove-sauce-labs-bike-light']";
    private String linkDelBolt = "//button[@id='remove-sauce-labs-bolt-t-shirt']";

    private String cartLink = "//a[@class='shopping_cart_link']";
    private String checkoutLink = "//button[@id='checkout']";
    private String cartBadge = "//span[@class='shopping_cart_badge']";
    private String optionsLink = "//button[@id='react-burger-menu-btn']";
    private String logoutLink = "//a[@id='logout_sidebar_link']";
    
    public HomePage() {
        super(driver);
    }

    public void clickSauceBack() {
        clickElement(linkSauceBack);
    }

    public void clickSauceBike() {
        clickElement(linkBike);
    }

    public void clickSauceBolt() {
        clickElement(linkBolt);
    }

    public void deleteSauceBack() {
        clickElement(linkDelSauceBack);
    }

    public void deleteBike() {
        clickElement(linkDelBike);
    }

    public void deleteBolt() {
        clickElement(linkDelBolt);
    }

    public void clickMenu() {
        clickElement(optionsLink);
    }

    public void clickLogout() {
        clickElement(logoutLink);
    }
    
    public String getCartBadge() {
        return Find(cartBadge).getText();
    }

    public void isCartEmpty() {
        isCartEmpty(cartBadge);
    }

    public void cartEnter() {
        clickElement(cartLink);
    }

    public void checkout() {
        clickElement(checkoutLink);
    }
}

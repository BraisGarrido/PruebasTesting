package pages;

public class HomePage extends BasePage {

    private String linkSauceBack = "//button[@id='add-to-cart-sauce-labs-backpack']";
    private String cartBadge = "//span[@class='shopping_cart_badge']";

    public HomePage() {
        super(driver);
    }

    public void clickSauceBack() {
        clickElement(linkSauceBack);
    }
    
    public String getCartBadge() {
        return Find(cartBadge).getText();
    }
}

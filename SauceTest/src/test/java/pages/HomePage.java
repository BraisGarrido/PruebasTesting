package pages;

public class HomePage extends BasePage {

    private String cartLink = "//button[@id='add-to-cart-sauce-labs-backpack']";
    private String cartBadge = "//span[@class='shopping_cart_badge']";

    public HomePage() {
        super(driver);
    }

    public void clickAddToCart() {
        clickElement(cartLink);
    }
    
    public String getCartBadge() {
        return Find(cartBadge).getText();
    }
}

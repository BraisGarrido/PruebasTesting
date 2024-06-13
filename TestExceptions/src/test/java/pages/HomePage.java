package pages;

public class HomePage extends BasePage{

    public HomePage() {
        super(driver);
    }

    public void navigateToPractice() {
        navigateTo("https://practicetestautomation.com/practice-test-exceptions/");
    }
}

package pages;

public class HomePage extends BasePage{

    private String addLink = "//button[@id='add_btn']";
    private String secondRow = "//div[@id='row2']//input[@type='text']";

    public HomePage() {
        super(driver);
    }

    public void navigateToPractice() {
        navigateTo("https://practicetestautomation.com/practice-test-exceptions/");
    }

    public void clickAdd() {
        clickElement(addLink);
    }

    public boolean isSecondRowPresent() {
        return countRows(secondRow) >= 2; // Ajusta el selector según tus filas
    }
}

package pages;

public class HomePage extends BasePage {

    private String usernameLink = "//input[@id='username']";
    private String passwordLink = "//input[@id='password']";
    private String submitLink = "//button[@id='submit']";

    public HomePage() {
        super(driver);
    }

    public void navigateToPractice() {
        navigateTo("https://practicetestautomation.com/practice-test-login/");
    }
    
    public void enterUsername(String username) {
        write(usernameLink, username);
    }

    public void enterPassword(String password) {
        write(passwordLink, password);
    }

    public void clickSubmit() {
        clickElement(submitLink);
    }

    public boolean textPresent(String text) {
        return driver.getPageSource().contains(text);
    }
} 

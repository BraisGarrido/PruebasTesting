package pages;

public class HomePage extends BasePage {

    private String usernameLink = "//input[@id='username']";
    private String passwordLink = "//input[@id='password']";

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
}   

package pages;

public class LoginPage extends BasePage{

    private String userLink = "//input[@id='user-name']";
    private String passLink = "//input[@id='password']";
    private String loginLink = "//input[@id='login-button']";

    public LoginPage() {
        super(driver);
    }

    public void navigateToSauce() {
        navigateTo("https://www.saucedemo.com/");
    }

    public void enterUsername(String username) {
        write(userLink, username);
    }

    public void enterPassword(String password) {
        write(passLink, password);
    }

    public void clickLogin() {
        clickElement(loginLink);
    }

    public void isTextPresent(String text) {
        textPresent(text);
    }
}

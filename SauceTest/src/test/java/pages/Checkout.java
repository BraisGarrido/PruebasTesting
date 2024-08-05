package pages;

public class Checkout extends BasePage{

    private String continueLink = "//input[@id='continue']";
    private String finishLink = "//button[@id='finish']";

    private String nameLink = "//input[@id='first-name']";
    private String lasNameLink = "//input[@id='last-name']";
    private String zipLink = "//input[@id='postal-code']";
    
    public Checkout() {
        super(driver);
    }

    public void enterName(String name) {
        write(nameLink, name);
    }

    public void enterLastNAme(String lastName) {
        write(lasNameLink, lastName);
    }

    public void enterZip(String zip) {
        write(zipLink, zip);
    }

    public void pushContinue() {
        clickElement(continueLink);
    }

    public void pushFinish() {
        clickElement(finishLink);
    }
}

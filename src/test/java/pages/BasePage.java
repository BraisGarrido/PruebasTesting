package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

public class BasePage {
    
    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    //Ejecucion del driver
    public BasePage (WebDriver driver){
        BasePage.driver = driver;
    }

    //Navegar a la ventana que queramos
    public static void navigateTo(String url) {
        driver.get(url);
    }

    //Una vez terminado todo el proceso cerramos el navegador
    public static void closeBrowser() {
        driver.quit();
    }

    public WebElement Find(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    //Clickar sobre el elemento que queramos
    public void clickElement(String locator) {
        Find(locator).click();
    }

    //Escribir sobre el elemento que queramos
    public void write(String locator, String keysToSend) {
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }

    public void selectFromDropdownByValue(String locator, String value) {
        Select dropdown = new Select(Find(locator));

        dropdown.selectByValue(value);
    }

    public void selectFromDropdownByIndex(String locator, Integer index) {
        Select dropdown = new Select(Find(locator));

        dropdown.selectByIndex(index);
    }

    public int dropdownSize(String locator) {
        Select dropdown = new Select(Find(locator));

        List<WebElement> dropdownOptions = dropdown.getOptions();

        return dropdownOptions.size();
    }

    //Obtener la url de la ventana actual
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    //Comprobar elementos de texto en la ventana
    public boolean textPresent(String text) {
        return driver.getPageSource().contains(text);
    }
}

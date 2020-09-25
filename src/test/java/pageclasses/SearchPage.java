package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    public static WebElement element = null;

    public static void navigateToFLightsTab(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"uitk-tabs-button-container\"]/li[2]/a"));
        element.click();
    }

    public static WebElement originTextBox(WebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/button")).click();
        element = driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin\"]"));
        return element;
    }

    public static void fillOriginTextBox(WebDriver driver, String origin) {
        element = originTextBox(driver);
        element.sendKeys(origin);
        element.sendKeys(Keys.ENTER);
    }

    public static WebElement destinationTextBox(WebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/button")).click();
        element = driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination\"]"));
        return element;
    }

    public static void fillDestinationTextBox(WebDriver driver, String destination) {
        element = destinationTextBox(driver);
        element.sendKeys(destination);
        element.sendKeys(Keys.ENTER);
    }

    public static WebElement departureTextBox(WebDriver driver) {
        element = driver.findElement(By.id("flight-departing"));
        return element;
    }

    public static void fillDepartureDateTextBox(WebDriver driver, String departureDate) {
        element = departureTextBox(driver);
        element.sendKeys(departureDate);
    }

    public static WebElement returnTextBox(WebDriver driver) {
        element = driver.findElement(By.id("flight-returning"));
        return element;
    }

    public static void fillReturnDateTextBox(WebDriver driver, String returnDate) {
        element = returnTextBox(driver);
        element.sendKeys(returnDate);
    }

    public static WebElement searchButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button"));
        return element;
    }

    public static void clickOnSearchButton(WebDriver driver) {
        element = searchButton(driver);
        element.click();
    }
}

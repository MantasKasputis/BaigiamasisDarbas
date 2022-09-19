package lt.mantas.pom.pages;

import lt.mantas.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Common {


    public static void openUrl(String url) {
        Driver.setDriver();
        Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void closeDriver() {
        Driver.quitDriver();
    }

    public static void clickElementByAction(By locator) {
        WebElement element = getElement(locator);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element);
        actions.click();
        actions.perform();
    }

    public static void simulateMouseMovement(By locator1, By locator2) {
        WebElement element1 = getElement(locator1);
        WebElement element2 = getElement(locator2);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element1);
        actions.moveByOffset(10, 25);
        actions.moveToElement(element2);
        actions.perform();
    }

    public static void switchToNewWindow() {

        for (String winHandle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(winHandle);
        }
    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }
}

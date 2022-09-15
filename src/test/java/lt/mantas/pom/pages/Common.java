package lt.mantas.pom.pages;

import lt.mantas.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {


    public static void openUrl(String url) {
        Driver.setDriver();
        Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
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

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(
                Driver.getDriver(),
                Duration.ofSeconds(10)
        );
        webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );
    }

    public static void selectOptionsByValue(By locator, String value) {
        WebElement webElement = getElement(locator);
        Select selectElement = new Select(webElement);
        selectElement.selectByValue(value);
    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static List<Boolean> getSelectedStatusOfCheckboxesByLocator(By locator) {
        List<WebElement> elementList = getElements(locator);
        List<Boolean> statusList = new ArrayList<>();

        for (WebElement element : elementList) {
            statusList.add(element.isSelected());
        }

        return statusList;
    }

    public static void doubleClick(By locator) {
        WebElement element = getElement(locator);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element);
        actions.doubleClick();
        actions.perform();
    }

    public static void clickElementByAction(By locator) {
        WebElement element = getElement(locator);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element);
        actions.click();
        actions.perform();
    }

    public static void rightClick(By locator) {
        WebElement element = getElement(locator);

        Actions actions = new Actions(Driver.getDriver());
//        actions.moveToElement(element);
        actions.contextClick(element);
        actions.perform();
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(
                Driver.getDriver(),
                Duration.ofSeconds(10)
        );
        webDriverWait.until(
                ExpectedConditions.elementToBeClickable(locator)
        );
    }

    public static void waitForElementAtributeContains(
            By locator,
            String attributeName,
            String attributeValue
    ) {
        WebDriverWait webDriverWait = new WebDriverWait(
                Driver.getDriver(),
                Duration.ofSeconds(10)
        );
        webDriverWait.until(
                ExpectedConditions.attributeContains(
                        locator,
                        attributeName,
                        attributeValue
                )
        );
    }

    public static void acceptAlertBox() {
        Driver.getDriver().switchTo().alert().accept();
    }

    public static void handleAlert(boolean isAccepted) {
        if (isAccepted) {
            Driver.getDriver().switchTo().alert().accept();
        } else {
            Driver.getDriver().switchTo().alert().dismiss();
        }
    }

    public static boolean isAlertBoxPresent() {

        try {
            Driver.getDriver().switchTo().alert().accept();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public static void sendKeysToAlert(String keys) {
        Driver.getDriver().switchTo().alert().sendKeys(keys);
    }

    public static void simulateMouseMovement(By locator1, By locator2) {
        WebElement element1 = getElement(locator1);
        WebElement element2 = getElement(locator2);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element1);
        actions.moveByOffset(10,25);
        actions.moveToElement(element2);
        actions.perform();
    }

    public static void switchToNewWindow() {

        for(String winHandle : Driver.getDriver().getWindowHandles()){
            Driver.getDriver().switchTo().window(winHandle);
        }

    }

    public static void storeCurrentWindowHandle() {
        String windowHandleBefore = Driver.getDriver().getWindowHandle();
    }
}

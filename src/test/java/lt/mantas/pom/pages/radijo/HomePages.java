package lt.mantas.pom.pages.radijo;

import lt.mantas.pom.pages.Common;
import lt.mantas.pom.pages.Locators;

public class HomePages {

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void clickOnTitleLogoHyperlink() {
        Common.clickElement(
                Locators.Home.titleLogoText
        );
    }

    public static String readHomepageHeaderTitle() {
        return Common.getElementText(
                Locators.Home.paragraphHomeHeaderTitle
        );
    }

    public static void clickOnRadijoStociuPaieska() {
        Common.clickElementByAction(
                Locators.Home.buttonRadijoStociuPaieska
        );
    }

    public static void simulateMouseMovement() {
        Common.simulateMouseMovement(
                Locators.Home.titleLogoText,
                Locators.Home.paragraphHomeHeaderTitle
        );
    }

    public static void clickOnDropboxRusiavimas() {
        Common.clickElementByAction(
                Locators.Home.dropBoxSelectionRusiavimas
        );
    }

    public static void clickOnZanraiIrKategorijosPageButton() {
        Common.clickElement(
                Locators.Home.buttonZanraiIrKategorijos
        );
    }

    public static void clickButtonOnAirPage() {
        Common.clickElement(
                Locators.Home.buttonOnAir
        );
    }

    public static void clickOnMenuOptionRadijas() {
        Common.clickElement(
                Locators.Home.menuOptionRadijas
        );
    }

    public static void enterMessageToFieldRusiavimas(String keys) {
        Common.sendKeysToElement(
                Locators.Home.fieldSortByRusiavimas,
                keys
        );
    }

    public static void enterMessageToFieldIeskotiPagalPavadinima(String keys) {
        Common.sendKeysToElement(
                Locators.Home.fieldSearchIeskotiPagalPavadinima,
                keys
        );
    }

    public static void enterMessageToFieldValstybes(String keys) {
        Common.sendKeysToElement(
                Locators.Home.fieldSearchValstybes,
                keys
        );
    }

    public static void enterMessageToFieldMiestai(String keys) {
        Common.sendKeysToElement(
                Locators.Home.fieldSearchMiestai,
                keys
        );
    }

    public static void enterMessageToFieldZanrai(String keys) {
        Common.sendKeysToElement(
                Locators.Home.fieldSearchMZanrai,
                keys
        );
    }

    public static String readMessage() {
        return Common.getElementText(
                Locators.Home.paragraphSearchResultCount
        );
    }
}


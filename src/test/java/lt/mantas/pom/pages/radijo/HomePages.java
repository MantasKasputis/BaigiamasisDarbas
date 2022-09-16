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
                Locators.Radijo.titleLogoText
        );
    }

    public static String readHomepageHeaderTitle() {
        return Common.getElementText(
                Locators.Radijo.paragraphHomeHeaderTitle
        );
    }

    public static void clickOnRadijoStociuPaieska() {
        Common.clickElementByAction(
                Locators.Radijo.buttonRadijoStociuPaieska
        );
    }

    public static void simulateMouseMovement() {
        Common.simulateMouseMovement(
                Locators.Radijo.titleLogoText,
                Locators.Radijo.paragraphHomeHeaderTitle
        );
    }

    public static void clickOnDropboxRusiavimas() {
        Common.clickElementByAction(
                Locators.Radijo.dropBoxSelectionRusiavimas
        );
    }

    public static void clickOnZanraiIrKategorijosPageButton() {
        Common.clickElement(
                Locators.Radijo.buttonZanraiIrKategorijos
        );
    }

    public static void clickButtonOnAirPage() {
        Common.clickElement(
                Locators.Radijo.buttonOnAir
        );
    }

    public static void clickOnMenuOptionRadijas() {
        Common.clickElement(
                Locators.Radijo.menuOptionRadijas
        );
    }

    public static void enterMessageToFieldRusiavimas(String keys) {
        Common.sendKeysToElement(
                Locators.Radijo.fieldSortByRusiavimas,
                keys
        );
    }

    public static void enterMessageToFieldIeskotiPagalPavadinima(String keys) {
        Common.sendKeysToElement(
                Locators.Radijo.fieldSearchIeskotiPagalPavadinima,
                keys
        );
    }

    public static void enterMessageToFieldValstybes(String keys) {
        Common.sendKeysToElement(
                Locators.Radijo.fieldSearchValstybes,
                keys
        );
    }

    public static void enterMessageToFieldMiestai(String keys) {
        Common.sendKeysToElement(
                Locators.Radijo.fieldSearchMiestai,
                keys
        );
    }

    public static void enterMessageToFieldZanrai(String keys) {
        Common.sendKeysToElement(
                Locators.Radijo.fieldSearchMZanrai,
                keys
        );
    }
}


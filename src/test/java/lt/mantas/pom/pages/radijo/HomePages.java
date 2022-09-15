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

    public static void doubleClickOnRadijoStociuPaieska() {
//        Common.clickElementByAction(
//                Locators.Radijo.buttonRadijoStociuPaieska
//        );
//        Common.clickElementByAction(
//                Locators.Radijo.buttonRadijoStociuPaieska
//        );
        Common.doubleClick(
                Locators.Radijo.buttonRadijoStociuPaieska
        );
    }


    public static void selectedOptionFromDropboxRusiavimas(String value) {
        Common.selectOptionsByValue(
                Locators.Radijo.dropBoxSelectionRusiavimas,
                value
        );
    }

    public static void waitForSearchButtonRadijoStociuPaieskaToBeClickable() {
        Common.waitForElementToBeClickable(
                Locators.Radijo.buttonRadijoStociuPaieska
        );
    }

    public static String actualTrueMessageOfActiveSearch() {
        return Common.getElementText(
                Locators.Radijo.paragraphLabelSearchOneSearchbox
        );
    }

    public static void checkIfTrue(String actualTrue, String expectedTrue) {
        if(actualTrue!=expectedTrue){
            Common.doubleClick(
                    Locators.Radijo.buttonRadijoStociuPaieska
            );
        }
    }
}

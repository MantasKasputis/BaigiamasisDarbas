package lt.mantas.pom.pages.radijo;

import lt.mantas.pom.pages.Common;
import lt.mantas.pom.pages.Locators;

public class ZanraiIrKategorijosPages {

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void clickOnRockGenreFilter() {
        Common.clickElement(
                Locators.ZanraiIrKategorijos.buttonGenreFilterRock
        );
    }

    public static void clickOnRadioOptionRockFm() {
        Common.clickElement(
                Locators.ZanraiIrKategorijos.buttonRadioRockFmPage
        );
    }

    public static void clickOnButtonPlayRockFm() {
        Common.clickElement(
                Locators.ZanraiIrKategorijos.buttonPlayRockFmGreenStationBlockx
        );
    }

    public static void simulateMouseMovement() {
        Common.simulateMouseMovement(
                Locators.ZanraiIrKategorijos.paragraphPageDescriptionRockFm,
                Locators.ZanraiIrKategorijos.paragraphPageHeaderTitleRadijoStotisRockFm
        );
    }

    public static void switchToNewWindow() {
        Common.switchToNewWindow();
    }

    public static void clickOnPlayRadioOnNewWindow() {
        Common.clickElement(
                Locators.ZanraiIrKategorijos.buttonPlayRadioRockFmNewWindow
        );
    }

    public static String readPageRockFmTitle() {
        return Common.getElementText(
                Locators.ZanraiIrKategorijos.paragraphPageHeaderTitleRadijoStotisRockFm
        );
    }

    public static void clickOnStopPlayRadioOnNewWindow() {
        Common.clickElementByAction(
                Locators.ZanraiIrKategorijos.buttonStopPlayRadioRockFmNewWindow
        );
    }

    public static String readPlayWindowTitleRockFm() {
        return Common.getElementText(
                Locators.ZanraiIrKategorijos.paragraphPlayWindowTitleRockFm
        );
    }
}

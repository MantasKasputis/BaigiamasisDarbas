package lt.mantas.pom.pages.radijo;

import lt.mantas.pom.pages.Common;
import lt.mantas.pom.pages.Locators;

public class RadijoStotysPages {
    public static void clickOnStationRockFmFromHomepage() {
        Common.clickElement(
                Locators.RadijoStotys.buttonPageRockFm
        );
    }
}

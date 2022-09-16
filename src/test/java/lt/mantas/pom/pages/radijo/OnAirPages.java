package lt.mantas.pom.pages.radijo;

import lt.mantas.pom.pages.Common;
import lt.mantas.pom.pages.Locators;

public class OnAirPages {

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void clickOnTopFirstSong() {
        Common.clickElementByAction(
                Locators.OnAir.latestTopFirstMusicVideoInOnAirPage
        );
    }

    public static void clickCloseButtonOnVideo() {
        Common.clickElementByAction(
                Locators.OnAir.closeButtonOnVideo
        );
    }

    public static void clickOnTenthSongFromTop() {
        Common.clickElementByAction(
                Locators.OnAir.latestTopTenthMusicVideoInOnAirPage
        );
    }
}

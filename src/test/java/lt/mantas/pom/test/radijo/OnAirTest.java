package lt.mantas.pom.test.radijo;

import lt.mantas.pom.pages.radijo.HomePages;
import lt.mantas.pom.pages.radijo.OnAirPages;
import lt.mantas.pom.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OnAirTest extends TestBase {

    @Test
    public void testFirstAndTenthSongPlayabilityInOnAirPage() {

        String expectedTime = "fa fa-times-circle-o  modal-close cursor hover";
        String actualTime;

        HomePages.clickButtonOnAirPage();
        OnAirPages.clickOnTopFirstSong();
        OnAirPages.sleep(3000);
        OnAirPages.clickCloseButtonOnVideo();
        OnAirPages.sleep(1000);
        OnAirPages.clickOnTenthSongFromTop();
        OnAirPages.sleep(1000);

        actualTime = OnAirPages.readButtonTitleYoutube("class");

        Assert.assertTrue(
                actualTime.contains(expectedTime),
                String.format(
                        "Actual: %s; Expected contains: %s",
                        actualTime,
                        expectedTime
                )
        );
    }
}
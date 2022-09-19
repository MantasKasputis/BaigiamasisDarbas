package lt.mantas.pom.test.radijo;

import lt.mantas.pom.pages.radijo.HomePages;
import lt.mantas.pom.pages.radijo.ZanraiIrKategorijosPages;
import lt.mantas.pom.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZanraiIrKategorijosTest extends TestBase {

    @Test
    public void testBrowsingFromHomeToRadioRockFm() {

        String expectedPageTitle = "Radijo stotis „Rock FM“ tiesiogiai internetu";
        String actualPageTitle;

        HomePages.clickOnZanraiIrKategorijosPageButton();
        ZanraiIrKategorijosPages.clickOnRockGenreFilter();
        ZanraiIrKategorijosPages.clickOnRadioOptionRockFm();

        actualPageTitle = ZanraiIrKategorijosPages.readPageRockFmTitle();

        Assert.assertTrue(actualPageTitle.contains(expectedPageTitle),
                String.format(
                        "Actual: %s; Expected contains: %s",
                        actualPageTitle,
                        expectedPageTitle
                )
        );
    }

    @Test
    public void testPlayingRadioRockFmFromNewWindow() {

        String expectedText = "http://5.20.223.18:80/crf128.mp3";
        String actualText;

        HomePages.clickOnZanraiIrKategorijosPageButton();
        ZanraiIrKategorijosPages.clickOnRockGenreFilter();
        ZanraiIrKategorijosPages.clickOnRadioOptionRockFm();

        ZanraiIrKategorijosPages.simulateMouseMovement();
        ZanraiIrKategorijosPages.sleep(2000);
        ZanraiIrKategorijosPages.simulateMouseMovement();

        ZanraiIrKategorijosPages.clickOnButtonPlayRockFm();
        ZanraiIrKategorijosPages.sleep(1000);

        ZanraiIrKategorijosPages.switchToNewWindow();

        ZanraiIrKategorijosPages.clickOnPlayRadioOnNewWindow();
        ZanraiIrKategorijosPages.sleep(1000);
        ZanraiIrKategorijosPages.clickOnStopPlayRadioOnNewWindow();
        ZanraiIrKategorijosPages.sleep(1000);

        actualText = ZanraiIrKategorijosPages.readPlayWindowTitleRockFm();
        Assert.assertEquals(actualText, expectedText);
    }
}

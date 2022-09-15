package lt.mantas.pom.test.radijo;

import lt.mantas.pom.pages.radijo.HomePages;
import lt.mantas.pom.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {

    @Test
    public void testRadijoHomePageLogoHyperlink() {

        String expectedTitle = "Radijas online internete | Radijo stotys internetu tiesiogiai | Internetinis radijas";
        String actualTitle;

        HomePages.clickOnTitleLogoHyperlink();
        HomePages.sleep(1000);
        actualTitle = HomePages.readHomepageHeaderTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void testRadijoStociuPaieska(){

        String expectedSelectedOption = "Pagal pavadinimą A-Z";
        String actualSelectedOption;

        String expectedTrue = "Ieškoti pagal pavadinimą";
        String actualTrue;

        HomePages.waitForSearchButtonRadijoStociuPaieskaToBeClickable();

        HomePages.doubleClickOnRadijoStociuPaieska();

        HomePages.sleep(3000);
//        HomePages.clickOnRadijoStociuPaieska();

        actualTrue = HomePages.actualTrueMessageOfActiveSearch();

        HomePages.checkIfTrue(actualTrue,expectedTrue);


        HomePages.selectedOptionFromDropboxRusiavimas(expectedSelectedOption);
        HomePages.sleep(1000);
        HomePages.selectedOptionFromDropboxRusiavimas(expectedSelectedOption);
        HomePages.sleep(1000);


    }
}

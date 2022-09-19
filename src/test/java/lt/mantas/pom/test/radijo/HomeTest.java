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
        Assert.assertEquals(actualTitle, expectedTitle);

        HomePages.clickOnMenuOptionRadijas();
        HomePages.sleep(1000);
        actualTitle = HomePages.readHomepageHeaderTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void testRadijoStociuPaieska() {

        String messageToRusiavimas = "Pagal pavadinimą A-Z";
        String messageToIeskotiPagalPavadinima = "Rock";
        String messageToValstybe = "Lietuva";
        String messageToMiestai = "Vilnius";
        String messageToZanrai = "Rock";

        String expectedText = "Surasta 3";
        String actualText;

        HomePages.simulateMouseMovement();
        HomePages.sleep(3000);

        HomePages.clickOnRadijoStociuPaieska();
        HomePages.clickOnDropboxRusiavimas();
        HomePages.enterMessageToFieldRusiavimas(messageToRusiavimas);
        HomePages.enterMessageToFieldIeskotiPagalPavadinima(messageToIeskotiPagalPavadinima);
        HomePages.enterMessageToFieldValstybes(messageToValstybe);
        HomePages.enterMessageToFieldMiestai(messageToMiestai);
        HomePages.enterMessageToFieldZanrai(messageToZanrai);

        HomePages.sleep(3000);

        actualText = HomePages.readMessage();
        Assert.assertEquals(actualText, expectedText);
    }
}

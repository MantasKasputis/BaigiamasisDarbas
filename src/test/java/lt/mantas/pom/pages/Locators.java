package lt.mantas.pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Radijo {
        public static By titleLogoText = By.xpath("//*[@class='text']");
        public static By paragraphHomeHeaderTitle = By.xpath("//*[@class='page-title max_width_991_mb_5']");
        public static By buttonRadijoStociuPaieska = By.xpath("(//*[@data-type='standart'])[1]");
        public static By dropBoxSelectionRusiavimas = By.xpath("(//*[@class='selection'])[1]");

        public static By paragraphLabelSearchOneSearchbox = By.xpath("//*[@for='swp_faceted_search_one-searchbox']");


    }
    public static class ZanraiIrKategorijos {
        public static By buttonZanraiIrKategorijosFromHomepage = By.xpath("//a[@title='Žanrai ir Kategorijos']");
        public static By buttonGenreFilterRock = By.xpath(
                "//a[@class='tag-cloud-link tag-link-595 tag-link-position-27']"
        );
        public static By buttonRadioRockFmPage = By.xpath("//a[@title='Radijo stotis internetu: Rock FM']");
        public static By buttonPlayRockFmGreenStationBlockx = By.xpath(
                "//div[@class='cellx center']//*[@data-station-id='4717']"
        );
        public static By paragraphPageHeaderTitleRadijoStotisRockFm = By.xpath(
                "//h1[@class='page-title max_width_991_mb_5']"
        );
        public static By paragraphPageDescriptionRockFm = By.xpath("//div[@itemprop='description']");
        public static By buttonPlayRadioRockFmNewWindow = By.xpath("//i[@class='far fa-play-circle']");

    }
}

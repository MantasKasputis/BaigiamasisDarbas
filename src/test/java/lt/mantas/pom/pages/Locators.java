package lt.mantas.pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Radijo {
        public static By titleLogoText = By.xpath("//*[@class='text']");
        public static By menuOptionRadijas = By.xpath("(//span[@class='title'])[1]");
        public static By paragraphHomeHeaderTitle = By.xpath("//*[@class='page-title max_width_991_mb_5']");
        public static By buttonRadijoStociuPaieska = By.xpath("(//*[@data-type='standart'])[1]");
        public static By dropBoxSelectionRusiavimas = By.xpath(
                "//span[@id='select2-swp_faceted_search_one-sorting-container']"
        );
        public static By buttonZanraiIrKategorijos = By.xpath("//a[@title='Žanrai ir Kategorijos']");
        public static By buttonOnAir = By.xpath("//a[@title='On Air']");
        public static By fieldSortByRusiavimas = By.xpath("(//input[@class='select2-search__field'])[4]");
        public static By fieldSearchIeskotiPagalPavadinima = By.xpath(
                "//input[@id='swp_faceted_search_one-searchbox']"
        );
        public static By fieldSearchValstybes = By.xpath("(//input[@class='select2-search__field'])[1]");
        public static By fieldSearchMiestai = By.xpath("(//input[@class='select2-search__field'])[2]");
        public static By fieldSearchMZanrai = By.xpath("(//input[@class='select2-search__field'])[3]");
    }

    public static class ZanraiIrKategorijos {
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
        public static By buttonStopPlayRadioRockFmNewWindow = By.xpath(
                "//a[@class='btn_play_stop btn_radio_player_play_stop mr-10 playing']"
        );
    }

    public static class OnAir {
        public static By latestTopFirstMusicVideoInOnAirPage = By.xpath(
                "(//span[@class='cursor youtube_iframe '])[1]"
        );
        public static By latestTopTenthMusicVideoInOnAirPage = By.xpath(
                "(//span[@class='cursor youtube_iframe'])[10]"
        );
        public static By closeButtonOnVideo = By.xpath(
                "(//i[@class='fa fa-times-circle-o  modal-close cursor hover'])[1]"
        );
    }
}

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
    public static class RadijoStotys{
        public static By buttonPageRockFm = By.xpath("(//*[@class='portlet blue box station'])[17]");
    }
}

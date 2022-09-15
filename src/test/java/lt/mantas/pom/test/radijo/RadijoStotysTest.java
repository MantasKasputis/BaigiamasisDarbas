package lt.mantas.pom.test.radijo;

import lt.mantas.pom.pages.radijo.RadijoStotysPages;
import lt.mantas.pom.test.TestBase;
import org.testng.annotations.Test;

public class RadijoStotysTest extends TestBase {

    @Test
    public void testRockFmPlayability(){

        RadijoStotysPages.clickOnStationRockFmFromHomepage();

    }
}

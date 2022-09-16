package lt.mantas.pom.test;

import lt.mantas.pom.pages.Common;
import lt.mantas.pom.utils.TestListener;
import org.testng.annotations.*;

@Listeners(TestListener.class)
public class TestBase {

    @BeforeClass
    public void setUp(){
        Common.openUrl("https://www.radijo.lt/");
    }

    @AfterClass
    public void tearDown() {
        Common.closeDriver();
    }
}

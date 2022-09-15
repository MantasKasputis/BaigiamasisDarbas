package lt.mantas.pom.test;

import lt.mantas.pom.pages.Common;
import lt.mantas.pom.utils.TestListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class TestBase {

    @BeforeTest
    public void setUp(){
        Common.openUrl("https://www.radijo.lt/");
    }

    @AfterTest
    public void tearDown() {
        Common.closeDriver();
    }
}

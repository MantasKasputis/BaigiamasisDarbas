package lt.mantas.pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class Driver {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver.set(new FirefoxDriver(options()));
        driver.get().manage().window().maximize();
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static FirefoxOptions options(){
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("layout.css.devPixelsPerPx", "0.7");
        return options;
    }

    public static void quitDriver() {
        driver.get().manage().deleteAllCookies();
        driver.get().quit();
        driver.remove();
    }
}
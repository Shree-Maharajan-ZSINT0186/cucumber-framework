package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = System.getProperty("firefox", "chrome").toLowerCase();
//            boolean isHeadless = System.getProperty("headless", "false").equalsIgnoreCase("true");

            switch (browser) {
                case "chrome":

                    WebDriverManager.chromedriver().driverVersion("136.0.7103.114").setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
//                    if (isHeadless) {
//                        chromeOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080");
//                    }
                    driver = new ChromeDriver(chromeOptions);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
//                    if (isHeadless) {
//                        firefoxOptions.addArguments("--headless");
//                    }
                    driver = new FirefoxDriver(firefoxOptions);
                    break;

                default:
                    throw new IllegalArgumentException("Browser not supported: " + browser);
            }

            driver.manage().window().maximize();
        }

        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

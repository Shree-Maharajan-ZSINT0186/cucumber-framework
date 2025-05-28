package utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
private static WebDriver driver;
public static WebDriver getDriver(){
    if(driver==null){
        WebDriverManager.chromedriver().driverVersion("136.0.7103.114").setup();
        driver = new ChromeDriver();

    }
    return driver;
}

public static void quiteDriver(){
    if(driver!=null){
        driver.quit();
        driver=null;
    }

}

}

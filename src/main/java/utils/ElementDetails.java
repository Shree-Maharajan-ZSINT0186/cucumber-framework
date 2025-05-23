package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementDetails {
    WebDriver driver;
    WebDriverWait wait;
    public ElementDetails(WebDriver driver) {
        this.driver=driver;
        this.wait =new WebDriverWait(driver, Duration.ofSeconds(15));
    }

public void waitForVisibility(By locator,int seconds){
        new WebDriverWait(driver,Duration.ofSeconds(seconds))
   .until(ExpectedConditions.visibilityOfElementLocated(locator));
}

public void setText(By locator,String text){
    WebElement element= driver.findElement(locator);
    element.click();
}

public void ClickElement(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
}

}

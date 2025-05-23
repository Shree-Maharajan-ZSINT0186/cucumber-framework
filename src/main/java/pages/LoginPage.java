package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementDetails;

public class LoginPage extends ElementDetails {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }

    private final By emailFeild=By.name("email");
    private final  By passwordFeild=By.name("password");
    private final  By loginButton=By.xpath("//button[@type='submit']");

   public  void  enterEmail(String email){
       waitForVisibility(emailFeild,30);
       setText(emailFeild,email);
   }
    public  void  enterPassword(String password){
        waitForVisibility(passwordFeild,30);
        setText(passwordFeild,password);
    }
    public void enterLogin(){
        ClickElement(loginButton);
    }


}

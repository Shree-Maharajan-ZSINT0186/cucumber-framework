package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v134.page.Page;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginStepDef {
     WebDriver driver;
    LoginPage  loginPage;

    @Given("user is on login page")
    public void user_is_on_login_page() {
    driver= DriverFactory.getDriver();
    loginPage= new LoginPage(driver);
    driver.get("https://automationexercise.com/login");
    }
    @And("user enters {string}  and {string}")
    public void user_enters_email_password(String email,String password){
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }
    @Then("user clicks login button")
    public void user_clicks_login_button(){
        loginPage.enterLogin();
    }



}

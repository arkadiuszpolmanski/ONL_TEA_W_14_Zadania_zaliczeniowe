package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    private static WebDriver driver;

    WebElement signInLink;

    public LandingPage(WebDriver driver){
        this.driver = driver;
        signInLink = driver.findElement(By.className("user-info"));
    }

    public void clickOnSignIn(){
        signInLink.click();
    }
}

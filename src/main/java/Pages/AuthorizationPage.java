package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthorizationPage {

    WebDriver driver;

    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void userLogin(){

        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement signInButton = driver.findElement(By.id("submit-login"));

        email.sendKeys("test@tester.pl");
        password.sendKeys("12345");
        signInButton.click();

    }
}

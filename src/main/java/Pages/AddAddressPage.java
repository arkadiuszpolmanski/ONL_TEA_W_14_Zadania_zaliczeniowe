package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddAddressPage {

    WebDriver driver;

    public AddAddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void newAddressPage(){

        WebElement addressesLink = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/a[2]/span"));
        addressesLink.click();

        WebElement createAddressButton = driver.findElement(By.cssSelector("#content > div.addresses-footer > a > span"));
        createAddressButton.click();
    }

    public void addAddress(String alias, String address, String city, String postcode, String country, String phone){

        WebElement aliasW = driver.findElement(By.name("alias"));
        WebElement addressW = driver.findElement(By.name("address1"));
        WebElement cityW = driver.findElement(By.name("city"));
        WebElement postcodeW = driver.findElement(By.name("postcode"));
        WebElement countryW = driver.findElement(By.name("id_country"));
        WebElement phoneW = driver.findElement(By.name("phone"));
        WebElement submitButton = driver.findElement(By.className("btn"));

        aliasW.sendKeys(alias);
        addressW.sendKeys(address);
        cityW.sendKeys(city);
        postcodeW.sendKeys(postcode);
        countryW.sendKeys(country);
        phoneW.sendKeys(phone);
        submitButton.click();

    }

    public String getAddressFieldBox(){
        WebElement addressFormBox = driver.findElement(By.className("address"));
        return addressFormBox.getText();
    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinishDealPage {

    WebDriver driver;

    public FinishDealPage(WebDriver driver) {
        this.driver = driver;
    }

    public void proceedToCheckout(){

        WebElement proceedToCheckout = driver.findElement(By.className("btn-primary"));
        proceedToCheckout.click();

    }

    public void confirmAddress(){

        WebElement confirmAddress = driver.findElement(By.name("confirm-addresses"));
        confirmAddress.click();

    }

    public void shippingMethod(){

        WebElement shippingMethod = driver.findElement(By.id("delivery_option_1"));
        shippingMethod.isSelected();

        WebElement submitButton = driver.findElement(By.name("confirmDeliveryOption"));
        submitButton.click();
    }

    public void payment() {

        WebElement checkPayment = driver.findElement(By.id("payment-option-1"));
        checkPayment.click();

        WebElement agree = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        agree.click();

        WebElement orderButton = driver.findElement(By.cssSelector("#payment-confirmation > div.ps-shown-by-js > button"));
        orderButton.click();

    }
}

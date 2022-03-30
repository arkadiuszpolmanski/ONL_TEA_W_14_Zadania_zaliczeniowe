package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductParametersPage {

    WebDriver driver;

    public ProductParametersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void productParameters(String size, String quantity) throws InterruptedException {

        WebElement sizeParameter = driver.findElement(By.id("group_1"));
        sizeParameter.sendKeys(size);

        WebElement quantityParameter = driver.findElement(By.id("quantity_wanted"));
        quantityParameter.clear();
        quantityParameter.sendKeys(quantity);

        WebElement addToCart = driver.findElement(By.className("add"));
        addToCart.click();

        Thread.sleep(2000);

        WebElement proceedToCheckout = driver.findElement(By.className("btn-primary"));
        proceedToCheckout.submit();

    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchProductPage {

    WebDriver driver;

    public SearchProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String name){

        WebElement searchEngine = driver.findElement(By.name("s"));
        searchEngine.sendKeys(name);
        searchEngine.submit();

        WebElement product = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/a/img"));
        product.click();


    }
}

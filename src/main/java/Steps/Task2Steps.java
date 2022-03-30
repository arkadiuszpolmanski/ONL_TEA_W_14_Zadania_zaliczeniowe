package Steps;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Task2Steps {

    WebDriver driver;

    @Given("User is on {string}")
    public void userIsOn(String url) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @And("User is login")
    public void userIsLogin() {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnSignIn();

        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.userLogin();
    }

    @When("User searches and clicks on {string}")
    public void userSearchesAndClicksOn(String product) {
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        searchProductPage.searchProduct(product);
    }

    @And("User is dying out in {string}, {string} and add to cart")
    public void userIsDyingOutInAndAddToCart(String size, String quantity) throws InterruptedException {
        ProductParametersPage productParametersPage = new ProductParametersPage(driver);
        productParametersPage.productParameters(size,quantity);
    }

    @And("User is finishing deal")
    public void userIsFinishingDeal() {
        FinishDealPage finishDealPage = new FinishDealPage(driver);
        finishDealPage.proceedToCheckout();

        finishDealPage.confirmAddress();

        finishDealPage.shippingMethod();

        finishDealPage.payment();
    }

    @Then("User has purchased a product")
    public void userHasPurchasedAProduct() throws IOException {
        ScreenshotPage screenshotPage = new ScreenshotPage(driver);
        screenshotPage.makeScreenshot();

        driver.quit();
    }

}

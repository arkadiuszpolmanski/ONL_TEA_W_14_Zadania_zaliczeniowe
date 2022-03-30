package Steps;

import Pages.AddAddressPage;
import Pages.AuthorizationPage;
import Pages.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1Steps {

    WebDriver driver;

    @Given("User is on {string} page")
    public void userIsOnPage(String url) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @And("User clicks button Sign In and login")
    public void userClicksButtonSignInAndLogin() {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnSignIn();

        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.userLogin();
    }

    @When("User clicks button Addresses and click button Create new address")
    public void userClicksButtonAddressesAndClickButtonCreateNewAddress() {
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        addAddressPage.newAddressPage();
    }

    @And("User types address form {string} {string} {string} {string} {string} {string} and click button save")
    public void userTypesAddressFormAndClickButtonSave(String alias, String address, String city, String postcode, String country, String phone) {
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        addAddressPage.addAddress(alias, address, city, postcode, country, phone);
    }

    @Then("Confirm a new address {string} {string} {string} {string} {string} {string}")
    public void confirmANewAddress(String alias, String address, String city, String postcode, String country, String phone) {

        AddAddressPage addAddressPage = new AddAddressPage(driver);
        String addressTextField = addAddressPage.getAddressFieldBox();
        System.out.println(addressTextField);


        Assert.isTrue(addressTextField.contains(alias),"false");
        Assert.isTrue(addressTextField.contains(address),"false");
        Assert.isTrue(addressTextField.contains(city),"false");
        Assert.isTrue(addressTextField.contains(postcode),"false");
        Assert.isTrue(addressTextField.contains(country),"false");
        Assert.isTrue(addressTextField.contains(phone),"false");

        driver.quit();
    }
}

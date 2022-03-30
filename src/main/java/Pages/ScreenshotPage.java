package Pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotPage {

    WebDriver driver;

    public ScreenshotPage(WebDriver driver) {
        this.driver = driver;
    }

    public void makeScreenshot() throws IOException {

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(source, new File("src/main/java/Screenshots/Screen.png"));


    }
}

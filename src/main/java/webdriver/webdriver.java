package webdriver;

import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

public class webdriver {

    private static WebDriver driver;

    public static WebDriver getChromeDriver() {
        driver = WebDriverSupliter.getChromeDriver();
        return driver;
    }

}

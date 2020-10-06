import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static webdriver.webdriver.getChromeDriver;

public class PersonalInformation {
    public static void Information(String firstname, String lastname,String old_passwd,String passwd,
                                   String confirmation){
        WebDriver driver = getChromeDriver();

        /*Se actualizan los datos personales del usuario*/
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys(firstname);
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys(lastname);
        driver.findElement(By.id("old_passwd")).clear();
        driver.findElement(By.id("old_passwd")).sendKeys(old_passwd);
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys(passwd);
        driver.findElement(By.id("confirmation")).clear();
        driver.findElement(By.id("confirmation")).sendKeys(confirmation);
        driver.findElement(By.id("newsletter")).click();
        /*Se actualizan los datos personales del usuario*/
        driver.findElement(By.cssSelector(".button-medium:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".columns-container")).click();

    }
}
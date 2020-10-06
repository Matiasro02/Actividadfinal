import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static webdriver.webdriver.getChromeDriver;
public class login {

    public static void authentication(String email, String password){
        WebDriver driver = getChromeDriver();

        /*Se inicia sesión en la aplicación*/
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
    }
}
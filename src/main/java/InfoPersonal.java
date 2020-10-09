
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WebDriverSupliter.getChromeDriver;

public class InfoPersonal {

    public static void DatosPersona(String firstName, String lastName,String password, String newPass, String newPassConfirm){
        WebDriver driver = getChromeDriver();

        driver.findElement(By.cssSelector("li:nth-child(4) span:nth-child(2)")).click();

        driver.findElement(By.id("firstname")).sendKeys(firstName);
        driver.findElement(By.id("lastname")).sendKeys(lastName);
        driver.findElement(By.id("old_passwd")).sendKeys(password);
        driver.findElement(By.id("passwd")).sendKeys(newPass);
        driver.findElement(By.id("confirmation")).sendKeys(newPassConfirm);
        driver.findElement(By.id("newsletter")).click();

        driver.findElement(By.cssSelector(".button-medium:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".columns-container")).click();

    }
}

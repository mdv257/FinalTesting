import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdatePersonalInformation {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {

        driver = WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {

        WebDriverSupliter.quitDriver();
    }

    @Test
    public void adasd() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

       Login.LoginUsuario("maxiv89@gmail.com", "maxi1234");

       InfoPersonal.DatosPersona("Maximiliano", "Vrancken", "maxi1234", "maxi4321", "maxi4321");


        /*Se valida el mensaje del sistema luego de guardar los cambios*/
        assertEquals("Your personal information has been successfully updated.", driver.findElement(By.cssSelector(".alert")).getText());
    }
}

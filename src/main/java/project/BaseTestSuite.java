package project;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.junit.Before;
import ui.Operaciones;
import ui.Suma;

import java.util.concurrent.TimeUnit;


public class BaseTestSuite {
    WebDriver firefoxDriver;

    Suma suma;
    Operaciones operaciones;

    private void inicializarPaginas(WebDriver driver) {

        suma = new Suma(driver);
        operaciones = new Operaciones(driver);

    }

    @Before
    public void openBroswer() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\mera800240\\IdeaProjects\\Serenity\\calculator\\src\\main\\resources\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("calculator", false);
        firefoxDriver = new FirefoxDriver(options);
        firefoxDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        inicializarPaginas(firefoxDriver);
        firefoxDriver.get("http://localhost");
    }

    @After
    public void closeDriver() {

        firefoxDriver.quit();

    }
}




package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Suma {
    @FindBy(xpath = "//button[@class='Button' and contains(text(),'1')]")
    WebElement uno;

    @FindBy(xpath = "//button[@class='Button' and contains(text(),'2')]")
    WebElement dos;


    @FindBy(xpath = "//button[@class='Button' and contains(text(),'+')]")
    WebElement suma;

    @FindBy(xpath = "//input[@class='DisplayText']")
    WebElement resultado;

    public void setUno() {
        uno.click();
    }

    public void setDos() {
        dos.click();
    }

    public void setSuma() {
        suma.click();
    }
    public void setResultado() {
        resultado.click();
    }

    public void sumar(){
        setUno();
        setSuma();
        setDos();
        setResultado();
    }
    public Suma(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

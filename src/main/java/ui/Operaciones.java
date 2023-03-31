package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Operaciones {

    @FindBy(xpath = "//button[@class='Button' and contains(text(),'1')]")
    WebElement uno;

    @FindBy(xpath = "//button[@class='Button' and contains(text(),'2')]")
    WebElement dos;

    @FindBy(xpath = "//button[@class='Button' and contains(text(),'3')]")
    WebElement tres;

    @FindBy(xpath = "//button[@class='Button' and contains(text(),'4')]")
    WebElement cuatro;

    @FindBy(xpath = "//button[@class='Button' and contains(text(),'5')]")
    WebElement cinco;

    @FindBy(xpath = "//button[@class='Button' and contains(text(),'6')]")
    WebElement seis;

    @FindBy(xpath = "//button[@class='Button' and contains(text(),'7')]")
    WebElement siete;

    @FindBy(xpath = "//button[@class='Button' and contains(text(),'8')]")
    WebElement ocho;

    @FindBy(xpath = "//button[@class='Button' and contains(text(),'9')]")
    WebElement nueve;

    @FindBy(xpath = "//button[@class='Button' and contains(text(),'0')]")
    WebElement cero;

    @FindBy(xpath = "//button[@class='Button' and contains(text(),'=')]")
    WebElement igual;

    @FindBy(xpath = "//button[@class='Button' and contains(text(),'/')]")
    WebElement division;

    @FindBy(xpath = "//button[@class='Button' and contains(text(),'*')]")
    WebElement multiplicar;

    @FindBy(xpath = "//button[@class='Button' and contains(text(),'-')]")
    WebElement resta;

    @FindBy(xpath = "//button[@class='Button' and contains(text(),'+')]")
    WebElement suma;

    @FindBy(xpath = "//input[@id='delete']")
    WebElement delete;

    @FindBy(xpath = "//button[@class='Button'and contains(text(),'.')]")
    WebElement punto;

    @FindBy(xpath = "//input[@class='DisplayText']")
    WebElement resultado;

    public void setUno(String n1) {
        uno.sendKeys(n1);
    }

    public void setDos(String n2) {
        dos.sendKeys(n2);
    }

    public void setTres(String n3) {
        tres.sendKeys(n3);
    }

    public void setCuatro(String n4) {
        cuatro.sendKeys(n4);
    }

    public void setCinco(String n5) {
        cinco.sendKeys(n5);
    }

    public void setSeis(String n6) {
        seis.sendKeys(n6);
    }

    public void setSiete(String n7) {
        siete.sendKeys(n7);
    }

    public void setOcho(String n8) {
        ocho.sendKeys(n8);
    }

    public void setNueve(String n9) {
        nueve.sendKeys(n9);
    }

    public void setCero(String n0) {
        cero.sendKeys(n0);
    }

    public void setIgual(String igu) {
        igual.sendKeys(igu);
    }

    public void setDivision(String div) {
        division.sendKeys(div);
    }

    public void setMultiplicar(String multi) {
        multiplicar.sendKeys(multi);
    }

    public void setResta(String res) {
        resta.sendKeys(res);
    }

    public void setSuma(String sum) {
        suma.sendKeys(sum);
    }

    public void setDelete(String delet) {
        delete.sendKeys(delet);
    }

    public void setPunto(String punt) {
        punto.sendKeys(punt);
    }

    public void setResultado(String result) {
        resultado.click();
    }

    public void datos(String uno, String dos, String tres, String cuatro, String cinco, String seis, String siete, String ocho, String nueve, String cero, String igual, String dividir, String multiplicar, String resta, String suma, String delete, String punto, String resultado) {
        setUno(uno);
        setDos(dos);
        setTres(tres);
        setCuatro(cuatro);
        setCinco(cinco);
        setSeis(seis);
        setSiete(siete);
        setOcho(ocho);
        setNueve(nueve);
        setCero(cero);
        setIgual(igual);
        setDivision(dividir);
        setMultiplicar(multiplicar);
        setResta(resta);
        setSuma(suma);
        setDelete(delete);
        setResultado(resultado);
        setPunto(punto);
        setResultado(resultado);

    }

    public Operaciones(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void setSuma(String uno, String suma, String dos, String resultado) {
        setUno(uno);
        setSuma(suma);
        setDos(dos);
        setResultado(resultado);
    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Anasayfa {

    public Anasayfa (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"cookieseal-banner\"]/div/button[2]")
    public WebElement anladimCookie;

    @FindBy(xpath = "//span[@data-bind-menu='notification|text_editing']")
    public WebElement firsatKutusu;

    @FindBy(xpath = "//a[@href='https://www.lcwaikiki.com/tr-TR/TR/lp/32-33-erkek']")
    public WebElement erkekKategoriSecim;

    @FindBy(xpath = "//span[text()='Sepetim']")
    public WebElement sepetimButonu;

    @FindBy(xpath = "//a[@class='main-header-logo']")
    public WebElement anaBaslikLogosu;


}

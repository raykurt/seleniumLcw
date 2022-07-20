package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ErkekTisortler {

    public ErkekTisortler(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h5[text()='Bisiklet Yaka Kısa Kollu Basic Erkek Tişört']")
    public WebElement bisikletYakaBasicTisort;

    @FindBy(xpath = "//a[@size='2XL']")
    public WebElement beden2XL;

    @FindBy(id = "pd_add_to_cart")
    public WebElement sepeteEkleButonu;

}

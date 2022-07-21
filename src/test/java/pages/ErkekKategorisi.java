package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ErkekKategorisi {

    public ErkekKategorisi(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='https://www.lcwaikiki.com/tr-TR/TR/etiket/erkek-trend-giyim-tisort']")
    public WebElement erkekTisortSecim;
}

package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Anasayfa;
import pages.ErkekKategorisi;
import pages.ErkekTisortler;
import utilities.Driver;


public class StepDefs {

    Anasayfa anasayfaObject = new Anasayfa();
    ErkekKategorisi erkekKategoriObject = new ErkekKategorisi();
    ErkekTisortler erkekTisortObject = new ErkekTisortler();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

    @Given("kullanici lcwaikiki sayfasina gider")
    public void kullanici_lcwaikiki_sayfasina_gider() {
        Driver.getDriver().navigate().to("https://www.lcwaikiki.com/tr-TR/TR");
        wait.until(ExpectedConditions.elementToBeClickable(anasayfaObject.anladimCookie));
        anasayfaObject.anladimCookie.click();
    }

    @Then("kullanici lcwaikiki sayfasini dogrular")
    public void kullanici_lcwaikiki_sayfasini_dogrular() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "LC Waikiki | İlk Alışverişte Kargo Bedava! - LC Waikiki");
    }

    @Given("kullanici erkek kategori sayfasina gider")
    public void kullanici_erkek_kategori_sayfasina_gider() {
        wait.until(ExpectedConditions.elementToBeClickable(anasayfaObject.erkekKategoriSecim));
        anasayfaObject.erkekKategoriSecim.click();
    }

    @Then("kullanici erkek kategori sayfasini dogrular")
    public void kullanici_erkek_kategori_sayfasini_dogrular() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Erkek Giyim - Erkek Kıyafetleri - LC Waikiki");
    }

    @Given("kullanici tisort urun sayfasina gider")
    public void kullanici_tisort_urun_sayfasina_gider() {
        wait.until(ExpectedConditions.elementToBeClickable(erkekKategoriObject.erkekTisortSecim));
        erkekKategoriObject.erkekTisortSecim.click();
    }

    @Then("kullanici tisort urun sayfasini dogrular")
    public void kullanici_tisort_urun_sayfasini_dogrular() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Trend Tişörtler - LC Waikiki");
    }

    @And("kullanici bisiklet yaka basic tisort sepete ekleme")
    public void kullanici_bisiklet_yaka_basic_tisort_sepete_ekleme() {
        wait.until(ExpectedConditions.elementToBeClickable(erkekTisortObject.bisikletYakaBasicTisort));
        erkekTisortObject.bisikletYakaBasicTisort.click();
        Driver.waitAndClick(erkekTisortObject.beden2XL);
        wait.until(ExpectedConditions.elementToBeClickable(erkekTisortObject.sepeteEkleButonu));
        erkekTisortObject.sepeteEkleButonu.click();
    }

    @Given("kullanici sepet sayfasina gider")
    public void kullanici_sepet_sayfasina_gider() {
        wait.until(ExpectedConditions.elementToBeClickable(anasayfaObject.sepetimButonu));
        anasayfaObject.sepetimButonu.click();
    }

    @Then("kullanici sepet sayfasini dogrular")
    public void kullanici_sepet_sayfasini_dogrular() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Sepetim - LC Waikiki");
    }

    @Given("kullanici anasayfaya doner")
    public void kullanici_anasayfaya_doner() {
        wait.until(ExpectedConditions.elementToBeClickable(anasayfaObject.anaBaslikLogosu));
        anasayfaObject.anaBaslikLogosu.click();
    }

    @Then("kullanici anasayfaya dondugunu dogrular")
    public void kullanici_anasayfaya_dondugunu_dogrular() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "LC Waikiki | İlk Alışverişte Kargo Bedava! - LC Waikiki");
        Driver.closeDriver();
    }

}

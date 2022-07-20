package stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.Anasayfa;
import pages.ErkekKategorisi;
import pages.ErkekTisortler;
import utilities.Driver;


public class StepDefs {

    Anasayfa anasayfaObject = new Anasayfa();
    ErkekKategorisi erkekKategoriObject = new ErkekKategorisi();
    ErkekTisortler erkekTisortObject = new ErkekTisortler();

    @Given("kullanici lcwaikiki sayfasina gider")
    public void kullanici_lcwaikiki_sayfasina_gider() {
        Driver.getDriver().navigate().to("https://www.lcwaikiki.com/tr-TR/TR");
        Driver.waitAndClick(anasayfaObject.anladimCookie);
        Driver.waitAndClick(anasayfaObject.firsatKutusu);
    }

    @Then("kullanici lcwaikiki sayfasini dogrular")
    public void kullanici_lcwaikiki_sayfasini_dogrular() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "LC Waikiki | İlk Alışverişte Kargo Bedava! - LC Waikiki");
    }

    @Given("kullanici erkek kategori sayfasina gider")
    public void kullanici_erkek_kategori_sayfasina_gider() {
        Driver.waitAndClick(anasayfaObject.erkekKategoriSecim);
    }

    @Then("kullanici erkek kategori sayfasini dogrular")
    public void kullanici_erkek_kategori_sayfasini_dogrular() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Erkek Giyim - Erkek Kıyafetleri - LC Waikiki");
    }

    @Given("kullanici tisort urun sayfasina gider")
    public void kullanici_tisort_urun_sayfasina_gider() {
        Driver.waitAndClick(erkekKategoriObject.erkekTisortSecim);
    }

    @Then("kullanici tisort urun sayfasini dogrular")
    public void kullanici_tisort_urun_sayfasini_dogrular() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Trend Tişörtler - LC Waikiki");
    }

    @And("kullanici bisiklet yaka basic tisort sepete ekleme")
    public void kullanici_bisiklet_yaka_basic_tisort_sepete_ekleme() {
        Driver.waitAndClick(erkekTisortObject.bisikletYakaBasicTisort);
        Driver.waitAndClick(erkekTisortObject.beden2XL);
        Driver.waitAndClick(erkekTisortObject.sepeteEkleButonu);
    }

    @Given("kullanici sepet sayfasina gider")
    public void kullanici_sepet_sayfasina_gider() {
        Driver.waitAndClick(anasayfaObject.sepetimButonu);
    }

    @Then("kullanici sepet sayfasini dogrular")
    public void kullanici_sepet_sayfasini_dogrular() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Sepetim - LC Waikiki");
    }

    @Given("kullanici anasayfaya doner")
    public void kullanici_anasayfaya_doner() {
        Driver.waitAndClick(anasayfaObject.anaBaslikLogosu);
    }

    @Then("kullanici anasayfaya dondugunu dogrular")
    public void kullanici_anasayfaya_dondugunu_dogrular() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "LC Waikiki | İlk Alışverişte Kargo Bedava! - LC Waikiki");
        Driver.closeDriver();
    }

}

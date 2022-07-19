package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Anasayfa;
import utilities.Driver;


public class StepDefs {

    Anasayfa anasayfa = new Anasayfa();

    @Given("kullanici lcwaikiki sayfasina gider")
    public void kullanici_lcwaikiki_sayfasina_gider() {
        Driver.getDriver().navigate().to("https://www.lcwaikiki.com/tr-TR/TR");
        anasayfa.anladimCookie.click();
    }

    @Then("kullanici lcwaikiki sayfasini dogrular")
    public void kullanici_lcwaikiki_sayfasini_dogrular() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "LC Waikiki | İlk Alışverişte Kargo Bedava! - LC Waikiki");
    }

    @Given("kullanici erkek kategori sayfasina gider")
    public void kullanici_erkek_kategori_sayfasina_gider() {

    }

    @Then("kullanici erkek kategori sayfasini dogrular")
    public void kullanici_erkek_kategori_sayfasini_dogrular() {

    }

    @Given("kullanici ayakkabi urun sayfasina gider")
    public void kullanici_ayakkabi_urun_sayfasina_gider() {

    }

    @Then("kullanici ayakkabi urun sayfasini dogrular")
    public void kullanici_ayakkabi_urun_sayfasini_dogrular() {

    }

    @Given("kullanici file detayli ayakkabiyi sepete ekleme")
    public void kullanici_file_detayli_ayakkabiyi_sepete_ekleme() {

    }

    @Then("kullanici dogru urunu sepete ekledigini dogrular")
    public void kullanici_dogru_urunu_sepete_ekledigini_dogrular() {

    }

    @Given("kullanici sepet sayfasina gider")
    public void kullanici_sepet_sayfasina_gider() {

    }

    @Then("kullanici sepet sayfasini dogrular")
    public void kullanici_sepet_sayfasini_dogrular() {

    }

    @Given("kullanici anasayfaya doner")
    public void kullanici_anasayfaya_doner() {

    }

    @Then("kullanici anasayfaya dondugunu dogrular")
    public void kullanici_anasayfaya_dondugunu_dogrular() {

    }

}

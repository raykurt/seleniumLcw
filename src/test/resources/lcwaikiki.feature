@lcwaikiki
Feature: LC Waikiki Project

  @lcwSayfasinaGidis
  Scenario: LC Waikiki Sayfasina Giris
    Given kullanici lcwaikiki sayfasina gider
    Then kullanici lcwaikiki sayfasini dogrular

  @kategoriSecimi
  Scenario: Kategori Secimi
    Given kullanici erkek kategori sayfasina gider
    Then kullanici erkek kategori sayfasini dogrular

  @urunSecimi
  Scenario: Urun Secimi
    Given kullanici ayakkabi urun sayfasina gider
    Then kullanici ayakkabi urun sayfasini dogrular

  @urunuSepeteEkleme
  Scenario: Urun Sepete Ekleme
    Given kullanici file detayli ayakkabiyi sepete ekleme
    Then kullanici dogru urunu sepete ekledigini dogrular

  @sepeteGidis
  Scenario: Sepete Gidis
    Given kullanici sepet sayfasina gider
    Then kullanici sepet sayfasini dogrular

  @anasayfayaDonus
  Scenario: Anasayfaya Donus
    Given kullanici anasayfaya doner
    Then kullanici anasayfaya dondugunu dogrular
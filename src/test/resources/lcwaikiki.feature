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

  @urunSecSepeteEkle
  Scenario: Urun Secimi
    Given kullanici tisort urun sayfasina gider
    Then kullanici tisort urun sayfasini dogrular
    And kullanici bisiklet yaka basic tisort sepete ekleme

  @sepeteGidis
  Scenario: Sepete Gidis
    Given kullanici sepet sayfasina gider
    Then kullanici sepet sayfasini dogrular

  @anasayfayaDonus
  Scenario: Anasayfaya Donus
    Given kullanici anasayfaya doner
    Then kullanici anasayfaya dondugunu dogrular
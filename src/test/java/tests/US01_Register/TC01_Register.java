package tests.US01_Register;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC01_Register extends ExtentReport {

   String name=ReusableMethods.onikiKarakterliKullaniciAdiGirisi();

     public static Actions action ;
    public static AllovercommercePage page;

    @Test
    public void test01() {
        // anasayfaya git
        extentTest = extentReports.createTest("TestNGTeam02", "Allovercommerce test edebilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce Sayfasina Gidildi.");

        //Register butonuna tıkla
        page = new AllovercommercePage();
        page.register.click();
        extentTest.info("Giris icin SignIn tiklandi.");

        //sayfanin ustunde yer alan Sign up butonunu tıkla
        page.ustSIGNUP.click();
        extentTest.info("sayfanin ustundeki SIGN UP butonuna tiklandi");

        //Username kutucuğuna geçerli bir username gir
        page.Username.sendKeys(name);
        extentTest.info("Username kutucuguna username yazildi.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        page.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        page.Email.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Password kutucuğuna geçerli bir password gir
        ReusableMethods.switchToWindow(1);
        extentTest.info("fakemail sitesine geçildi.");
        page.sahtepasword.click();
        extentTest.info("Fake mail sitesinden sahte password kopyalandı.");
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        page.password.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan sahte password text kutusuna yapıştırıldı");
        // "I agree to the privacy policy" kutucuğuna tıkla
        page.sart.click();
        extentTest.info("'I agree to the privacy policy' kutucuguna tiklandi");
        ReusableMethods.bekle(5);
        //Sign up butonuna tıkla
        page.altSIGNUP.click();
        extentTest.info("sayfanin altindaki SIGN UP butonuna tiklandi");
        ReusableMethods.bekle(5);
        //Kayıt işleminin başarıyla gerçekleştiğini doğrula
        Assert.assertTrue(page.altSIGNUP.isDisplayed());
        extentTest.info("Basarili giris icin SIGN OUT butonunun görüntülenemedi.");
        ReusableMethods.tumSayfaResmi("US01Register1");
        ReusableMethods.bekle(3);
    }
    @Test
      public void test02(){
            // anasayfaya git
        extentTest = extentReports.createTest("TestNGTeam02","Allovercommerce test edebilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce Sayfasina Gidildi.");
        //Register butonuna tıkla
        page = new AllovercommercePage();
        page.register.click();
        extentTest.info("Giris icin SignIn tiklandi.");
        //sayfanin ustunde yer alan Sign up butonunu tıkla
        page.ustSIGNUP.click();
        extentTest.info ("sayfanin ustundeki SIGN UP butonuna tiklandi");
        // sayfanin altinda yer alan Sign up butonunu tıkla
        page.altSIGNUP.click();
        extentTest.info ("sayfanin altindaki SIGN UP butonuna tiklandi");
        ReusableMethods.bekle(3);
       // sayfaya giris yapilamadigiini dogrula
        Assert.assertTrue(page.altSIGNUP.isDisplayed());
        extentTest.info ("Sayfaya giris yapilamamdigi dogrulandi");
        ReusableMethods.tumSayfaResmi("US01Register2");
        ReusableMethods.bekle(3);
        }
        @Test
    public void test03(){
            // anasayfaya git
            extentTest = extentReports.createTest("TestNGTeam02","Allovercommerce test edebilmeli");
            Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
            extentTest.info("Allovercommerce Sayfasina Gidildi.");
            //Register butonuna tıkla
            page = new AllovercommercePage();
            page.register.click();
            extentTest.info("Giris icin SignIn tiklandi.");
            //sayfanin ustunde yer alan Sign up butonunu tıkla
            page.ustSIGNUP.click();
            extentTest.info ("sayfanin ustundeki SIGN UP butonuna tiklandi");
            //Username kutucuğuna geçerli bir username gir
            page.Username.sendKeys(name);
            extentTest.info("Username kutucuguna username yazildi.");
            // sayfanin altinda yer alan Sign up butonunu tıkla
            page.altSIGNUP.click();
            extentTest.info ("sayfanin altindaki SIGN UP butonuna tiklandi");
            //sayfaya giris yapilamadigini dogrula
            Assert.assertTrue(page.altSIGNUP.isDisplayed());
            extentTest.info("Basarili giris icin SIGN OUT butonunun görüntülenemedi.");
            ReusableMethods.tumSayfaResmi("US01Register3");
            ReusableMethods.bekle(3);
        }
@Test
    public void test04(){
    extentTest = extentReports.createTest("TestNGTeam02", "Allovercommerce test edebilmeli");
    Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
    extentTest.info("Allovercommerce Sayfasina Gidildi.");
    //Register butonuna tıkla
    page = new AllovercommercePage();
    page.register.click();
    extentTest.info("Giris icin SignIn tiklandi.");
    //sayfanin ustunde yer alan Sign up butonunu tıkla
    page.ustSIGNUP.click();
    extentTest.info("sayfanin ustundeki SIGN UP butonuna tiklandi");
    //Username kutucuğuna geçerli bir username gir
    page.Username.sendKeys(name);
    extentTest.info("Username kutucuguna username yazildi.");
    //Fake mail sitesini yeni bir sekmede aç
    Driver.getDriver().switchTo().newWindow(WindowType.TAB);
    Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
    extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");
    //Fake maili kopyala
    page.fakeMailCopy.click();
    extentTest.info("Fake mail sitesinden fake mail kopyalandı.");
    //Gecerli e mail adresini girer
    ReusableMethods.switchToWindow(0);
    extentTest.info("Allovercommerce sitesine geçildi.");
    page.Email.sendKeys(Keys.CONTROL, "V");
    extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");
    // sayfanin altinda yer alan Sign up butonunu tıkla
    page.altSIGNUP.click();
    extentTest.info ("sayfanin altindaki SIGN UP butonuna tiklandi");
    //sayfaya giris yapilamadigini dogrula
    Assert.assertTrue(page.altSIGNUP.isDisplayed());
    extentTest.info("Basarili giris icin SIGN OUT butonunun görüntülenemedi.");
    ReusableMethods.tumSayfaResmi("US01Register4");
    ReusableMethods.bekle(3);

}
@Test
    public void test05(){
    // anasayfaya git
    extentTest = extentReports.createTest("TestNGTeam02", "Allovercommerce test edebilmeli");
    Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
    extentTest.info("Allovercommerce Sayfasina Gidildi.");
    //Register butonuna tıkla
    page = new AllovercommercePage();
    page.register.click();
    extentTest.info("Giris icin SignIn tiklandi.");
    //sayfanin ustunde yer alan Sign up butonunu tıkla
    page.ustSIGNUP.click();
    extentTest.info("sayfanin ustundeki SIGN UP butonuna tiklandi");
    //Username kutucuğuna geçerli bir username gir
    page.Username.sendKeys(name);
    extentTest.info("Username kutucuguna username yazildi.");
    //Fake mail sitesini yeni bir sekmede açar
    Driver.getDriver().switchTo().newWindow(WindowType.TAB);
    Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
    extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");
    //Fake maili kopyalar
    page.fakeMailCopy.click();
    extentTest.info("Fake mail sitesinden fake mail kopyalandı.");
    //Gecerli e mail adresini girer
    ReusableMethods.switchToWindow(0);
    extentTest.info("Allovercommerce sitesine geçildi.");
    page.Email.sendKeys(Keys.CONTROL, "V");
    extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");
    //Password kutucuğuna geçerli bir password gir
    ReusableMethods.switchToWindow(1);
    extentTest.info("fakemail sitesine geçildi.");
    page.sahtepasword.click();
    extentTest.info("Fake mail sitesinden sahte password kopyalandı.");
    ReusableMethods.switchToWindow(0);
    extentTest.info("Allovercommerce sitesine geçildi.");
    page.password.sendKeys(Keys.CONTROL, "V");
    extentTest.info("Fake mail sitesinden kopyalanan sahte password text kutusuna yapıştırıldı");
    // sayfanin altinda yer alan Sign up butonunu tıkla
    page.altSIGNUP.click();
    extentTest.info ("sayfanin altindaki SIGN UP butonuna tiklandi");
    //sayfaya giris yapilamadigini dogrula
    Assert.assertTrue(page.altSIGNUP.isDisplayed());
    extentTest.info("Basarili giris icin SIGN OUT butonunun görüntülenemedi.");
    ReusableMethods.tumSayfaResmi("US01Register5");
    ReusableMethods.bekle(3);
}
@Test
    public void test06(){
    // anasayfaya git
    extentTest = extentReports.createTest("TestNGTeam02", "Allovercommerce test edebilmeli");
    Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
    extentTest.info("Allovercommerce Sayfasina Gidildi.");
    //Register butonuna tıkla
    page = new AllovercommercePage();
    page.register.click();
    extentTest.info("Giris icin SignIn tiklandi.");
    //sayfanin ustunde yer alan Sign up butonunu tıkla
    page.ustSIGNUP.click();
    extentTest.info("sayfanin ustundeki SIGN UP butonuna tiklandi");
    //Username kutucuğuna geçerli bir username gir
    page.Username.sendKeys(name);
    extentTest.info("Username kutucuguna username yazildi.");
    //Email kutucuğuna ".com" icermeyen bir Email adresi gir
    page.Email.sendKeys(name);
    extentTest.info("Email kutucuguna '.com' icermeyen bir Email yazildi.");
    //Password kutucuğuna geçerli bir password gir
    page.password.sendKeys(name);
    extentTest.info("password kutucuguna  gecerli bir password yazildi.");
    // "I agree to the privacy policy" kutucuğuna tıkla
    page.sart.click();
    extentTest.info("'I agree to the privacy policy' kutucuguna tiklandi");
    ReusableMethods.bekle(3);
    //Sign up butonuna tıkla
    page.altSIGNUP.click();
    extentTest.info ("sayfanin altindaki SIGN UP butonuna tiklandi");
    //sayfaya giris yapilamadigini dogrula
    Assert.assertTrue(page.altSIGNUP.isDisplayed());
    extentTest.info("Basarili giris icin SIGN OUT butonunun görüntülenemedi.");
    ReusableMethods.tumSayfaResmi("US01Register6");
    ReusableMethods.bekle(3);

}
@Test
    public void test07(){
    // anasayfaya git
    extentTest = extentReports.createTest("TestNGTeam02", "Allovercommerce test edebilmeli");
    Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
    extentTest.info("Allovercommerce Sayfasina Gidildi.");
    //Register butonuna tıkla
    page = new AllovercommercePage();
    page.register.click();
    extentTest.info("Giris icin SignIn tiklandi.");
    //sayfanin ustunde yer alan Sign up butonunu tıkla
    page.ustSIGNUP.click();
    extentTest.info("sayfanin ustundeki SIGN UP butonuna tiklandi");
    //Username kutucuğuna geçerli bir username gir
    page.Username.sendKeys(name);
    extentTest.info("Username kutucuguna username yazildi.");
    //Email kutucuğuna "@" icermeyen bir Email adresi gir
    page.Email.sendKeys(name);
    extentTest.info("Email kutucuguna '@' icermeyen bir Email yazildi.");
    //Password kutucuğuna geçerli bir password gir
    page.password.sendKeys(name);
    extentTest.info("password kutucuguna  gecerli bir password yazildi.");
    // "I agree to the privacy policy" kutucuğuna tıkla
    page.sart.click();
    extentTest.info("'I agree to the privacy policy' kutucuguna tiklandi");
    ReusableMethods.bekle(3);
    //Sign up butonuna tıkla
    page.altSIGNUP.click();
    extentTest.info ("sayfanin altindaki SIGN UP butonuna tiklandi");
    //sayfaya giris yapilamadigini dogrula
    Assert.assertTrue(page.altSIGNUP.isDisplayed());
    extentTest.info("Basarili giris icin SIGN OUT butonunun görüntülenemedi.");
    ReusableMethods.tumSayfaResmi("US01Register6");

}
@Test
    public void test08() {
    // anasayfaya git
    extentTest = extentReports.createTest("TestNGTeam02", "Allovercommerce test edebilmeli");
    Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
    extentTest.info("Allovercommerce Sayfasina Gidildi.");
    //Register butonuna tıkla
    page = new AllovercommercePage();
    page.register.click();
    extentTest.info("Giris icin SignIn tiklandi.");
    //sayfanin ustunde yer alan Sign up butonunu tıkla
    page.ustSIGNUP.click();
    extentTest.info("sayfanin ustundeki SIGN UP butonuna tiklandi");
    //Username kutucuğuna geçerli bir username gir
    page.Username.sendKeys(name);
    extentTest.info("Username kutucuguna username yazildi.");
    //Fake mail sitesini yeni bir sekmede aç
    Driver.getDriver().switchTo().newWindow(WindowType.TAB);
    Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
    extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");
    ReusableMethods.bekle(3);
    //Fake maili kopyala
    page.fakeMailCopy.click();
    extentTest.info("Fake mail sitesinden fake mail kopyalandı.");
    ReusableMethods.bekle(3);
    //Gecerli e mail adresini gir
    ReusableMethods.switchToWindow(0);
    extentTest.info("Allovercommerce sitesine geçildi.");
    page.Email.sendKeys(Keys.CONTROL, "V");
    extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");
    ReusableMethods.bekle(3);
    // Password kutucuğuna sadece rakamlardan olusan bir password gir
    page.password.sendKeys(ConfigReader.getProperty("passwordsayi"));
    extentTest.info("12 den az sadece rakamlardan olusan bir password yazildi.");
    ReusableMethods.bekle(10);
    // "I agree to the privacy policy" kutucuğuna tıkla
    page.sart.click();
    extentTest.info("'I agree to the privacy policy' kutucuguna tiklandi");
    // Sign up butonuna tıklanamadigini dogrula
    Assert.assertFalse(page.altSIGNUP.isEnabled());
    extentTest.info("Sign up butonuna tıklanamadigi dogrulanamadi");
    ReusableMethods.tumSayfaResmi("US01Register7");
    ReusableMethods.bekle(5);

}
@Test
    public void test09(){
    // anasayfaya git
    extentTest = extentReports.createTest("TestNGTeam02", "Allovercommerce test edebilmeli");
    Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
    extentTest.info("Allovercommerce Sayfasina Gidildi.");
    //Register butonuna tıkla
    page = new AllovercommercePage();
    page.register.click();
    extentTest.info("Giris icin SignIn tiklandi.");
    //sayfanin ustunde yer alan Sign up butonunu tıkla
    page.ustSIGNUP.click();
    extentTest.info("sayfanin ustundeki SIGN UP butonuna tiklandi");
    //Username kutucuğuna geçerli bir username gir
    page.Username.sendKeys(name);
    extentTest.info("Username kutucuguna username yazildi.");
    //Fake mail sitesini yeni bir sekmede aç
    Driver.getDriver().switchTo().newWindow(WindowType.TAB);
    Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
    extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");
    ReusableMethods.bekle(3);
    //Fake maili kopyala
    page.fakeMailCopy.click();
    extentTest.info("Fake mail sitesinden fake mail kopyalandı.");
    ReusableMethods.bekle(3);
    //Gecerli e mail adresini gir
    ReusableMethods.switchToWindow(0);
    extentTest.info("Allovercommerce sitesine geçildi.");
    page.Email.sendKeys(Keys.CONTROL, "V");
    extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");
    ReusableMethods.bekle(3);
    // Password kutucuğuna sadece harflerden olusan bir password gir
    page.password.sendKeys(ConfigReader.getProperty("passwordharf"));
    extentTest.info("password kutucuguna sadece harflerden olusan password yazildi.");
    // "I agree to the privacy policy" kutucuğuna tıkla
    page.sart.click();
    extentTest.info("'I agree to the privacy policy' kutucuguna tiklandi");
    // Sign up butonuna tıklanamadigini dogrula
    Assert.assertTrue(page.altSIGNUP.isEnabled());
    extentTest.info("Sign up butonuna tıklanamadigi dogrulanamadi");
    ReusableMethods.tumSayfaResmi("US01Register6");
    ReusableMethods.bekle(5);
}
@Test
    public void test10(){
    // anasayfaya git
    extentTest = extentReports.createTest("TestNGTeam02", "Allovercommerce test edebilmeli");
    Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
    extentTest.info("Allovercommerce Sayfasina Gidildi.");
    //Register butonuna tıkla
    page = new AllovercommercePage();
    page.register.click();
    extentTest.info("Giris icin SignIn tiklandi.");
    //sayfanin ustunde yer alan Sign up butonunu tıkla
    page.ustSIGNUP.click();
    extentTest.info("sayfanin ustundeki SIGN UP butonuna tiklandi");
    //Username kutucuğuna geçerli bir username gir
    page.Username.sendKeys(name);
    extentTest.info("Username kutucuguna username yazildi.");
    //Fake mail sitesini yeni bir sekmede aç
    Driver.getDriver().switchTo().newWindow(WindowType.TAB);
    Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
    extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");
    ReusableMethods.bekle(3);
    //Fake maili kopyala
    page.fakeMailCopy.click();
    extentTest.info("Fake mail sitesinden fake mail kopyalandı.");
    ReusableMethods.bekle(3);
    //Gecerli e mail adresini gir
    ReusableMethods.switchToWindow(0);
    extentTest.info("Allovercommerce sitesine geçildi.");
    page.Email.sendKeys(Keys.CONTROL, "V");
    extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");
    ReusableMethods.bekle(3);
    // Password kutucuğuna 12 karakterden az password gir
    page.password.sendKeys(ConfigReader.getProperty("passwordkisa"));
    extentTest.info("password kutucuguna sadece harflerden olusan password yazildi.");
    // "I agree to the privacy policy" kutucuğuna tıkla
    page.sart.click();
    extentTest.info("'I agree to the privacy policy' kutucuguna tiklandi");
    // Sign up butonuna tıklanamadigini dogrula
    Assert.assertTrue(page.altSIGNUP.isEnabled());
    extentTest.info("Sign up butonuna tıklanamadigi dogrulanamadi");
    ReusableMethods.tumSayfaResmi("US01Register6");
    ReusableMethods.bekle(5);


}
    }


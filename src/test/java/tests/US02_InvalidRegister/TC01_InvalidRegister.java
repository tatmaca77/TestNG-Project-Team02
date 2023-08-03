package tests.US02_InvalidRegister;

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

public class TC01_InvalidRegister extends ExtentReport {

    public static Actions action;
    public static AllovercommercePage page;

   String name=ReusableMethods.onikiKarakterliKullaniciAdiGirisi();

        @Test
        public void test01 () {
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
            //kayitli Username gir
            page.Username.sendKeys(ConfigReader.getProperty("username1"));
            extentTest.info("Username kutucuguna kayitli username girildi");
            //kayitli Email gir
            page.Email.sendKeys(ConfigReader.getProperty("email1"));
            extentTest.info("Email kutucuguna kayitli Email girildi");
            //kayitli Password gir
            page.password.sendKeys(ConfigReader.getProperty("password1"));
            extentTest.info("Password kutucuguna kayitli password girildi");
            // "I agree to the privacy policy" kutucuğuna tıkla
            page.sart.click();
            extentTest.info("'I agree to the privacy policy' kutucuguna tiklandi");
            ReusableMethods.bekle(3);
            //Sign up butonuna tıkla
            page.altSIGNUP.click();
            extentTest.info("sayfanin altindaki SIGN UP butonuna tiklandi");
            ReusableMethods.bekle(3);
            //basarili giris yapilamadigini dogrula
            Assert.assertTrue(page.altSIGNUP.isDisplayed());
            extentTest.info("Sayfaya giris yapilamamdigi dogrulandi");
            // 'An account is already registered with your email address.' gorunur oldugunu dogrula
            Assert.assertTrue(page.alreadymesaji.isDisplayed());
            extentTest.info("'An account is already registered with your email address.' ve 'Please log in' gorunur oldugu dogrulandi");
        }
        @Test
        public void test02() {
            //anasayfaya git
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
            //kayitli olmayan Username gir
            page.Username.sendKeys(name);
            extentTest.info("gecerli olmayan Username girildi");
            //kayitli Email gir
            page.Email.sendKeys(ConfigReader.getProperty("email1"));
            extentTest.info("Email kutucuguna kayitli Email girildi");
            //kayitli Password gir
            page.password.sendKeys(ConfigReader.getProperty("password1"));
            extentTest.info("Password kutucuguna kayitli password girildi");
            // "I agree to the privacy policy" kutucuğuna tıkla
            page.sart.click();
            extentTest.info("'I agree to the privacy policy' kutucuguna tiklandi");
            ReusableMethods.bekle(3);
            //Sign up butonuna tıkla
            page.altSIGNUP.click();
            extentTest.info("sayfanin altindaki SIGN UP butonuna tiklandi");
            ReusableMethods.bekle(3);
            //basarili giris yapilamadigini dogrula
            Assert.assertTrue(page.altSIGNUP.isDisplayed());
            extentTest.info("Sayfaya giris yapilamamdigi dogrulandi");
            // 'An account is already registered with your email address.' gorunur oldugunu dogrula
            Assert.assertTrue(page.alreadymesaji.isDisplayed());
            extentTest.info("'An account is already registered with your email address.' ve 'Please log in' gorunur oldugu dogrulandi");
            //Please Log In' mesajinin gorunur oldugunu dogrula
            Assert.assertTrue(page.pleaseLogInmesaji.isDisplayed());
        }
        @Test
    public void test03() {
            //anasayfaya git
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
            //kayitli Username gir
            page.Username.sendKeys(ConfigReader.getProperty("username1"));
            extentTest.info("Username kutucuguna kayitli username girildi");
            //Fake mail sitesini yeni bir sekmede aç
            Driver.getDriver().switchTo().newWindow(WindowType.TAB);
            Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
            extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");
            //Fake maili kopyala
            page.fakeMailCopy.click();
            extentTest.info("Fake mail sitesinden fake mail kopyalandı.");
            //kayitli olmayan e mail adresini girer
            ReusableMethods.switchToWindow(0);
            extentTest.info("Allovercommerce sitesine geçildi.");
            page.Email.sendKeys(Keys.CONTROL, "V");
            extentTest.info("Fake mail sitesinden kopyalanan mail kayitli olmayan Email text kutusuna yapıştırıldı");
            //password gir
            page.password.sendKeys(ConfigReader.getProperty("password1"));
            extentTest.info("kayitli password girildi.");
            // "I agree to the privacy policy" kutucuğuna tıkla
            page.sart.click();
            extentTest.info("'I agree to the privacy policy' kutucuguna tiklandi");
            ReusableMethods.bekle(3);
            //Sign up butonuna tıkla
            page.altSIGNUP.click();
            extentTest.info("sayfanin altindaki SIGN UP butonuna tiklandi");
            ReusableMethods.bekle(3);
            //basarili giris yapilamadigini dogrula
            Assert.assertTrue(page.altSIGNUP.isDisplayed());
            extentTest.info("Sayfaya giris yapilamamdigi dogrulandi");
            // 'An account is already registered with that username. Please choose another.' gorunur oldugunu dogrula
            Assert.assertTrue(page.alreadymesaji.isDisplayed());
            extentTest.info("'An account is already registered with your email address.' ve 'Please log in' gorunur oldugu dogrulandi");
        }
        @Test
        public void test04(){
                //anasayfaya git
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
                //kayitli password gir
            page.password.sendKeys(ConfigReader.getProperty("username1"));
            extentTest.info("password kutucuguna kayitli password girildi");
            // "I agree to the privacy policy" kutucuğuna tıkla
            page.sart.click();
            extentTest.info("'I agree to the privacy policy' kutucuguna tiklandi");
            ReusableMethods.bekle(3);
            //Sign up butonuna tıkla
            page.altSIGNUP.click();
            extentTest.info("sayfanin altindaki SIGN UP butonuna tiklandi");
            ReusableMethods.bekle(3);
            //basarili giris yapilamadigini dogrula
            Assert.assertTrue(page.altSIGNUP.isDisplayed());
            extentTest.info("Sayfaya giris yapilamamdigi dogrulandi");
            }
    @Test
    public void test05(){
        //anasayfaya git
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
        //Sign up butonuna tıkla
        page.altSIGNUP.click();
        extentTest.info("sayfanin altindaki SIGN UP butonuna tiklandi");
        ReusableMethods.bekle(3);
        //basarili giris yapilamadigini dogrula
        Assert.assertTrue(page.altSIGNUP.isDisplayed());
        extentTest.info("Sayfaya giris yapilamamdigi dogrulandi");

    }
}





